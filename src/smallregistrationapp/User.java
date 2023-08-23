package smallregistrationapp;

import java.util.Objects;

public class User {
private Person person;

private String username;
private String password;



    public User(String username, String password) {
    }

    public String getUsername() {

        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "person=" + person +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(person, user.person) && Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, username, password);
    }

    public String getPassword() {
        return password;
    }
}
