import java.util.Arrays; // Ini-import naman natin yung Arrays para magamit naton yung deepToString().

public class MultidimensionalArray { // Dito binibigyan natin ng pangalan yung class ng program natin
    public static void main(String[] args) { // ito naman ang pinakasimula ng code natin.

        // Dito gumagawa tayo ng 2D array na may pangalan na seats.
        // Dito natin ilalagay yung mga pangalan ng tao na uupo sa bawat row at seat.
        String[][] seats = {
            {"Alice", "Bob", "Charlie"},
            {"David", "Emma", "Frank"}
        };

        // Kinukuha naman natin yung pangalan ng nakaupo sa second row at third column.
        // Kaya seats[1][2] yung ginamit natin kasi nagsisimula sa 0 yung index.
        System.out.println("Person in second row, third column: " + seats[1][2]);

        // Pinapalitan naman natin dito si Bob ng Vacant kasi wala nang nakaupo sa seat na yun.
        seats[0][1] = "Vacant";

        // Ginagamit natin naman yung deepToString() para ma-display yung buong seating arrangement sa isang line.
        System.out.println(Arrays.deepToString(seats));
    }
}

