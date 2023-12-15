package L3;

import java.util.Scanner;

public class L3_Ueb3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Gib mal ein Zeichen");
        char i = scan.next().charAt(0);
        if(i >= 65 && i <= 90){
            System.out.println("Großbuchstabe");

        }
        if(i >= 48 && i <= 57 || i >= 65 && i <= 70 || i >= 97 && i <= 102){
            System.out.println("Hexadezimale Ziffer");
        }
        if(i == 48 || i == 49){
            System.out.println("binäre Ziffer");
        }
        if(i >= 48 && i <= 55){
            System.out.println("oktale Ziffer");
        }
    }
}
