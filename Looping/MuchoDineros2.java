import javax.swing.JOptionPane;

public class MuchoDineros2 {
  public static void main(String args[]) {
  
    // The strating amount of Mucho.
    double balance = 20000;
    
    // It stores the amount that mucho will enter.
    double amount;

        //Display the starting amount.
        JOptionPane.showMessageDialog(
            null,"Starting Balance: " + balance);

        amount = Double.parseDouble(
            JOptionPane.showInputDialog("Enter amount (0 to stop):"));
        
        // This loop will continue as long as the amount is not zero.
        // If Mucho enters 0, the program will stop.
        while (amount != 0) {
            
            // If amount is positive Mucho is depositing.
            if (amount > 0) {
                
             // It add the amount to the current balance.    
            balance = balance + amount;
            
            // If amount is negative Mucho is withdrawing.
            } else if (amount < 0) {
            
            if (balance + amount >= 0) {
            
            
            // If the balance is enough, it update the balance.
            balance = balance + amount;
            // If the money is not enough, it display an insufficient funds message.
            } else {
                JOptionPane.showMessageDialog(
                    null,"INSUFFICIENT FUNDS!");
                }
            }
            
            JOptionPane.showMessageDialog(
                null,"Outstanding Balance: " + balance);

            amount = Double.parseDouble(
                JOptionPane.showInputDialog("Enter amount (0 to stop):"));
        }

        JOptionPane.showMessageDialog(
            null,"Final Balance: " + balance);
  
  
  }
}