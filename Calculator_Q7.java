public class Calculator_Q7 {
    // Method to perform addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to perform subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Method to perform multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method to perform division
    public static double divide(double a, double b) {
        if (b == 0) {
            System.err.println("Error: Division by zero is not allowed.");
            return Double.NaN; // NaN (Not-a-Number) indicates an error
        }
        return a / b;
    }

    public static void main(String[] args) {
        double operand1 = 10.0;
        double operand2 = 5.0;

        // Perform arithmetic operations
        double additionResult = add(operand1, operand2);
        double subtractionResult = subtract(operand1, operand2);
        double multiplicationResult = multiply(operand1, operand2);
        double divisionResult = divide(operand1, operand2);

        // Display the results
        System.out.println("Addition: " + additionResult);
        System.out.println("Subtraction: " + subtractionResult);
        System.out.println("Multiplication: " + multiplicationResult);
        System.out.println("Division: " + divisionResult);
    }
}
