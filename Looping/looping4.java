import javax.swing.JOptionPane;

public class looping4 {
  public static void main(String args[]) {
    String output = "";
    
     // it start at 2 and keep adding 1 until I reach 100.
    for (int i = 2; i <=100; i++){
        //Add the current number to the output.
       output = output + i + " ";
       
       // we check if divisible by 20 with no remainder, and move to the next line.
       if (i % 20 == 0) { 
           output = output + "\n";
   }
  } 
  
  JOptionPane.showMessageDialog(null, output);
    
  }
}