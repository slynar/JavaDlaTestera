import model.computer.*;

public class Main {
    public static void main(String[] args) {

        Hdd hdd = new Hdd("Samsung", 1024);
        Ram ram = new Ram("Kingston", 32);

        Computer msi = new Laptop("MSI", "Katana", hdd, ram, 100);
        System.out.println(msi.getRam().getSize());

        Computer hp = new Laptop("HP", "ProBook", hdd, new Ram("Corsair", 64), 100);

        Computer acer = new Laptop("Acer", "Nitro", new Hdd("A-DATA", 512),
                new Ram("Corsair", 16), 80);

        System.out.println(hp.getHdd().getSize());
        System.out.println(acer.getHdd().getSize());
    }
}