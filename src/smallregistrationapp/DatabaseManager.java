package smallregistrationapp;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DatabaseManager {
    private Connection connection;

    public DatabaseManager() {


        try {
            Class.forName("org.postegrsql.Driver");


            String url = "jdbc:postgresql://localhost:5432/user_management";

            String username = "username";
            String password = "password";
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException exception) {

            exception.printStackTrace();

        }

    }
        public void savePerson(Person person){
            try {
                String query = "INSERT INTO person (id, name, surname, father_name, age, gender) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, person.getId());
                preparedStatement.setString(2, person.getName());
                preparedStatement.setString(3, person.getSurname());
                preparedStatement.setString(4, person.getFathername());
                preparedStatement.setByte(5, person.getAge());
                preparedStatement.setString(6, person.getGender().toString());
                preparedStatement.executeUpdate();
                preparedStatement.close();
                System.out.println("Person saved successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void registerUser(User user){
            try {
                String query = "INSERT INTO user (id, username, password) VALUES (?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, Person.getId());
                preparedStatement.setString(2, user.getUsername());
                preparedStatement.setString(3, user.getPassword());
                preparedStatement.executeUpdate();
                preparedStatement.close();
                System.out.println("User registered successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void showPeople(){
            try {
                String query = "SELECT id, name, surname, father_name, age, gender FROM person";
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                ResultSet resultSet = preparedStatement.executeQuery();

                List<Person> people = new ArrayList<>();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    String surname = resultSet.getString("surname");
                    String fatherName = resultSet.getString("father_name");
                    byte age = resultSet.getByte("age");
                    Person.Gender gender = Person.Gender.valueOf(resultSet.getString("gender"));

                    Person person = new Person(id, name, surname, fatherName, age, gender);
                    people.add(person);
                }

                resultSet.close();
                preparedStatement.close();

                // Print the retrieved people
                for (Person person : people) {
                    System.out.println(person);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
   public  void closeConnection(){
   try{
       if(connection!=null){
           connection.close();
       }
   }catch (SQLException e){
       e.printStackTrace();
   }
   }

    }

