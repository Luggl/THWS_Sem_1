package L3;

import java.util.Scanner;

import L7.*;


public class L3_Ueb1 {
    public static void main(String[] args){
        /*
        Schreiben Sie ein Programm, welches vom Benutzer eine ganze Zahl einliest und mithilfe
        des Modulo‐Operators überprüft, ob die Zahl ganzzahlig durch 7 teilbar ist. Anschließend
        soll eine entsprechende Ausgabe auf der Standardausgabe erfolgen
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Gib mir einen int und ich werde dir sagen, ob die Zahl durch 7 teilbar ist: ");

        double userInput = input.nextDouble();

        double term = userInput % 7;

        if(term == 0){
            System.out.println("Yes, durch 7 teilbar");

        } else {
            System.out.println("Nope, das war nix");
        }




    }

}
