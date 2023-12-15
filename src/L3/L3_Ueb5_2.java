package L3;

import java.util.Scanner;

public class L3_Ueb5_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userinput = scanner.nextInt();
        if(userinput>=5000000 && userinput< 5200000 || userinput>=6100000 && userinput<6200000){
            System.out.println("Die Matrikelnummer " + userinput + " ist gültig");
        }else if(userinput<1000000 || userinput > 9999999){
            System.out.println("Die Länge der Matrikelnummer passt nicht.\nDie Nummer muss 7-stellig sein.");
        }else{
            System.out.println("Bitte beachte die ersten zwei Ziffern - Diese müssen 50, 51 oder 61 sein!");
        }
    }
}
