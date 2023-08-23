package smallregistrationapp;

import java.lang.management.ManagementFactory;
import java.util.Objects;

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
        this.gender=gender;

    }




    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(surname, person.surname) && Objects.equals(fathername, person.fathername) && Objects.equals(age, person.age) && gender == person.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fathername='" + fathername + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, fathername, age, gender);
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}


