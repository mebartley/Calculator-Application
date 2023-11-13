import java.util.Scanner;

public class CalculatorApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MathLibraryImpl mathLibrary = new MathLibraryImpl();

        // Input numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform calculations
        System.out.print("\nCalculations:");
        int sum = mathLibrary.add(num1, num2);
        System.out.println("\nSum: " + sum);

        int difference = mathLibrary.subtract(num1, num2);
        System.out.println("Difference: " + difference);

        int product = mathLibrary.multiply(num1, num2);
          System.out.println("Product: " + product);

        try {
            double quotient = mathLibrary.divide(num1, num2);
            System.out.println("Quotient: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("");

        scanner.close();
    }
}
