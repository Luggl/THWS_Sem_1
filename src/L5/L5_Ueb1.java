package L5;

public class L5_Ueb1 {
    public static void main(String[] args){

        int k = 1;

        double summand;
        double check2;
        double check;


        do{

            summand = 6.0 * (1.0/(k*k));

            System.out.println("Ergebnis der Formel mit k = " + k + "  :  " + summand);
            k++;
            check2 = 6.0 * (1.0/(k*k));

            check = summand - check2;

        }while(check>1E-5);

        // c) Keine Auswirkung


    }
}
