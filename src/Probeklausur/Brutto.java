package Probeklausur;

import java.util.Scanner;

public class Brutto {

    public static double berechneNetto(double brutto, double mwst){

        double out = (brutto / ( 1 + mwst) );

        return(out);
    }

    public static void main(String[] args){
        System.out.println(berechneNetto(1.07, 0.07));

        liesZahl();
    }

    public static int liesZahl() {
        boolean x = false;
        int out = 0;

        do {
            x = false;
            Scanner scanner = new Scanner(System.in);
            String in = scanner.nextLine();
            char[] check = in.toCharArray();
            for (int i = 0; i < check.length; i++) {
                if (check[i] < '0' || check[i] > '9') {
                    x = true;
                }
            }
            if (!x) {
                out = Integer.valueOf(in);
            }else{
                System.out.println("das ist keine ganze Zahl!\nBitte nochmals versuchen");
            }


        } while(x);
        System.out.println("Das ist nun deine Ganzzahl " + out);
        return(out);
    }
}
