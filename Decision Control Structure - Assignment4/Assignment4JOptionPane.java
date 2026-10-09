import javax.swing.JOptionPane;

public class Assignment4JOptionPane {

    public static void main(String[] args) {

        int height = Integer.parseInt(
            JOptionPane.showInputDialog("Enter height in cm:")
        );

        int age = Integer.parseInt(
            JOptionPane.showInputDialog("Enter age:")
        );

        String citizenship = JOptionPane.showInputDialog(
            "Enter citizenship code (C/N):"
        );

        String recommended = JOptionPane.showInputDialog(
            "Enter recommended code (R/N):"
        );

        if (recommended.equals("R") ||
            (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C"))) {

            JOptionPane.showMessageDialog(null, "ACCEPTED");

        } else {

            JOptionPane.showMessageDialog(null, "REJECTED");
        }
    }
}