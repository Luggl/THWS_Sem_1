package L4;

import java.util.Scanner;

public class Notenskala {
    public static void main(String []args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ihre Note wird ermittelt \nBitte geben Sie Ihre erreichte Punktzahl ein: ");
        double erreichtePunkte = scanner.nextDouble();

        System.out.println(Notenrechner(erreichtePunkte));


    }

    public static String Notenrechner(double erreichtePunkte){

        int ersteNachkomma = (int) (erreichtePunkte*10) % 10;
        int erreichtInt = (int) erreichtePunkte * 10;

        String output;
        if(erreichtInt < 0 || erreichtePunkte > 900) {
            output = "Der Punktewert muss zwischen 0 und 90 liegen";
        }else if(ersteNachkomma != 5 && ersteNachkomma != 0){
            output = "Der Punktewert darf nur auf Komma 0 oder Komma 5 enden!";
        }else{

            int differenzZuVollerPunktzahl = 900 - erreichtInt;
            int notenUebergang = 0;
            int counter = 0;
            for(int i = differenzZuVollerPunktzahl; i > 0; i--){
                counter++;
                if(counter == 45){
                    notenUebergang++;
                    counter = 0;
                }

            }
            double[] noten = {1.0, 1.3, 1.7, 2.0, 2.3, 2.7, 3.0, 3.3, 3.7, 4.0};

            System.out.println("\tPunkte \tNote");
            double punkteschwelle = 90;
            for(int j = 0; j < noten.length; j++){
                System.out.println("ab " + (punkteschwelle - 4.5) + "\t\t\t" + noten[j]);
                punkteschwelle = punkteschwelle - 4.5;
            }

            if(notenUebergang <10){
                double note = noten[notenUebergang];
                output = "Sie haben die Note " + note + " erreicht";
            }else{
                output = "Sie sind leider durchgefallen";
            }

        }
        return output;
    }
}
