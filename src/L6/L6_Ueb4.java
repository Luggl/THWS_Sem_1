package L6;

import java.util.Scanner;

public class L6_Ueb4 {
    public static boolean prime(int userInput){
        if(userInput< 2){
            return false;
        }
        boolean prime = true;
        for(int i = userInput -1; i>1; i--){
            if(userInput%i == 0){
                prime = false;
            }
        }
        return prime;

    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir eine Zahl");
        int zahl = scanner.nextInt();

        if(prime(zahl)){
            System.out.println("Diese Zahl ist eine Primzahl");
        }else{
            System.out.println("Diese Zahl ist leider keine Primzahl");
        }
    }
}
