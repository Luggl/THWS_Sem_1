package L10;

import L8.Auto;

public class AutoFabrik {

    public Auto produziere(String marke, String farbe, int hubraum, int ps, int drehmoment){


        return new Auto(marke, farbe, hubraum, ps, drehmoment);
    }

    public static void main(String[] args){

        Auto auto = new AutoFabrik().produziere("Mitsubishi", "blau", 3600, 285, 3200);

        System.out.println(Auto.anzahlProd);
        System.out.println(auto.getPs());

    }

}

