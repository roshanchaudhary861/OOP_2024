import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee's salary
        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        // Input employee's performance rating
        System.out.print("Enter employee's performance rating (Excellent, Good, or Poor): ");
        scanner.nextLine(); // Consume the newline character left by nextDouble
        String performanceRating = scanner.nextLine();

        // Compute raise based on performance rating
        double raise;
        if (performanceRating.equals("Excellent")) {
            raise = 0.06; // 6% raise for Excellent
        } else if (performanceRating.equals("Good")) {
            raise = 0.04; // 4% raise for Good
        } else if (performanceRating.equals("Poor")) {
            raise = 0.015; // 1.5% raise for Poor
        } else {
            System.out.println("Invalid performance rating. Please enter Excellent, Good, or Poor.");
            return; // Exit the program if the performance rating is invalid
        }

        // Calculate the new salary
        double newSalary = salary + (salary * raise);

        // Display the results
        System.out.println("Employee's new salary: $" + newSalary);

        // Close the scanner
        scanner.close();
    }
}
