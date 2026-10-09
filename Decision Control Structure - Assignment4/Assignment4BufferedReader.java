import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Assignment4BufferedReader {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height in cm: ");
        int height = Integer.parseInt(input.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(input.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        String citizenship = input.readLine();

        System.out.print("Enter recommended code (R/N): ");
        String recommended = input.readLine();

        if (recommended.equals("R") ||
            (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C"))) {

            System.out.println("ACCEPTED");

        } else {

            System.out.println("REJECTED");
        }
    }
}