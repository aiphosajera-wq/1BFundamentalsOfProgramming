import javax.swing.JOptionPane;

public class bsixthJava{
    public static void main( String[] args) {  // Fixed: Sring -> String
        String name = "";
        name = JOptionPane.showInputDialog("Please enter your name");  // Fixed: JoptionPane -> JOptionPane
        
        String msg = "Hello " + name + "! ";
        JOptionPane.showMessageDialog(null,  msg);
    }
}