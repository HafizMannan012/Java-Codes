import java.util.Scanner;

public class SumOfOddIntegers_Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Create an array of the specified size
        int[] numbers = new int[size];
        
        // Prompt the user to enter the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        
        // Calculate the sum of odd integers
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (numbers[i] % 2 != 0) {
                sum += numbers[i];
            }
        }
        
        // Display the sum of odd integers
        System.out.println("Sum of odd integers in the array: " + sum);
        
        // Close the scanner
        scanner.close();
    }
}
