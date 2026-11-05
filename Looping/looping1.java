import java.util.Scanner;

public class looping1 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    
    System.out.print(" Enter number: ");
    int number = input.nextInt();
    
    int highest = number;
    int lowest = number;
    //start at number 2 because until the user enters reach the 10 numbers
    for (int i = 2; i <= 10; i++){
         //ask the user to enter the next number.
        System.out.print("Enter number " + i + ": ");
        number = input.nextInt();
    
    if (number > highest){
        highest = number;
    }
    else if (number < lowest){
        lowest = number;
    }
    
    System.out.println("Highest: " + highest);
    System.out.println("Lowest: " + lowest);
    
    }
    
    
  }
}