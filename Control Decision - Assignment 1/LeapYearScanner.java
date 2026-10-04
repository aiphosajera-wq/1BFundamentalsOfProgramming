import java.util.Scanner; // Imports Scanner to get input from the user

public class LeapYearScanner{ //Creates the class for the program

    public static void main(String[] args){ // The main method where the program starts
    
        Scanner scan = new Scanner(System.in); // Creates a Scanner object to read keyboard input
        
        System.out.print("Enter a year:  "); // Asks the user and display 'enter a year'
        
        try { // try is used to test code that might cause an error
           
            int year = scan.nextInt();  // Reads the number entered by the user

            // Checks if divisible and the year is a leap year or not (It perform the calculation) 
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {

                System.out.println(year + " is a leap year.");  // Prints this message if the year is a leap year

            } else {
                System.out.println(year + " is not a leap year.");  // Prints this message if the year is not a leap year
            }
            
            } catch (java.util.InputMismatchException e) {  // Catches the error if the user enters letters instead of a number

            // Prints an error message instead of stopping the program
            System.out.println("Invalid input. Please enter a number.");
        }
        // Closes the Scanner after the program is finished using it
        scan.close();
    }
}


