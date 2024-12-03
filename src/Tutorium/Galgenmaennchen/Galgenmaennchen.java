package Tutorium.Galgenmaennchen;

import java.util.Scanner;

public class Galgenmaennchen {

    String[] wortliste = {"Beispiel", "Karottensaft", "Magerquark", "Haarscharf", "Spaghetti"};

    char[] gesuchtesWort;
    char[] userTry;

    boolean done = false;

    int failCount = 0;
    int triesLeft = 14;

    private void init(){
        gesuchtesWort = wortliste[(int)(Math.random() * wortliste.length)].toUpperCase().toCharArray();     //gesuchtes Wort als Character-Array (alles upper case)

        userTry = new char[gesuchtesWort.length];
        for(int i = 0; i < userTry.length; i++){
            userTry[i] = '_';
        }
    }

    private void checkGuessedWord(){
        for(int i = 0; i<userTry.length; i++){
            if(userTry[i] == '_'){
                done = false;
            }
        }
    }

    private void tryChar(char in){
        boolean failcheck = true;
        for(int i = 0; i<gesuchtesWort.length; i++){
            if(in == gesuchtesWort[i]){
                userTry[i] = in;
                failcheck = false;
            }
        }
        if(failcheck){
            failCount++;
            System.out.println("Sorry - leider kein Treffer");
        }else{
            System.out.println("Stark - Treffer :)");
        }
        triesLeft--;
    }

    public void game(){
        Scanner scanner = new Scanner(System.in);
        init();
        System.out.println("Willkommen zu \"Galgenmännchen\"!\n" +
                "Hier die Regeln: \n" +
                "Du hast insgesamt "+ (triesLeft + 1) + " Versuche frei - allerdings nur 5 Fehlversuche zur Verfügung!");

        while(triesLeft > 0 && failCount < 5){
            System.out.print(15 - triesLeft + ". Versuch: ");
            for(int i = 0; i<userTry.length; i++){
                System.out.print(userTry[i]);
            }
            System.out.println();

            tryChar(scanner.nextLine().toUpperCase().charAt(0));

            done = true;
            checkGuessedWord();
            if(done){
                System.out.println("Glückwunsch - du hast das Wort erraten!");
                for(int i = 0; i< gesuchtesWort.length; i++){
                    System.out.print(gesuchtesWort[i]);
                }

                System.out.println("\nFehlversuche: " + failCount);
                System.out.println("Benötigte Versuche: " + (15 - triesLeft));
                break;
            }

        }
        if(!done) {
            System.out.println("Leider verloren!");
        }
    }

    public static void main(String[] args) {
        Galgenmaennchen g = new Galgenmaennchen();
        g.game();
    }

}
