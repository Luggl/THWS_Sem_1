package L2;

import org.w3c.dom.ls.LSOutput;

public class Zusatz_Funktion {
    public static void main(String[] args){
        
        for (int i=-5; i<6; i = i + 5) {
            double f1 = 0.5 * i - 3;
            double f2 = Math.pow(i+2, 2);
            double f3 =Math.pow(i, 3);
            System.out.println("x = " +i);
            System.out.println("f1: 0.5 * " + i + " - 3 = " + f1);
            System.out.println("f2: (" + i + " + 2)^2 = " + f2);
            System.out.println("f3: (" + i + ")^3 = " +f3);
        }

    }




}
