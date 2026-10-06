import javax.swing.JOptionPane;

public class Assignment3JOptionPane {

    public static void main(String[] args) {

        try {

            double salary = Double.parseDouble(
            JOptionPane.showInputDialog("Enter parents' monthly salary:")
            );

            double nsat = Double.parseDouble(
                JOptionPane.showInputDialog("Enter NSAT score:" )
            );

            double entrance = Double.parseDouble(
                JOptionPane.showInputDialog("Enter entrance exam score:")
            );

            double average = (nsat + entrance) / 2;
            String result;

            if (salary > 10000 || nsat < 90 || entrance < 85) {
                result = "REJECTED";
            } 
            else if (salary <= 3500 && average >= 91) {
                result = "ACCEPTED";
            } 
            else {
                result = "FOR FURTHER STUDY";
            }

            JOptionPane.showMessageDialog(null,"Average Score: " + average + "\nResult: " + result);
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Invalid input! Please enter numbers only." );
        }
    }
}