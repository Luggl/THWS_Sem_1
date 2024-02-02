package Probeklausur;

public class Polynom3 {
    double a;
    double b;
    double c;
    double d;

    public Polynom3(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double berechneAnDerStelleX(double x){
        int anzahl = 3;
        double out = 0;
        double erster = 1;
        double zweiter = 1;
        double dritter = 1;
        for(int i = 0; i<anzahl; i++){
            erster = erster * x;
        }

        return(out);
    }

//    public Polynom3 leiteAn(Polynom3 x){
//
//    }
}
