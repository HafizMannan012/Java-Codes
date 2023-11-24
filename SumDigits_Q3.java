import java.util.Scanner;

public class SumDigits_Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();
        
        // Check if the input is within the valid range
        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter an integer between 0 and 1000.");
            scanner.close();
            return;
        }
        
        // Calculate the sum of the digits
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10;      // Remove the last digit from the number
        }
        
        // Display the sum of the digits
        System.out.println("Sum of the digits: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
