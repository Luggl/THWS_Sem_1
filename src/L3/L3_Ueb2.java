package L3;
import java.util.Scanner;

public class L3_Ueb2 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String output1 = "Die erste Variante ist die beste Variante!";
        String output2 = "Die zweite Variante ist die beste Variante!";
        String output3 = "Die Werte sind identisch";
        String output = "";
        double preisLeistung = 0;

        for(int i = 0; i < 2; i++) {
            System.out.println("Welchen Durchmesser hat die Pizza? 26 cm / 28 cm / 30 cm?");
            int durchmesser = userInput.nextInt();
            System.out.println("Was kostet die Pizza?");
            double Preis = userInput.nextDouble();
            double flaecheninhalt = ((double) durchmesser / 2) * ((double) durchmesser / 2) * Math.PI;

            if (preisLeistung == 0) {
                preisLeistung = Preis / flaecheninhalt;
                output = output1;

            } else if (Preis / flaecheninhalt < preisLeistung) {
                preisLeistung = Preis / flaecheninhalt;
                output = output2;
            }else{
                output = output3;
            }
        }

        System.out.println(output);

    }
}
