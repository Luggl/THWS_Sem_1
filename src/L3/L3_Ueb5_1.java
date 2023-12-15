package L3;

import java.io.IOException;
import java.util.Scanner;

public class L3_Ueb5_1 {
    public static void main(String[] args) throws IOException {

        int[] validMatr = new int[]{50, 51, 61};
        Scanner scanner = new Scanner(System.in);
        int matrikelnummer = scanner.nextInt();
        int matrikelFirstTwo = matrikelnummer / 100000;
        String matrikelnummer_s = String.valueOf(matrikelnummer);

        boolean validMatrNr = false;

        if (matrikelnummer_s.length() == 7) {
            for (int i : validMatr) {
                if (i == matrikelFirstTwo) {
                    validMatrNr = true;
                }
            }
        } else {
            System.out.println("Die Länge der Matrikelnummer passt nicht!\nDiese muss 7 Stellen lang sein!");
        }

        if (validMatrNr) {
            System.out.println(matrikelnummer + " ist gültig.");

        } else {
            System.out.println("Achte auf die ersten zwei Stellen der Matrikelnummer!\n Erlaubte Zahlen: " + validMatr[0] + " + " +  validMatr[1] + " + " + validMatr[2]);

        }
    }
}
