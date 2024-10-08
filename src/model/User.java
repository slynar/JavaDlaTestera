package model;

import java.util.Objects;

public class User implements Comparable<User> {

    public static int counter = 0;
    private static int userCounter = 0;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private boolean isAdult;

    public void getFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void getAllInfo() {
        System.out.println(firstName + " " + lastName + ", " + email + ", " + age + ", " + isAdult);
    }

    public int getUserAge() {
        return age;
    }

    public boolean isUserAdult() {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public void greetings(String firstName, String lastName) {
        System.out.println("Hi " + firstName + " " + lastName + ", nice to see you!");
    }

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.isAdult = isUserAdult();
        userCounter++;
        counter++;
    }

    public void setEmail(String email) {
        if (email.endsWith(".ru")) {
            System.out.println("RU emails are not allowed!");
        } else {
            this.email = email;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public static int getUserCounter() {
        return userCounter;
    }


    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", isAdult=" + isAdult +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && isAdult == user.isAdult && Objects.equals(firstName, user.firstName)
                && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email, age, isAdult);
    }

    @Override
    public int compareTo(User user) {
        int compareresult = this.getFirstName().compareTo(user.getFirstName());
        if (compareresult == 0) {
            compareresult = this.getLastName().compareTo(user.getLastName());
        }
        return compareresult;
    }

}