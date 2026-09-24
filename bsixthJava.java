import javax.swing.JOptionPane; // Imports JOptionPane for pop up input/output

public class bsixthJava{ // Creates Java class
    public static void main( String[] args) {  // Starting point of program 
        String name = ""; // Creates a variable for name
        name = JOptionPane.showInputDialog("Please enter your name");  // Asks the user's name
        
        String msg = "Hello " + name + "! "; // Create a greeting message 
        JOptionPane.showMessageDialog(null,  msg); // Display the message greeting in a pop up box
    }
}