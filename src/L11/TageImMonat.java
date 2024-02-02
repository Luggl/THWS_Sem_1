package L11;

import java.util.Scanner;

public class TageImMonat {
    public static int tageImMonat(String monat){

        int tage = switch(monat){
            case "Februar" -> 28;
            case "April", "Juni", "September", "November" -> 30;
            case "Januar", "März", "Mai", "Juli", "August", "Oktober", "Dezember" -> 31;
            default -> throw new RuntimeException("falscher Monatsname");
        };
        return tage;
    }
    public static void main(String[] args){
        boolean fehlerCatch;
        do{

            try{
                Scanner scanner = new Scanner(System.in);
                String monat = scanner.nextLine();
                System.out.println(tageImMonat(monat));
                fehlerCatch = false;
            }catch (RuntimeException e){
                System.out.println("Fehlerhafte Eingabe!");
                fehlerCatch = true;

            }
        }while(fehlerCatch);
    }
}

