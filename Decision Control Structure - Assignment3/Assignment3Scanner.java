import java.util.Scanner;
import java.util.InputMismatchException;

public class Assignment3Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            System.out.print("Enter parents' monthly salary: ");
            double salary = input.nextDouble();

            System.out.print("Enter NSAT score: ");
            double nsat = input.nextDouble();

            System.out.print("Enter entrance exam score: ");
            double entrance = input.nextDouble();

            double average = (nsat + entrance) / 2;

            if (salary > 10000 || nsat < 90 || entrance < 85) {
                System.out.println("Result: REJECTED");
            } 
            else if (salary <= 3500 && average >= 91) {
                System.out.println("Result: ACCEPTED");
            } 
            else {
                System.out.println("Result: FOR FURTHER STUDY");
            }

        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        }

        input.close();
    }
}