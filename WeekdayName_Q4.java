import java.util.Scanner;

public class WeekdayName_Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 7
        System.out.print("Enter a number between 1 and 7: ");
        int dayNumber = scanner.nextInt();

        // Use a switch statement to display the weekday name
        String weekdayName;
        switch (dayNumber) {
            case 1:
                weekdayName = "Sunday";
                break;
            case 2:
                weekdayName = "Monday";
                break;
            case 3:
                weekdayName = "Tuesday";
                break;
            case 4:
                weekdayName = "Wednesday";
                break;
            case 5:
                weekdayName = "Thursday";
                break;
            case 6:
                weekdayName = "Friday";
                break;
            case 7:
                weekdayName = "Saturday";
                break;
            default:
                weekdayName = "Invalid day";
        }

        // Display the weekday name
        System.out.println("Corresponding weekday: " + weekdayName);

        // Close the scanner
        scanner.close();
    }
}
