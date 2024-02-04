package Probeklausur_again;

public class Prozent {
    public static double berechneProzent(int wert, int anteil){
        double out = -1.0;
        if(wert >=0 && anteil >=0){
            out = wert * ((float) anteil/100);
        }
        return(out);
    }

    public static void main(String[] args) {
        System.out.println(berechneProzent(30, 5));
    }
}
