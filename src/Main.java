public class Main {

    // Komentarz
    public static void main(String[] args) {
        System.out.println("HELLO!");

        System.out.println();
        int age;
        age = 19;
        System.out.println("Masz " + age + " lat.");
        System.out.println(age + " lat to piękny wiek.");
        System.out.println("Dodatkowo " + age + " to liczba pierwsza.");
        System.out.println("Liczba, która następuje po " + age + " to " + (age+1));

        System.out.println();
        // Operatory matematyczne:
        System.out.println(10 + 10);    // dodawanie
        System.out.println(10 - 10);   	// odejmowanie
        System.out.println(10 * 10);   	// mnożenie
        System.out.println(10 / 4);    	// dzielenie liczb całkowitych, w wyniku otrzymamy liczbę całkowitą 2
        System.out.println(10.0 / 4.0); // dzielenie liczb zmiennoprzecinkowych, w wyniku otrzymamy liczbę zmiennoprzecinkową 2.5

        System.out.println();
        // Operatory porównania - w odpowiedzi otrzymamy wartość boolean – true albo false:
        int a = 1;
        int b = 2;
        System.out.println(a > b);	// a większe od b
        System.out.println(a < b);	// a mniejsze od b
        System.out.println(a == b);	// a jest równe b (podwójny znak =)
        System.out.println(a != b);	// a nie jest równe b

        System.out.println();
        // Operatory logiczne:
        // || – lub, zwraca wartość boolean true, jeśli którekolwiek ze sprawdzanych wyrażeń ma wartość true
        System.out.println(a > b || a == 1);	// fałsz || prawda → prawda
        System.out.println(a > b || a != 1);	// fałsz || fałsz → fałsz
        System.out.println(a < b || a == 1);	// prawda || nie jest sprawdzana → prawda
        // && – i, zwraca wartość boolean true, jeśli każde ze sprawdzanych wyrażeń ma wartość true
        System.out.println(a < b && a == 1);	// prawda && prawda → prawda
        System.out.println(a < b && a != 1 );	// prawda && fałsz → fałsz
        System.out.println(a > b && a == 1);	// fałsz && prawda → fałsz

        System.out.println();
        // Instrukcje sterujące:
        // w zależności od tego, jaką wartość (true / false) przyjmuje sprawdzane wyrażenie, wykonywana jest odpowiednia część kodu:
        // jeśli true – część kodu przed else; jeśli false – część kodu po else
        if (a < b) {
            System.out.println("a is smaller than b");
            System.out.println(a + " < " + b);
        } else
            System.out.println("a is bigger than b");

        System.out.println();
        // Operator modulo:
        if (9 % 2 == 0) {
            System.out.println("Ta wartość jest liczbą parzystą");
        } else {
            System.out.println("Nie jest to liczba parzysta"); }


    }
}