public class Main {

    // Komentarz
    public static void main(String[] args) {
        System.out.println("POLA I OBIEKTY");

        // Tworzenie obiektów z klasy User:
        User tom = new User();
        tom.firstName = "Tom";
        tom.lastName = "Smith";
        tom.email = "tom.smith@gmail.com";
        tom.age = 25;
        tom.isAdult = true;
        System.out.println(tom.firstName);
        System.out.println(tom.age);

        User bob = new User();
        tom.firstName = "Bob";
        tom.lastName = "Green";
        tom.email = "bob.green@yahoo.com";
        tom.age = 44;
        tom.isAdult = true;
        System.out.println(tom.firstName);
        System.out.println(tom.isAdult);

    }
}