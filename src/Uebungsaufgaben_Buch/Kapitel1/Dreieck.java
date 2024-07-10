package Uebungsaufgaben_Buch.Kapitel1;

import java.util.Scanner;

public class Dreieck {
    int anzahlZeilen;
    String leer = "  ";
    String x = "* ";
    String test = "asdlkhajgt";
    public Dreieck(int anzahlZeilen){
        this.anzahlZeilen = anzahlZeilen;
    }

    public void init(){

        for(int i = 0; i<test.length(); i++){

            for(int j = 0; j<(anzahlZeilen-i)/2; j++){
                System.out.print(leer);
            }
            if(i % 2 != 0){
                System.out.print(" ");
            }

            for(int k = 0; k<(i+1); k++ ){
                System.out.print(x);
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
//        Dreieck d = new Dreieck(12);
//        d.init();
        Scanner scanner = new Scanner(System.in);
        int q = Integer.parseInt(scanner.next());
        scanner = new Scanner(System.in);
        for(int i = 0; i<q; i++){
            String values = scanner.nextLine();
            int a = Integer.valueOf(values.substring(0, values.indexOf(' ')));
            values = values.substring(values.indexOf(' ')+1);
            int b = Integer.valueOf(values.substring(0, values.indexOf(' ')));
            int n = Integer.valueOf(values.substring(values.indexOf(' ')+1));
            int erg = a;
            for(int j = 0; j<n; j++){
                erg += Math.pow(b, j) * b;
                System.out.print(erg + " ");
            }
        }

    }
}
