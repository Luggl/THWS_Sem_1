package L7;

public class L7_Ueb5 {
    public static void main(String[] args){

        System.out.println(wahrscheinlichkeit());

    }

    public static double wahrscheinlichkeit(){

        int[] verteilungSchubladen = {0, 0, 0};
        int ersteWahrscheinlichkeit;
        int anzahlMuenzeImSchreibtisch = 0;
        int versuche = 10000;

        for(int i = 0; i<versuche; i++) {
            ersteWahrscheinlichkeit = (int) (Math.random() * 2);
            if (ersteWahrscheinlichkeit == 1) {
                int counter = (int) (Math.random() * 3);
                verteilungSchubladen[counter]++;
                anzahlMuenzeImSchreibtisch++;
            }
        }
        double wahrscheinlichkInSchreibtisch = (double) anzahlMuenzeImSchreibtisch / versuche;
        double wahrscheinlichkIn3WennInSchr = (double) verteilungSchubladen[2] / anzahlMuenzeImSchreibtisch;
        double wahrscheinlichkeitNichtInSchreibtisch = wahrscheinlichkInSchreibtisch;
        double wahrscheinlichkeitIn2Oder3 = (double) (verteilungSchubladen[0] + verteilungSchubladen[1]) / anzahlMuenzeImSchreibtisch;
        double ergebnis = (wahrscheinlichkInSchreibtisch * wahrscheinlichkIn3WennInSchr) / (wahrscheinlichkeitNichtInSchreibtisch + (wahrscheinlichkInSchreibtisch * wahrscheinlichkIn3WennInSchr));

        System.out.println("Warscheinlichkeit Schreibtisch / nicht Schreibtisch: " + wahrscheinlichkInSchreibtisch + " / " + wahrscheinlichkeitNichtInSchreibtisch);
        System.out.println("Wahrscheinlichkeit in 3 Wenn in Schreibtisch: " + wahrscheinlichkIn3WennInSchr);
        System.out.println("Wahrscheinlichkeit in 2 oder 3 wenn in Schreibtisch: " + wahrscheinlichkeitIn2Oder3);




        return(ergebnis);
    }
}
