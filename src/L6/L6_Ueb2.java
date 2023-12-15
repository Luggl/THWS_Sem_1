package L6;

import java.util.Scanner;

public class L6_Ueb2 {
    public static int fakultät(int userInput){

        int returnValue = 1;

        for(int i = 1; i<=userInput; i++){
            returnValue = returnValue * i;
        }
        return(returnValue);
    }
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir eine Zahl und ich errechne dir deren Fakultät: ");
        int fak = scanner.nextInt();

        System.out.println("Fakultät: " + fakultät(fak));
    }
}
