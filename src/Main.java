import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 5;
        double other = 3.14;
        String tekst = "weeee";
        boolean is = true;
        System.out.printf("Hello, %d! %.2f %s %b %b %b\n", number, other, tekst, is, 5>6,
                !(2 == 2 && 3 >= 3));

        // so, data types:
        byte x = 100; // 8-bit signed integer
        short y = 100; // 16-bit signed integer
        int z = 100; // 32-bit signed integer
        long a = 100L; // 64-bit signed integer
        float b = 100.0f; // 32-bit floating point
        double c = 100.0; // 64-bit floating point
        char d = 'a'; // 16-bit Unicode character
        boolean e = true; // true or false
        String f = "Hello"; // sequence of characters

        // String operations
        // - immutable
        String java = "Java";
        System.out.println(java.charAt(0));
        System.out.println(java.length());
        // stringi:
        // - operator + jest zaimplementowany w klaise stringa i dział też na np. inty
        System.out.println("Java " + 25);
        // - String mam metody toUpperCase, toLowerCase:
        System.out.println("JaVa".toUpperCase());
        // - String has a static method join:
        String[] strings = {"a", "b", "c"};
        System.out.println(String.join(" ", strings));
        // - Strings have replace method
        System.out.println("Ala ma kota".replace("Ala", "Alicja"));
        // - getting substring
        System.out.println("Ala ma kota".substring(7, 10));
        // - isEmpty
        System.out.println("Ala ma kota".isEmpty());
        // - indexOf (-1 jak nie ma)
        System.out.println("Ala ma kota".indexOf("kot"));
        // - xd porównywanie jest dziwne... Są 2 metody:
        //   - equals (porównuje zawartość)
        //   - compareTo
        //      - zwraca 0 jak są równe
        //      - < 0 jak a < b
        //      - > 0 jak a > b
        System.out.println("java".equals("java")); // true
        System.out.println("java".equalsIgnoreCase("JAVA")); // true
        System.out.println("abc".compareTo("abc"));
        System.out.println("abc".compareTo("bbc")); // abc < bbc => <0

        // [INPUT]
        // java.utils.Scanner
        // you need scanner like.. reader in go?
        // System.in = os.Stdin
        var kb = new Scanner(System.in);
        System.out.print("Dawaj hajsy: ");
        // wrzuca linijke z doublem do bufora
        var hajsy = kb.nextDouble();

        // czyści \n z bufora
        kb.nextLine(); // need this because without, it probably takes \n as input

        // robi kolejną linijkę
        System.out.print("Twoje imie?: ");
        var name = kb.nextLine();

        System.out.println("Dasz mi " + hajsy + " " + name);
        // [Switch-Case]
        switch (5) {
            case 8:
                System.out.println("never exec");
            case 5:
                System.out.println("call!");
                break;
            case 2:
                System.out.println("Should nnot be called");
                break;
            default:
                System.out.println("default");
        }
    }
}