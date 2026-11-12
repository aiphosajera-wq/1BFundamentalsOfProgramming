public class OneDimensionalArray  { // Dito binibigyan natin ng pangalan yung class ng program natin
    public static void main(String[] args) { // ito naman ang pinakasimula ng code natin.

        // Gumagawa naman tayo dito ng 1D double array na may pangalan na temperatures.
        // Double ang ginamit natin kasi may decimal yung mga temperature.
        // Limang elements lang ang kailangan kasi five days ang ita-track natin.
        double[] temperatures = {32.5, 34.0, 31.8, 33.2, 35.1};

        // Dito ginagamit natin yung for loop para ma-display lahat ng temperature.
        // Ang temperatures.length ay ginagamit para malaman kung ilang elements ba ang laman ng array.
        // Habang hindi pa naaabot ng i yung total length, magpapatuloy yung looping.
        for (int i = 0; i < temperatures.length; i++) {

            // Piniprint natin naman dito yung temperature sa bawat index gamit yung i.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }

        // Dito pinapalitan natin yung temperature ng third day mula 31.8 to 32.0.
        // Index 2 ang ginamit natin dito kasi ang array index ay nagsisimula sa 0 palagi.
        temperatures[2] = 32.0;

        // Piniprint naman natin dito yung updated temperature ng third day para makita yung bagong value.
        System.out.println("Updated temperature for Day 3: " + temperatures[2]);
    }
}
