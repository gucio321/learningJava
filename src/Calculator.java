import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        var kb = new Scanner(System.in);
        System.out.print("Enter operation (+, -, * or /): ");
        var op = kb.nextLine();
        System.out.print("Enter 1st number: ");
        var f1 = kb.nextDouble();
        System.out.print("Enter 2nd number: ");
        var f2 = kb.nextDouble();
        double result = 0;
        switch (op) {
            case "+":
                result = f1 + f2;
                break;
            case "-":
                result = f1 - f2;
                break;
            case "*":
                result = f1 * f2;
                break;
            case "/":
                if (f2 == 0) {
                    System.out.println("Cannot divide by zero");
                }

                result = f1/f2;
                break;
            default:
                System.out.println("Unknown operation.");
                return;
        }

        System.out.println("Result: " + result);
    }
}
