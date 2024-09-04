import model.bugs.Bug;
import model.bugs.BugReporter;
import model.computer.*;

import java.util.*;
import java.util.stream.Collectors;

public class Cwiczenia {
    public static void main(String[] args) {
        System.out.println("Kopia_1 brancha main");
        System.out.println();
        //================================================================================================
        System.out.println("Ćwiczenie nr 1:");
        // 1. Utwórz 4 dowolne zmienne typu int
        int a1 = 65;
        int a2 = 129;
        int b1 = 1246;
        int b2 = 873;
        // 2. Sprawdź czy suma dwóch pierwszych jest parzysta
        if ((a1 + a2) % 2 == 0) {
            System.out.println("Suma liczb " + a1 + " i " + a2 + " jest parzysta");
        } else {
            System.out.println("Suma liczb " + a1 + " i " + a2 + " jest nieparzysta");
        }
        // 3. Sprawdź czy suma dwóch pozostałych jest parzysta
        if ((b1 + b2) % 2 == 0) {
            System.out.println("Suma liczb " + b1 + " i " + b2 + " jest parzysta");
        } else {
            System.out.println("Suma liczb " + b1 + " i " + b2 + " jest nieparzysta");
        }
        // 4. Jeżeli dwie sumy są parzyste, to wyświetl taką informację
        if ((a1 + a2) % 2 == 0 && (b1 + b2) % 2 == 0) {
            System.out.println("Wszystkie sumy są parzyste");
        } else {
            System.out.println("Nie wszystkie sumy są parzyste");
        }
        //================================================================================================
        System.out.println();
        System.out.println("Ćwiczenie nr 2:");
        // Utwórz klasę model.bugs.Bug, a w niej pola:
        // opis błędu, email osoby zgłaszającej, priorytet błędu (1-5), status błędu (zamknięty lub (domyślnie) otwarty)
        // Utwórz konstruktor
        // Utwórz metody:
        // wszystkie informacje o błędzie, pokaż osobę zgłaszającą, pokaż status, pokaż priorytet


        /*
        Bug bug1 = new Bug("issues", "sw@kok.pl", 3);

        bug1.showBugDescription();
        bug1.showEmail();
        bug1.showPriority();
        bug1.showStatus();
        */

        //================================================================================================
        System.out.println();
        System.out.println("Ćwiczenie nr 3:");
        // 1. Przenieś klasę model.bugs.Bug do innego pakietu (np. model)
        // 2. Zmień modyfikatory dostępu wszystkich pól na prywatne, a konstruktora i metod na publiczne
        // 3. Wygeneruj gettery i settery do prywatnych pól
        // 4. W setterach dodaj walidację: bugDescription nie może być krótszy niż 10 znaków, email musi zawierać
        //    znak @, bugPriority musi być w zakresie 1-5

        /*
        Bug bug2 = new Bug("Brakuje 16 obrazków na stronie głównej", "bug.hunter@gmail.com",1);

        System.out.println(bug2.getDescription());
        bug2.setDescription("opis");
        System.out.println(bug2.getDescription());

        System.out.println(bug2.getEmail());
        bug2.setEmail("cc.gg.pl");
        System.out.println(bug2.getEmail());

        System.out.println(bug2.getPriority());
        bug2.setPriority(8);
        System.out.println(bug2.getPriority());

        System.out.println(bug2.isStatus());
        */

        //================================================================================================
        System.out.println();
        System.out.println("Ćwiczenie nr 4:");
        // Sortowanie elementów tablicy malejąco po wartości
        int[] numbers = {22, 3, 67, 9, 31, 21, 53, 4, 7, 37, 8, 0, 11, 5, 2, 1, 13, 17, 6, -4};
        int max;
        for (int i = 0; i < numbers.length; i++) {
            max = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] > max) {
                    max = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = max;
                }
            }
        }
        for (int number : numbers) {
            System.out.println(number);
        }

        //================================================================================================
        System.out.println();
        System.out.println("Ćwiczenie nr 5:");
        // W klasie PC sprawdź czy kompter jest podłączony do prądu i dodaj walidację podłączenia do prądu
        // w metodzie switchOn().

        //================================================================================================
        System.out.println();
        System.out.println("Ćwiczenie nr 6:");
        // Utwórz dwie przeciążone metody abstrakcyjne: volumeUp() i volumeDown(), które będą przyjmowały
        // jakąś wartość int i o tą wartość będą zmniejszały lub zwiększały wartość volumeLevel.

        /*
        ROZWIĄZANIE:

           klasa Computer:
        public abstract int volumeUp(int newVolumeLevel);
        public abstract int volumeDown(int newVolumeLevel);
           klasy PC i Laptop:
        @Override
        public int volumeUp(int newVolumeLevel) {
            volumeLevel = volumeLevel + newVolumeLevel;
            if (volumeLevel >= 100) {
                volumeLevel = 100;
            }
            return volumeLevel;
        @Override
        public int volumeDown(int newVolumeLevel) {
            volumeLevel = volumeLevel - newVolumeLevel;
            if (volumeLevel <= 0) {
                volumeLevel = 0;
            }
            return volumeLevel;
        */

        //================================================================================================
        System.out.println();
        System.out.println("Ćwiczenie nr 7:");
        // 1. Dodaj klasę BugReporter + 3 pola (firstName, lastName, email) + dodatkowe metody
        //    (toString(), equals() and hashCode()) + walidacja emaila przeniesiona z klasy Bug
        // 2. Dadaj interface ConsoleNotification -> notifyStatusChange
        // 3. W klasie Bug dodaj metodę toString()

        BugReporter bugReporter = new BugReporter("Sly", "Narek", "sly@gmail");
        Bug bug1 = new Bug("Text not aligned", bugReporter, 5);

        System.out.println(bug1);
        bug1.setStatus(true);
        System.out.println(bug1);

        //================================================================================================
        System.out.println();
        System.out.println("Ćwiczenie nr 8:");
        // 1. Utwórz listę bugów - przypisz do niej kilka bugów, w tym dwa identyczne
        // 2. Z tej listy wyciągnij tylko unikalne wartości
        // 3. Posortuj unikalne bugi posortowane po polu bugDescription

        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("Bug 2", new BugReporter("Bartek", "Testowy", "bt@m.com"), 5));
        bugs.add(new Bug("Bug 1", new BugReporter("Bart", "Testowy", "bt@m.com"), 2));
        bugs.add(new Bug("Bug 3", new BugReporter("Bartosz", "Testowy", "bt@m.com"), 1));
        bugs.add(new Bug("Bug 4", new BugReporter("Bartłomiej", "Testowy", "bt@m.com"), 3));
        bugs.add(new Bug("Bug 2", new BugReporter("Bartek", "Testowy", "bt@m.com"), 5));
        System.out.println("List - lista wszystkich bugów:");
        for (Bug bug : bugs) {
            System.out.println(bug.getDescription());
        }

        System.out.println("HashSet - tylko unikalne wartości:");
        Set<Bug> uniqueBugs = new HashSet<>(bugs);
        for (Bug bug : uniqueBugs) {
            System.out.println(bug.getDescription());
        }

        System.out.println("TreeSet - posortowane unikalne wartości:");
        Set<Bug> sortedUniqueBugs = new TreeSet<>(uniqueBugs);
        for (Bug bug : sortedUniqueBugs) {
            System.out.println(bug.getDescription());
        }

        //================================================================================================
        System.out.println();
        System.out.println("Ćwiczenie nr 9:");
        // 1. Utwórz listę komputerów - przypisz do niej kilka laptopów i kilka PC (różne nazwy, parametry mogą się powtarzać)
        // 2. Zlicz wszystkie komputery, które mają więcej niż 16GB RAM
        // 3. Wyświetl na knsoli wszystkie typy komputerów (.map)
        // 4. Wyświetl komputer, który ma najwięcej RAM
        // 5. Utwórz nową kolekcję z komputerami, które mają HDD mniejszy niż 1000GB
        // 6. Posortuj wszystkie komputery po nazwie i typie
        // 7. Przećwicz typ Optional (wszystkie metody)

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("HP", "Omen 16", new Hdd("WD", 1000),new Ram("Patriot", 32), 100));
        computers.add(new Laptop("MSI", "Titan 18", new Hdd("Samsung", 2000),new Ram("Kingston", 64), 100));
        computers.add(new Laptop("Apple", "MacBook Pro M3 Max", new Hdd("Seagate", 2000),new Ram("MAC Memory", 96), 100));
        computers.add(new Laptop("Lenovo", "X240", new Hdd("AData", 120),new Ram("PNY", 8), 80));
        computers.add(new PC("MSI", "Trident X2", new Hdd("Samsung", 2000),new Ram("Crucial", 64)));
        computers.add(new PC("Actina", "Endorfy 7800", new Hdd("Seagate", 1000),new Ram("Kingston", 32)));
        computers.add(new PC("NTT", "WorkStation", new Hdd("Dell", 2000),new Ram("Patriot", 64)));
        computers.add(new PC("Lenovo", "ThinkCentre M710", new Hdd("Transcend", 240),new Ram("G.Skill", 8)));

        long count = computers.stream()
                .filter(comp -> comp.getRam().getSize() > 16)
                .count();
        System.out.println(" Liczba komputerów, które mają więcej niż 16GB RAM : " + count);

        System.out.println(" Wszystkie typy komputerów:");
        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

        System.out.println(" Komputer z największą ilością pamięci RAM: ");
        Computer maxRam = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("Nie mogę znaleźć żadnego komputera"));
        System.out.println(maxRam.getName() + " " + maxRam.getType() + " - " + maxRam.getRam().getSize() + "GB RAM");

        System.out.println(" Komputery, które mają HDD mniejszy niż 1000GB:");
        List<Computer> collect = computers.stream()
                .filter(comp -> comp.getHdd().getSize() < 1000)
                .collect(Collectors.toList());
        for (Computer comp : collect) {
            System.out.println(comp.getName() + " " + comp.getType() + " - " + comp.getHdd().getSize() + "GB");
        }

        System.out.println(" Sortwanie wszystkich komputerów po nazwie i typie:");
        List<Computer> namesTypes = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());
        for (Computer comp : namesTypes) {
            System.out.println(comp.getName() + " " + comp.getType());
        }
    }
}