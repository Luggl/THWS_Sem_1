package Probeklausur_again;

public class Logarithmus {

    public static double natLog(double x){
        double out = 0;
        double first;
        double erg;
        if(x>0 && x<2) {
            int n = 1;
            while (true) {

                final int zaehlerX = -1;
                final double xMinus1 = x-1;
                int zaehler = zaehlerX;
                for (int i = 1; i <= n; i++) {
                    zaehler = zaehlerX * zaehler;
                }
                first = (double) zaehler / n;

                double f = x - 1;
                for(int i =1; i<n; i++){
                    f = f*xMinus1;
                }
                n++;
                erg = first * f;
                if((erg < 10E-16 && erg >0) || (erg >-10E-16 && erg <0)){
                    break;
                }
                out += erg;
            }
        }else{
            RuntimeException e = new RuntimeException("Fehler");
            throw e;
        }

        return(out);
    }

    public static void main(String[] args) {
        System.out.println(natLog(0.7));
    }

}
