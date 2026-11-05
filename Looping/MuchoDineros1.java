import java.util.Scanner;

public class MuchoDineros1 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    double balance = 20000; // The starting balance
    double amount;
    
    // It display the starting balance 
    System.out.println("Starting balance: ₱" + balance);
    // Use to ask the input, at the same way, use to stop of entering amount.
    System.out.print("Enter the amount (stop 0): ");
    amount = input.nextDouble();
    
     // I keep the program running until the user enters 0.
     while (amount != 0) {
          // If the amount is positive, it means mucho is depositing money.
        if (amount > 0) {
            balance = balance + amount;
             // If the amount is positive, it means mucho is wothdrawing money.
        }else if (amount < 0) {
        if (balance + amount >= 0) {
            balance = balance + amount;
        } else {
            System.out.println(" === INSUFFICIENT FUNDS! ===");
                }
            }
            // It display the added amount in starting balance
            System.out.println("Outstanding Balance: ₱" + balance);
            
            //It display to ask the input, at the same way to stop depositing or withdrawing
            System.out.print("Enter amount (0 to stop): ");
            amount = input.nextDouble();
        }
            //It display the final balance.
            System.out.println("Final Balance: ₱" + balance);
    
  }
}