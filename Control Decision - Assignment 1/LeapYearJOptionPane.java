import javax.swing.JOptionPane; // It imports the JOptionpane so we can use the pop-up dialog box

public class LeapYearJOptionPane {  //  Creates the class
  
    public static void main(String[] args) {  // The main method where the program starts
    
        String input = JOptionPane.showInputDialog("Enter a year");  // Ask the user input
    
        try {   //It test the code that might cause error
        
            int year = Integer.parseInt(input);  // Convert string to integer
            
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {  //it checks if its devisible in 4 & not in 100 and it perform the calculation
            
                JOptionPane.showMessageDialog(null, "Leap year");  //It display if the condition is true
                
            } else { 
                JOptionPane.showMessageDialog(null, "Not a leap year"); //It display is the condition is not true
            }
        
            } catch (NumberFormatException e) { //It catch the error instead of crashing    
           
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number."); // It display an error pop-up telling the user to enter numbers only
        }
    }
}
