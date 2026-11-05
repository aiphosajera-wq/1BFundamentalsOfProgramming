import java.util.Scanner;

public class looping3 {
  public static void main(String args[]) {
   Scanner input = new Scanner(System.in);
   
   // start at 2 and keep adding 1 until I reach 100.
   for (int i = 2; i <=100; i++){
       System.out.print(i + " ");
       
       // check if divisible by 20 with no remainder, move to the next line
       if (i % 20 == 0) { 
           System.out.println();
   }
  } 
   
   
  }
}