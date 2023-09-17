public class MyMathMain {
    public static void main(String[] args) {
        MathLibraryImpl mathLibrary = new MathLibraryImpl();

        // Test addition with positive numbers
        System.out.println("Addition test (positive numbers): " + mathLibrary.add(2, 3));

        // Test addition with negative numbers
        System.out.println("Addition test (negative numbers): " + mathLibrary.add(-2, -3));

        // Test subtraction with result being positive
        System.out.println("Subtraction test (positive result): " + mathLibrary.subtract(5, 3));

        // Test subtraction with result being negative
        System.out.println("Subtraction test (negative result): " + mathLibrary.subtract(3, 5));

        // Test multiplication with positive numbers
        System.out.println("Multiplication test (positive numbers): " + mathLibrary.multiply(2, 3));

        // Test multiplication with negative numbers
        System.out.println("Multiplication test (negative numbers): " + mathLibrary.multiply(-2, 3));

        // Test division with positive numbers
        System.out.println("Division test (positive numbers): " + mathLibrary.divide(6, 3));

        // Test division with negative numbers
        System.out.println("Division test (negative numbers): " + mathLibrary.divide(6, -3));

        // Test division by zero
        try {
            System.out.println("Division by zero test: " + mathLibrary.divide(6, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        // Test division with zero as numerator
        System.out.println("Division with zero as numerator: " + mathLibrary.divide(0, 3));
    }
}
