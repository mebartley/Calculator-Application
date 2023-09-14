public class MyMathMain {
    public static void main(String[] args) {
        System.out.println("Addition: " + MyMathLibrary.add(2, 3));
        System.out.println("Subtraction: " + MyMathLibrary.subtract(5, 3));
        System.out.println("Addition test: " + MyMathLibrary.add(2, 3));
        System.out.println("Subtraction test: " + MyMathLibrary.subtract(5, 3));
        System.out.println("Multiplication test: " + MyMathLibrary.multiply(2, 3));
        System.out.println("Division test: " + MyMathLibrary.divide(6, 3));
        try {
            System.out.println("Division by zero test: " + MyMathLibrary.divide(6, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
