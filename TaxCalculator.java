import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        // Constants for tax rates
        final double TAX_RATE_LOW = 10.0;    // Tax rate for income < 500
        final double TAX_RATE_MEDIUM = 15.0; // Tax rate for 500 <= income < 1500
        final double TAX_RATE_HIGH = 20.0;   // Tax rate for 1500 <= income < 2500
        final double TAX_RATE_HIGHER = 30.0; // Tax rate for income >= 2500
        
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Prompt the user for their income
            System.out.print("Enter your income: ");
            
            // Read the income value entered by the user
            int income = scanner.nextInt();
            
            // Validate income to ensure it's a non-negative number
            if (income < 0) {
                System.out.println("Invalid input: Income should not be negative.");
            } else {
                // Determine the tax rate based on the income
                if (income < 500) {
                    System.out.printf("Tax Rate = %.0f%%\n", TAX_RATE_LOW);
                } else if (income < 1500) {
                    System.out.printf("Tax Rate = %.0f%%\n", TAX_RATE_MEDIUM);
                } else if (income < 2500) {
                    System.out.printf("Tax Rate = %.0f%%\n", TAX_RATE_HIGH);
                } else {
                    System.out.printf("Tax Rate = %.0f%%\n", TAX_RATE_HIGHER);
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input: Please enter a numeric value.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}


/*import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their income
        System.out.print("Enter your income: ");

        // Read the income value entered by the user
        int income = scanner.nextInt();

        // Determine the tax rate based on the income
        if (income < 500) {
            System.out.println("Tax Rate = 10%");
        } else if (income >= 500 && income < 1500) {
            System.out.println("Tax Rate = 15%");
        } else if (income >= 1500 && income < 2500) {
            System.out.println("Tax Rate = 20%");
        } else if (income >= 2500) {
            System.out.println("Tax Rate = 30%");
        }

        // Close the scanner
        scanner.close();
    }
}*/

