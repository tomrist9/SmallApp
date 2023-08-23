package smallregistrationapp;

public class Person {

    private Integer id;
    private String name;
    private String surname;
    private String fathername;

    private Byte age;

    private Gender gender;


    public Person(Integer id, String name, String surname, String fathername, Byte age, Gender gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.fathername = fathername;
        this.age = age;
        this.gender = gender;
    }


    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }


    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


    public static int getId() {
        return getId();
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public enum Gender{
        Male, Female
    }
}
