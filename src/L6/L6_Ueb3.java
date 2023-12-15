package L6;

import java.util.Scanner;

public class L6_Ueb3 {
    public static void dreieck(int countLines){
        String x = "* ";
        String leer = " ";
        for(int i = 1; i<= countLines; i++){

            for(int k = countLines -i; k > 0 ; k--){
                System.out.printf(leer);
            }

            for(int j = 0; j<i; j++){
                System.out.printf(x);
            }
            System.out.printf("\n");

        }
        for(int l = 0; l <= countLines; l=l + 3){

            for(int m = 0; m< countLines - (countLines / 4); m++){
                System.out.printf(leer);
            }
            for(int n = 0; n < (countLines / 4); n++){
                System.out.printf(x);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        dreieck(userInput);
    }
}
