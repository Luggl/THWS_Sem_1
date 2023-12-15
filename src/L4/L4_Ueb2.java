package L4;

import java.util.Scanner;

public class L4_Ueb2 {
    public static void main(String[] args){
        double fallbeschleunigung = 9.80665;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Falldauer in Sekunden angeben: ");
        int falldauer = scanner.nextInt();
        for(int i = 1; i<= falldauer; i++){
            double Strecke = 0.5*fallbeschleunigung*i*i;

           // if (i % 10 == 1 || i %10 == 6) {                //b) prüfen, ob i = n*5+1
                System.out.println("Zeit: " + i + " Sekunden: Zurückgelegte Strecke: " + Strecke + " m");
           // }
        }
    }

}
