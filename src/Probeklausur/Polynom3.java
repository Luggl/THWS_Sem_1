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
        return(a*x*x*x + b*x*x + c*x + d);
    }


    @Override
    public String toString(){
        String out = a + "x³";
        if(b >0){
            out += " +";
        }
        out += " " + b + "x²";

        if(c>0){
            out += " +";
        }
        out += " " + c + "x";
        if(d>0){
            out += " + ";
        }
        out += " " + d;

        return(out);
    }
    public static void main(String[] args) {
        Polynom3 p = new Polynom3(1.5, 4, 1.3, -8);
        System.out.println(p);
        System.out.println(p.berechneAnDerStelleX(2));

    }
}
