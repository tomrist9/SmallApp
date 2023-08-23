package smallregistrationapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DatabaseManager databaseManager = new DatabaseManager();

        boolean a = true;
        String command = null;
        while (a) {
            System.out.println("Enter the right command : sp, ru, shp, exit");
            command = scanner.nextLine();

            switch (command) {
                case "sp":
                    Person person = createPerson(scanner);
                    databaseManager.savePerson(person);
                    break;

                case "ru":
                    User user = createUser(scanner);
                    databaseManager.registerUser(user);
                case "shp":
                    databaseManager.showPeople();
                    break;
                case "exit":
                    a = false;
                    break;

            }
        }

        System.out.println("Existing the program");
        databaseManager.closeConnection();
    }


    private static Person createPerson(Scanner scanner) {
        System.out.println("Enter your details:");
        System.out.println("Your id:");
        int id= scanner.nextInt();
        System.out.println("Your name:");
        String name= scanner.nextLine();
        String nname= scanner.nextLine();
        System.out.println("Your surname:");
        String surname= scanner.nextLine();
        System.out.println("Your fathername");
        String fathername= scanner.nextLine();
        System.out.println("Your age:");
        Byte age= (byte) scanner.nextInt();
        System.out.println("Your gender");
        Gender gender = null;
        while (gender == null) {

            String genderInput = scanner.next();

            if (genderInput.equalsIgnoreCase("M")) {
                gender = Gender.Male;
            } else if (genderInput.equalsIgnoreCase("F")) {
                gender = Gender.Female;
            } else {
                System.out.println("Invalid gender input. Please enter 'M' or 'F'.");
            }
        }
        return new Person(id, name, surname, fathername, age, gender);
    }
    private static User createUser(Scanner scanner){
        System.out.println("Enter user details");
        System.out.println("Username:");
        String username= scanner.nextLine();
        System.out.println("Enter password:");
        String password= scanner.nextLine();
        return new User(username, password);
    }

}
