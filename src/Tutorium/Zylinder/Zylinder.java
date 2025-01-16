package Tutorium.Zylinder;

public class Zylinder {

    public static double berechneRadius(double volumen){

        return(Math.pow((volumen / 3.1415), 1/3d));
    }

    public static void main(String[] args) {
        System.out.println(berechneRadius(0.5));
    }

}
