package L4;

import java.util.Scanner;

public class L4_Ueb5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int userinput = scanner.nextInt();
        int hilfsvar = userinput;
        if(userinput >=0 && userinput <=1000000){
            int querprodukt = 1;
            while(hilfsvar >0){
                int rest = hilfsvar % 10;
                querprodukt = querprodukt * rest;
                hilfsvar = hilfsvar / 10;
            }
            System.out.println("Das Querprodukt der Zahl " + userinput + " betraegt: " + querprodukt);
        }else{
            System.out.println("FEHLER - Zahl ist ungueltig!");
        }
    }
}
