package L5;

import java.util.Scanner;

public class L5_Ueb6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int x;

        System.out.println("Ihre eingegebenen Zahlen werden addiert.");
        System.out.println("Die Eingabe von 0 beendet das Programm");

        do{
            x = scanner.nextInt();
            sum = sum + x;

        }while(!(x==0));

        System.out.println("Summe: " + sum);
    }
}
