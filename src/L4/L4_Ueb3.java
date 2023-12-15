package L4;

import java.util.Scanner;

public class L4_Ueb3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte zu untersuchende Zahl eingeben: ");
        int userZahl = scanner.nextInt();

        //Prüfen, ob eingegebene Zahl eine Primzahl ist - Diese Prüfung für alle Zahlen bis zur eingegebenen

       // while(userZahl > 1){                    //Diese While-Schleife ist lediglich für b) gedacht
            int hilfsVar = userZahl;
            boolean primCheck = true;

            while (hilfsVar>1){
                if(hilfsVar == userZahl){
                    hilfsVar--;
                } else if (userZahl % hilfsVar == 0) {
                    primCheck = false;
                    hilfsVar--;
                } else{
                    hilfsVar--;
                }
            }

            if(primCheck){
                System.out.println("Untersuchte Zahl " + userZahl + " ist eine Primzahl!");
            }else{
                System.out.println("Untersuchte Zahl " + userZahl + " ist keine Primzahl!");
            }
          //  userZahl--;}
    }

}
