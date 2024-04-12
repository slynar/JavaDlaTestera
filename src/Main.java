public class Main {
    public static void main(String[] args) {

        Byte b;
        Short s;
        Integer i;
        Long l;
        Float f;
        Double d;
        Character c;
        Boolean bl;

        System.out.println("===  Typy opakowujące:  ===");
        // Ręczna zamiana typu prostego na typ referencyjny (przed Java 5):
        Integer intNumber1 = Integer.valueOf(10);
        Double dbl1 = Double.valueOf(2.63);

        // Ręczna zamiana typu referencyjnego na typ prosty (przed Java 5):
        int primitiveInt1 = intNumber1.intValue();
        double primitiveDouble1 = dbl1.doubleValue();

        // Automatyczna zamiana typu prostego na typ referencyjny (autoboxing):
        Integer intNumber2 = 45;
        Double dbl2 = 17.58;

        // Automatyczna zamiana typu referencyjnego na typ prosty (autounboxing):
        int primitiveInt2 = intNumber2;
        double primitiveDouble2 = dbl2;

        System.out.println("Ręczne opakowywanie: " + intNumber1 + ", " + dbl1);
        System.out.println("Ręczne rozpakowywanie: " + primitiveInt1 + ", " + primitiveDouble1);
        System.out.println("Automatyczne opakowywanie: " + intNumber2 + ", " + dbl2);
        System.out.println("Automatyczne rozpakowywanie: " + primitiveInt2 + ", " + primitiveDouble2);

    }
}