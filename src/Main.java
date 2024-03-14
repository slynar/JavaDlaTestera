public class Main {
    public static void main(String[] args) {

        User tom = new User("Tom", "Smith", "tom.smith@gmail.com", 17);
        User bob = new User("Bob", "Green", "bob.green@yahoo.com", 44);
        User alan = new User("Alan", "White", "alan.white@gov.com", 37);

        tom.getAllInfo();
        bob.getAllInfo();
        alan.getAllInfo();
    }
}