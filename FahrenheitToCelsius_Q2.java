import java.util.Scanner;

public class FahrenheitToCelsius_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5/9;
        
        // Display the converted temperature in Celsius
        System.out.println("Temperature in Celsius: " + celsius);
        
        // Close the scanner
        scanner.close();
    }
}
