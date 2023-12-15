package L9;

public class L9_Ueb2 {
    public static void main(String [] args){

        float[] preiseMargharita = {9.60f, 12.50f};
        float[] preiseSchinken = {11.30f, 14.50f};
        float[] preiseHawaii = {11.50f, 15.00f};
        float[] durchmesser =  {26f, 32f};

        Pizza margharita = new Pizza("Marharita",durchmesser, preiseMargharita);
        Pizza schinken = new Pizza("Schinken", durchmesser, preiseSchinken);
        Pizza hawaii = new Pizza("Hawaii", durchmesser, preiseHawaii);

        double[] preisLeistungPizzen = {margharita.mVPPizza(), schinken.mVPPizza(), hawaii.mVPPizza()};

        ;
    }
}
