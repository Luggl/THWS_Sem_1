package L3;

import java.util.Scanner;

public class L3_Ueb7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir eine Stundenangabe bis 23");
        int stunden = scanner.nextInt();
        System.out.println("Gib mir eine Minutenangabe bis 59");
        int minuten = scanner.nextInt();
        System.out.println("Gib mir eine Sekundenangabe bis 59");
        int sekunden = scanner.nextInt();

        boolean checkStunden = true;
        boolean checkMinuten = true;
        boolean checkSekunden = true;

        String failCheckStunden = "Deine Stundenangabe ist fehlerhaft! Bitte von 0 bis 23.";
        String failCheckMinuten = "Deine Minutenangabe ist fehlerhaft! Bitte von 0 bis 59";
        String failCheckSekunden = "Deine Sekundenangabe ist fehlerhaft! Bitte von 0 bis 59";

        if(!(stunden >= 0 && stunden <= 23)){
            System.out.println(failCheckStunden);
            checkStunden = false;
        }
        if(!(minuten >= 0 && minuten <= 59)){
            System.out.println(failCheckMinuten);
            checkMinuten = false;
        }
        if(!(sekunden >= 0 && sekunden <= 59)){
            System.out.println(failCheckSekunden);
            checkSekunden = false;
        }

        if(checkStunden && checkMinuten && checkSekunden){
            System.out.println("Deine angegebene Uhrzeit ist korrekt formatiert");
        }


    }
}
