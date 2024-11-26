package de.thws;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            double x = scanner.nextDouble();
            System.out.println(x);
        }catch(InputMismatchException e){
            System.out.println("InputMismatch gefunden");
        }catch(Exception e) {
            System.out.println("Fehler gefunden");
        }

        System.out.println("Außerhalb");
    }

}
