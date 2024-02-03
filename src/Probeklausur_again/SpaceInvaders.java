package Probeklausur_again;

import java.util.Scanner;

public class SpaceInvaders {
    public static char[][] spielfeldSpaceInv;
    public static int nave;

    public static void main(String[] args) {

        SpaceInvaders w = new SpaceInvaders();
        w.spielfeld();

        char buchstabe;
        Scanner scanner = new Scanner(System.in);
        w.printSpielfeld();
        do {
            buchstabe = scanner.next().charAt(0);
            w.bewegeDeinAss(buchstabe);
            w.printSpielfeld();
        } while (buchstabe != 'x');

    }


    public void spielfeld() {
        spielfeldSpaceInv = new char[5][8];

        for (int i = 0; i < 1; i++) {//spielfeld[5][8] 5 Reihen, 8 Spalten
            for (int j = 0; j < 8; j++) {
                spielfeldSpaceInv[i][j] = 'O';
            }
        }
        for (int k = 1; k < 5; k++) {
            for (int j = 0; j < 8; j++) {
                spielfeldSpaceInv[k][j] = ' ';
            }
        }
        int random = (int) (Math.random() * 8);
        spielfeldSpaceInv[4][random] = 'V';
    }

    public void bewegeDeinAss(char buchstabe) {


        if (buchstabe == 'd') {
            if (spielfeldSpaceInv[4][7] == ' '){
                for (int j = 7; j > 0; j--) {
                    spielfeldSpaceInv[4][j] = spielfeldSpaceInv[4][j - 1];
                }
                spielfeldSpaceInv[4][0]=' ';
            }
        }else if (buchstabe == 'a') {
            if (spielfeldSpaceInv[4][0] == ' ') {
                for (int l = 0; l < 7; l++) {
                    spielfeldSpaceInv[4][l] = spielfeldSpaceInv[4][l + 1];
                }
                spielfeldSpaceInv[4][7]=' ';
            }
        }
    }
    public void printSpielfeld() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(spielfeldSpaceInv[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
