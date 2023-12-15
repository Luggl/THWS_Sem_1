package L6;

import java.util.Scanner;

public class L6_Ueb5 {
    public static long potenz(int basis, int exponent){
        if(exponent == 0){
            return 1;
        }
        return basis * potenz(basis, exponent - 1);
    }

    public static void main(String[] args){

        System.out.println(potenz(2, 5));

    }
}
