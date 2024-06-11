package L7;

import java.util.Scanner;

public class L7_Ueb1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir eine Zahl und ich berechne dir deren Sinus: ");
        double x = scanner.nextDouble();

        System.out.println("Der Sinus von: " + x + " = " + sinus(x));


    }
    /**
     * Berechnet den Sinus von der übergebenen Zahl x
     * @param x reelle Zahl (in RAD), von der der Sinus berechnet werden soll.
     * @return Ergebnis des Sinus; übergibt eine reelle Zahl zwischen 1 und -1 (beide inkl.)
     */
    public static double sinus(double x){


        double zaehler = x;
        double nenner = 1;
        double summe = x;
        double summand = 1;

        for(int i = 3; summand > 1E-15 || summand < -1E-15; i = i+2){
            zaehler = zaehler * x * x * (-1);
            nenner = nenner * (i-1) * (i);
            summand = zaehler / nenner;
            summe = summe + summand;


            }
        return(summe);
        }
    }

