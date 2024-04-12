import model.Bug;

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
        // Utwórz klasę model.Bug, a w niej pola:
        // opis błędu, email osoby zgłaszającej, priorytet błędu (1-5), status błędu (zamknięty lub (domyślnie) otwarty)
        // Utwórz konstruktor
        // Utwórz metody:
        // wszystkie informacje o błędzie, pokaż osobę zgłaszającą, pokaż status, pokaż priorytet

        Bug bug1 = new Bug("issues", "sw@kok.pl", 3);

        bug1.showBugDescription();
        bug1.showEmail();
        bug1.showPriority();
        bug1.showStatus();
    //================================================================================================
        System.out.println();
        System.out.println("Ćwiczenie nr 3:");
        // 1. Przenieś klasę model.Bug do innego pakietu (np. model)
        // 2. Zmień modyfikatory dostępu wszystkich pól na prywatne, a konstruktora i metod na publiczne
        // 3. Wygeneruj gettery i settery do prywatnych pól
        // 4. W setterach dodaj walidację: bugDescription nie może być krótszy niż 10 znaków, email musi zawierać
        //    znak @, bugPriority musi być w zakresie 1-5

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





    }
}