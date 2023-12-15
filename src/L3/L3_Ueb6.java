package L3;

import java.util.Scanner;

public class L3_Ueb6 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir eine Jahreszahl: ");
        int jahreszahl = scanner.nextInt();
        boolean check = false;

        if(jahreszahl%4==0){
            check = true;
            if(jahreszahl%100 == 0 && !(jahreszahl%400==0)){
                check = false;
            }else {
                check = true;
                }

            }

        if(check){
            System.out.println("Deine Jahreszahl " + jahreszahl + " ist ein Schaltjahr");

        }else{
            System.out.println("Deine Jahreszahl " + jahreszahl + " ist kein Schaltjahr");
        }
    }
}
