// Activity 5: Days of the Week Selector
package SchoolActivites;

import java.util.Scanner;

public class DayOfWeekSelector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Multiplication Program!");
        System.out.println("Enter two positive numbers to multiply them.");
        System.out.println("Enter '0' as the first number to exit.");

        while (true) {
            System.out.print("\nEnter the first number: ");
            int num1 = scanner.nextInt();

            // Exit condition
            if (num1 == 0) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            // Ensure the first number is positive
            if (num1 < 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                continue;
            }

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Ensure the second number is positive
            if (num2 < 0) {
                System.out.println("Invalid input! Please enter a positive number.");
                continue;
            }

            // Calculate the product using a for loop
            int product = 0;
            for (int i = 0; i < num2; i++) {
                product += num1;
            }

            System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
        }

        scanner.close();
    }
}