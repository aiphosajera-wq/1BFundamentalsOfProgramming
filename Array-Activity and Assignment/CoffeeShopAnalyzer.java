// Dito binibigyan natin ng pangalan yung class na gagawwin na program
public class CoffeeShopAnalyzer {
    // Dito naman yung pinaka starting point ng program
    public static void main(String[] args) {

        // Gumamit tayo ng int array para isang variable na lang ang paglalagyan ng sales sa buong week
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};

        // Gumamit din tayo ng String array para magkapareho ang position ng araw at sales nila
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        // Nilagyan natin ito ng heading para mas madaling maintindihan yung output
        System.out.println("--- Daily Sales ---");

        // Gumamit tayo ng for loop para hindi na kailangang i-print isa-isa yung sales ng bawat ara
        for (int i = 0; i < weeklySales.length; i++) {

            // Ginamit natin yung same index para mag-match yung araw at sales nito
            System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
        }

        // Sinimulan natin sa zero para ma-add nang tama lahat ng sales
        int totalSales = 0;

        // Gumamit tayo ng for-each loop para makuha lahat ng values sa array
        for (int dailySale : weeklySales) {

            // Ginamit natin ang += para maidagdag yung bawat sales sa totalSales
            totalSales += dailySale;
        }

        // Gumamit tayo ng double para makuha yung average na may decimal kung kinakailangan
        double averageSales = (double) totalSales / weeklySales.length;

        // Ipinakita natin dito yung total at average para makita yung weekly sales summary
        System.out.println("\n--- Weekly Summary ---");
        System.out.println("Total Sales: " + totalSales + " cups");
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // Ginamit natin yung unang value bilang starting point para mahanap yung highest at lowest sales
        int maxSales = weeklySales[0];
        int minSales = weeklySales[0];

        // Ginamit din natin yung unang araw bilang starting value ng best at worst day
        String bestDay = daysOfWeek[0];
        String worstDay = daysOfWeek[0];

        // Gumamit tayo ng for loop para ma-check yung ibang sales sa array
        // Nagsimula sa 1 kasi nagamit na natin yung unang value sa index 0
        for (int i = 1; i < weeklySales.length; i++) {

            // Gumamit tayo ng if para malaman kung may mas mataas pang sales
            if (weeklySales[i] > maxSales) {

                // Ina-update natin yung maxSales kapag may nahanap tayong mas mataas na value
                maxSales = weeklySales[i];

                // Ina-update din natin yung araw para malaman kung kailan ito nangyari
                bestDay = daysOfWeek[i];
            }

            // Gumamit ulit tayo ng if para malaman kung may mas mababang sales
            if (weeklySales[i] < minSales) {

                // Ina-update natin yung minSales kapag may nahanap tayong mas mababang value
                minSales = weeklySales[i];

                // Ina-update din natin yung araw para malaman kung kailan pinakamababa ang sales
                worstDay = daysOfWeek[i];
            }
        }

        // Ipinakita natin dito yung araw na may pinakamataas at pinakamababang sales
        System.out.println("\n--- Bests and Worsts ---");
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");

    }
}
