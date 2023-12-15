package L8;

import java.util.Arrays;
import java.util.Scanner;

public class L8_Ueb1 {
    public static void main(String[]args){

        galgenmaennchen();

    }
    public static void galgenmaennchen(){

        Scanner scanner = new Scanner(System.in);

        int anzahlVersuche = 1;

        int anzahlFehler = 0;

        String[] woerter = {"PROGRAMMIERSPRACHE", "BOMBERJACKE", "KAESEBROT", "BANANENREPUBLIK", "SNUEFFELSTUECK"};
        int rand = (int) (Math.random()*5);
        char[] gesuchtesWort = woerter[rand].toCharArray();
        char[] userLoesung = new char[gesuchtesWort.length];
        for(int i = 0; i<gesuchtesWort.length; i++){
            userLoesung[i] = '_';
        }


        do{
            boolean foundAChar = false;
            System.out.println(anzahlVersuche + ". Versuch: " + String.valueOf(userLoesung));
            L8.Hangman_Class.Hangman_Function(anzahlFehler);
            char userGuess = scanner.next().charAt(0);
            if(userGuess >= 'a' && userGuess <= 'z'){           // prüfen ob Buchstaben klein geschrieben wurden
                userGuess = (char) (userGuess - 32);            // falls ja, Buchstaben in groß umwandeln
            }
            anzahlVersuche++;

            for(int j = 0; j<userLoesung.length; j++){
                if(userGuess == gesuchtesWort[j]){
                    userLoesung[j] = gesuchtesWort[j];
                    foundAChar = true;
                }
            }
            if(!(foundAChar)){
                anzahlFehler++;
                Hangman_Class.Hangman_Function(anzahlFehler);
            }

        }while(anzahlVersuche<=15 && !(Arrays.equals(userLoesung, gesuchtesWort)));
        if(Arrays.equals(userLoesung, gesuchtesWort)){
            System.out.println("Herzlichen Glückwunsch! Du hast das gesuchte Wort erraten: " + String.valueOf(userLoesung));
        }else{
            System.out.println("Tut mir Leid, du hast leider verloren!");
        }


        }


    }

