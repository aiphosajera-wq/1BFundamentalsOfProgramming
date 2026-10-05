import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment2BufferedReader {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
         try {
        System.out.print("Enter hourly pay rate: ");
        double hourlyRate = Double.parseDouble(br.readLine());

        System.out.print("Enter hours worked: ");
        double hoursWorked = Double.parseDouble(br.readLine());

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

        System.out.println("--- PAYROLL SUMMARY ---");
        System.out.println("Gross Pay: ₱" + grossPay);
        System.out.println("Withholding Tax: ₱" + withholdingTax);
        System.out.println("Net Pay: ₱" + netPay);
        
        } catch (NumberFormatException e) {

            System.out.println("Invalid input. Please enter numbers only.");
        }
    }
}