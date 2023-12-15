package L5;

import java.util.Scanner;

public class L5_Ueb2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir einen Basis als double");
        double b = scanner.nextDouble();
        System.out.println("Gib mir einen Exponenten als int");
        int n = scanner.nextInt();

        double out = 1;

        do{
            out = b * out;

            n--;
        }while(n>0);
        System.out.println("Das Ergebnis: " + out);
    }
}
