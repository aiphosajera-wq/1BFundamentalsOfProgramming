import javax.swing.JOptionPane;

public class looping2 {
  public static void main(String args[]) {
      
    int number = Integer.parseInt(
        JOptionPane.showInputDialog("Enter number 1:  "));
        
    int highest = number;
    int lowest = number;

    //start at number 2 because until the user enters reach the 10 numbers
    for (int i = 2; i <= 10; i++) {
          //ask the user to enter the next number.
      number = Integer.parseInt(
          JOptionPane.showInputDialog("Enter number " + i + "; "));

        // it checks if the number is bigger, its highest.
      if (number > highest) {
        highest = number;
         // it checks if the number is lowest, its lowest.
      } else if (number < lowest) {
        lowest = number;
      }
    }

    JOptionPane.showMessageDialog(
        null,Highest number " + highest + "\nLowest number " + lowest);
  }
}
