import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for start and end
        System.out.print("Enter the start value: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end value: ");
        int end = scanner.nextInt();

        // Step 2: Add a conditional statement to check if end is larger or equal to start
        if (end >= start) {
            // Step 3: Write a loop to compute the sum
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum += i;
            }

            // Step 4: Print the result
            System.out.println("The sum of integers from " + start + " to " + end + " is: " + sum);
        } else {
            // Step 5: Display an error message if start is larger than end
            System.out.println("Error: End value must be larger than or equal to start value.");
        }

        scanner.close();
    }
}