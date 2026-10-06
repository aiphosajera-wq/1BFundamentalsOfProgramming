import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment3BufferedReader {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print(" Enter parents' monthly salary: ");
            double salary = Double.parseDouble(br.readLine());

            System.out.print("Enter NSAT score: ");
            double nsat = Double.parseDouble(br.readLine());

            System.out.print("Enter entrance exam score: ");
            double entrance = Double.parseDouble(br.readLine());

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
        catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numbers only.");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while reading the input.");
        }
    }
}