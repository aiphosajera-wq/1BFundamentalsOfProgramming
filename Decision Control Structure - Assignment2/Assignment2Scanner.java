import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment2Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {

            System.out.print("Enter hourly pay rate: ");
            double hourlyRate = scanner.nextDouble();

            System.out.print("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();

            double grossPay = hourlyRate * hoursWorked;

            double taxRate;

            if (grossPay <= 2000) {
                taxRate = 0.10;
            } else if (grossPay <= 4000) {
                taxRate = 0.12;
            } else if (grossPay <= 10000) {
                taxRate = 0.15;
            } else {
                taxRate = 0.20;
            }

            double withholdingTax = grossPay * taxRate;
            double netPay = grossPay - withholdingTax;

            System.out.println("\n--- PAYROLL SUMMARY ---");
            System.out.println("Gross Pay: ₱" + grossPay);
            System.out.println("Withholding Tax: ₱" + withholdingTax);
            System.out.println("Net Pay: ₱" + netPay);

        } catch (InputMismatchException e) {

            System.out.println("Invalid input. Please enter numbers only.");

        } finally {

            scanner.close();
        }
    }
}