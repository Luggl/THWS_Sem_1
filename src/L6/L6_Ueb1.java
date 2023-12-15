package L6;

import java.util.Scanner;

public class L6_Ueb1 {
    public static double round(double numberIn){

        int x = (int) (numberIn * 10) % 10;             //x entspricht der ersten Nachkommastelle
        if(x < 5){                                      // prüfen, ob aufgerundet werden soll
            return((int)numberIn);
        }else{
            return((int)numberIn + 1);
        }

    }
    public static double roundTo(double numberIn, double nachkomma){

        double returnValue;

        for(int i = 0; i<= nachkomma; i++){                         //Schleife mit Anzahl der Durchläufe = Userangabe + 1
            numberIn = numberIn * 10;                                       //Komma wird entsprechend nach Rechts verschoben
        }
        int nachkommastelle = (int) numberIn % 10;                      //die zu prüfende Nachkommastelle wird übergeben

        if(nachkommastelle >= 5 ) {                                 // prüfen, ob aufgerundet werden soll
            numberIn = numberIn + 10 - nachkommastelle;                     // anschließende Subtraktion der letzten Stelle
        }else{
            numberIn = numberIn - nachkommastelle;
        }

        returnValue = (int) numberIn;

        for(int j = 0; j <= nachkomma; j++){                        //Nachträgliche linksverschiebung der Kommazahl
            returnValue = returnValue / 10;
        }
        return(returnValue);




    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Übergebe mir eine Zahl: ");
        double userInput = scanner.nextDouble();
        System.out.println("Übergebe mir eine Stelle, auf welche gerundet werden soll: ");
        int nachk = scanner.nextInt();
        double rounded = round(userInput);
        System.out.println("Deine Zahl ist einfach gerundet: " + rounded);
        double rounded2 = roundTo(userInput, nachk);
        System.out.println("Deine Zahl auf deine Nachkommastelle gerundet: " + rounded2);
    }
}
