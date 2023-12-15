package L5;

import java.util.Scanner;

public class L5_Ueb5 {
    public static void main(String[] args){
        double r = 1;                          // Annahme: Radius = 1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir die Anzahl der gewünschten Rechtecke für die Näherung an PI");
        int anzahlRechtecke = scanner.nextInt();
        scanner.close();
        double ersteFlaeche = r * (1.0 / anzahlRechtecke);
        double breite = 1.0 / anzahlRechtecke;
        double ergebnis = 0;


        for(int i = anzahlRechtecke; i > 0 ; i--){
            double laenge = Math.sqrt(r - Math.pow(i*breite, 2));
            double zwischenergebnis = laenge * breite;
            ergebnis = ergebnis + zwischenergebnis;

        }

        ergebnis = (ergebnis + ersteFlaeche)*4;
        System.out.println("Pi: " + ergebnis);

    }
}
