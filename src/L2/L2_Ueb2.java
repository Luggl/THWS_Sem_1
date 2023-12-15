package L2;

import java.util.Scanner;

public class L2_Ueb2 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Ganzzahl Wert für p & q: ");

        int p = scan.nextInt();
        int q = scan.nextInt();

        double diskr = -(p/2.0);

        double check = (p/2.0)*(p/2.0)-q;

        if(check>0) {
            double formelPos = diskr + Math.sqrt(check);
            double formelNeg = diskr - Math.sqrt(check);
            System.out.println("x1= " + formelPos);
            System.out.println("x2= " + formelNeg);

        } else if(check == 0){
            System.out.println("Es gibt nur eine Lösung: " + diskr);

        } else{
            System.out.println("Bitte erneut starten - ungültige Werte!");
        }

    }
}
