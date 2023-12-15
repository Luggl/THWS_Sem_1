package L5;

import java.util.Scanner;

public class L5_Ueb4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir eine gesuchte Quadratwurzel als int: ");
        int x = scanner.nextInt();
        double y = 0.8;
        double check;

        double formel;

        do{

            formel = (y+ (x/y)) / 2;

            y = formel;
            check = (x/y) - y;
            if(check<0){
                check = check * -1;
            }

        }while(check > 1E-10);
        System.out.println(formel);

        System.out.println("Nach Methode: " + Math.sqrt(x));

    }
}
