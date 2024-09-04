import model.User;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Typ OPTIONAL:");

        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Michael", "Scott", "ms@mikescott.com", 44));
        users.add(new User("Pamela", "Beasley", "pambeas@google.com", 26));
        users.add(new User("Dwight", "Schrute", "dwights@beets.com", 32));
        users.add(new User("Jim", "Halpert", "jimhal@mail.com", 30));
        users.add(new User("Angela", "Martin", "angela@catmail.com", 31));
        users.add(new User("Kevin", "Malone", "ms@mikescott.com", 38));
        users.add(new User("Oscar", "Martinez", "om@gpride.com", 36));
        users.add(new User("Creed", "Bratton", "pres_brat@campseo.com", 60));
        users.add(new User("Meredith", "Palmer", "mpalmer@coockoo.com", 50));
        users.add(new User("Andy", "Bernard", "andy_ber@stars.com", 39));
        users.add(new User("Toby", "Flenderson", "tf@dm-hr.com", 42));
        users.add(new User("Stanley", "Hudson", "stanhud@google.com", 54));
        users.add(new User("Phyllis", "Vance", "stanhud@google.com", 49));

        System.out.println(" Metoda orElseGet():");
        User dget = users.stream()
                .filter(user -> user.getFirstName().startsWith("D"))
                .findFirst()
                .orElseGet(() -> new User("D-GET", "GET_D", "D-get@google.com", 66));
        System.out.println(dget);

        System.out.println(" Metoda orElseThrow():");
        User othrow = users.stream()
                .filter(user -> user.getFirstName().startsWith("O"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Brak użytkownika na literę O"));
        System.out.println(othrow);

        System.out.println(" Metoda ifPresent():");
        users.stream()
                .filter(user -> user.getFirstName().startsWith("J"))
                .findFirst()
                .ifPresent(user -> System.out.println(user));

        System.out.println(" Metoda ifPresentOrElse():");
        users.stream()
                .filter(user -> user.getFirstName().startsWith("S"))
                .findFirst()
                .ifPresentOrElse(user -> System.out.println(user), () -> System.out.println("No such user found"));

    }
}