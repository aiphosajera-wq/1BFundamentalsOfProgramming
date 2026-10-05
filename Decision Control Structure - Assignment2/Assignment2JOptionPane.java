import javax.swing.JOptionPane;

public class Assignment2JOptionPane {

    public static void main(String[] args) {

        try {
            double hourlyRate = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter hourly pay rate:")
            );
            double hoursWorked = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter hours worked:")
            );
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

            JOptionPane.showMessageDialog(
                null,
                "--- PAYROLL SUMMARY ---\n" +
                "Gross Pay: ₱" + grossPay + "\n" +
                "Withholding Tax: ₱" + withholdingTax + "\n" +
                "Net Pay: ₱" + netPay
            );
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Invalid input. Please enter numbers only."
            );
        }
    }
}