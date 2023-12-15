package L2;

import L1.L1_Ueb4;

import java.util.Scanner;

public class L2_Ueb1 {

    public static void main(String[] args) {
        /*Schreiben Sie ein Programm, das – bei gegebenen Radius r eines Kreises – die
Kreisfläche (r2) und den Kreisumfang (2r) berechnet und auf der Standardausgabe
mit Hinweistext ausgibt.
Wie groß wäre das Volumen, falls es sich statt eines Kreises um eine Kugel handelte
? Berechnen Sie das Volumen und geben Sie es aus! Sie können die Kreis‐ und
die Kugelberechnungen im gleichen Programm stattfinden lassen.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Wie groß ist der Radius?: ");

        double r = input.nextDouble();
        double kreisflaeche = Math.PI*r*r;
        double kreisumfang = 2.0 * Math.PI * r;
        double kugelvolumen = (4.0 / 3.0) * Math.PI * r * r * r;

        System.out.println("Kreisfläche: " + kreisflaeche +"\nKreisumfang: " + kreisumfang + "\nKugelvolumen: " + kugelvolumen);
    }
}
