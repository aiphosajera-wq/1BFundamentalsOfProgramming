import java.io.BufferedReader; // Imports BufferedReader so we can read input from the user
import java.io.InputStreamReader; // Imports InputStreamReader to connect keyboard input to BufferedReader
import java.io.IOException; // Imports IOException for possible input/output errors

public class LeapYearBufferedReader { // Define the class name of the program
    public static void main(String[] args) throws IOException { // The main method is where the program starts

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Creates a BufferedReader to read what the user types

        System.out.print("Enter a year: "); // Displays "Enter year:" on the screen
        String input = reader.readLine(); // It reads the user's input
        
        try{ // It test code that might cause an error
        int year = Integer.parseInt(input); //  Converts  String to integer
        
        // Check if its devisible by 4 not in 100 the entered input by the user and it perform the calculation
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) { 
            System.out.println("Leap year"); // Displays this message if the year is a leap year
            
        } else {
            System.out.println("Not a leap year"); // Displays this message if the year is  not a leap year
        }
      
        } catch (NumberFormatException e) { // // Catches an error when the user enters letters or invalid numbers
            System.out.println("Invalid input. Please enter a number."); //Display an error message
        }
      }
    }

