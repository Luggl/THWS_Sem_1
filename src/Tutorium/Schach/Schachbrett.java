package Tutorium.Schach;

import java.util.Scanner;

public class Schachbrett {
    char[][] spielfeld = new char[8][8];
    int zeile = 0;
    int reihe = 0;

    public void fuegeHinzu(char in){
        if(!istVoll()){
            spielfeld[zeile][reihe] = in;
            if(reihe == 7){
                reihe = 0;
                zeile++;
            }else{
                reihe++;
            }
        }

    }
    private boolean istVoll(){
        if(reihe == 7 && zeile == 7){
            return(true);
        }else{
            return(false);
        }
    }
    
    @Override
    public String toString() {
        String out = "";

        for(int i = 0; i < spielfeld.length; i++) {
            for(int j = 0; j < spielfeld[i].length; j++) {
                if(spielfeld[i][j] != 0) {
                    out += spielfeld[i][j];
                }
                else {
                    out += '_';
                }
            }
            out += "\n";
        }
        return out;
    }

    public static void main(String[] args) {
        Schachbrett schachspielfeld = new Schachbrett();
        Scanner scanner = new Scanner (System.in);
        int counter = 0;
        while(counter <= 64) {
            try {
                System.out.println("Bitte Eingabe tätigen:");
                char zeichen = scanner.next().charAt(0);
                schachspielfeld.fuegeHinzu(zeichen);
                counter++;

                System.out.println(schachspielfeld);
            }
            catch(Exception e) {
                System.out.println("Fehler");

            }
        }
    }

}
