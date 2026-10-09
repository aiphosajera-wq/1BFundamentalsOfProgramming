import java.util.Scanner;

public class Assignment4Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        int height = input.nextInt();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        String citizenship = input.next();

        System.out.print("Enter recommended code (R/N): ");
        String recommended = input.next();

        if (recommended.equals("R") ||
        (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C"))) {

        System.out.println("ACCEPTED");

        } else {
        System.out.println("REJECTED");
        }

        input.close();
    }
}