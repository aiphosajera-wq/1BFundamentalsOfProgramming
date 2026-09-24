import java.util.Scanner; // Imports Scanner for user input
import java.util.InputMismatchException; // Import the specific exception

public class bfifthJava { // Creates Java class
    public static void main(String[] args) { // Starting point of program
        String name; // Creates variable for name
        int age; // Creates variable for age 
        Scanner inputDevice = new Scanner(System.in); // Creates a scanner for input

        try { // Handle the error
            System.out.print("Please enter your name: "); // Asks the user to enter their name
            name = inputDevice.nextLine(); // It reads the entered name

            System.out.print("Please enter your age: "); //Asks the user to enter their age
            // Use nextInt() instead of nextLine() to read integer
            age = inputDevice.nextInt(); //It reads the entered age

            // This only prints if the age was entered correctly 
            System.out.println("Your name is " + name + " and you are " + age + " years old.");

        } catch (InputMismatchException e) {
            // Catches the crash and displays a friendly error message instead
            System.out.println("Error: Age must be a whole number.");
        } finally { 
            // Always runs, ensuring the scanner is closed to prevent memory leaks
            inputDevice.close();
        }
    }
}
