package Tutorium.SpaceInv;

import java.util.Scanner;

public class SpaceInvaders {
    private char[][] spielfeld = new char[5][8];

    private void init(){

        for(int i = 0; i < spielfeld.length; i++){
            for(int j = 0; j < spielfeld[i].length; j++){
                if(i == 0){
                    spielfeld[i][j] = 'o';
                }else{
                    spielfeld[i][j] = ' ';
                }
            }
        }
        int pos = (int) (Math.random() * 8);
        spielfeld[4][pos] = 'V';
    }

    private void bewege(char richtung){
        if(richtung == 'a'){
            if(spielfeld[4][0] != 'V'){
                for(int i = 0; i < 7 ; i++){

                    spielfeld[4][i] = spielfeld[4][i+1];
                }
                spielfeld[4][7] = ' ';
            }
        }else if(richtung == 'd'){
            if(spielfeld[4][7] != 'V'){
                for(int i = 7; i > 0; i--){
                    spielfeld[4][i] = spielfeld[4][i-1];
                }
                spielfeld[4][0] = ' ';
            }
        }
    }

    @Override
    public String toString(){
        String out ="";
        for(int i = 0; i<spielfeld.length; i++){
            for(int j = 0; j<spielfeld[i].length; j++){
                out += spielfeld[i][j];
            }
            out += "\n";
        }
        return(out);
    }

    public static void main(String[] args) {
        SpaceInvaders s = new SpaceInvaders();
        s.init();
        Scanner scanner = new Scanner(System.in);
        System.out.println(s);

        System.out.println("Hey, gib mir einen Buchstaben: ");
        char eingabe = scanner.next().charAt(0);


        while(eingabe != 'x'){

            s.bewege(eingabe);
            System.out.println(s);
            eingabe=scanner.next().charAt(0);

        }

    }
}
