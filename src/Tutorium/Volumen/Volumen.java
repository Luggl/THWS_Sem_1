package Tutorium.Volumen;

public class Volumen {

    public static double radius(double volumen){
        double rHochDrei = volumen / Math.PI;
        return(Math.pow(rHochDrei, 1/3d));
    }

    public static void main(String[] args) {
        System.out.println(radius(0.5));
    }
}
