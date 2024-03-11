public class cwiczenia {
    public static void main(String[] args) {
        System.out.println("Kopia_1 brancha main");
        System.out.println();

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
        if ((a1+a2)%2==0 && (b1+b2)%2==0) {
            System.out.println("Wszystkie sumy są parzyste");
        } else {
            System.out.println("Nie wszystkie sumy są parzyste");
        }


    }

}


