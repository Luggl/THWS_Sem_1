package L10;


import L9.Raum;

public class L10_Ueb1 {

    public static void main(String[] args){

        Raum raumI21 = new Raum("I.2.1", 35, false);
        Raum raumI314 = new Raum("I.3.14", 41, false);

        raumI21.betreteRaum("Denis Gashi, \t\t502341596");
        raumI21.betreteRaum("Tom Hogrefe, \t\t502341597");
        raumI21.betreteRaum("Lukas Langpeter, \t\t502341591");
        raumI21.setBelegt();
        System.out.println(raumI21.isBelegt());
        String[] out = raumI21.getStudenten();
        for(int i = 0; i<out.length; i++){
            System.out.println(out[i]);
        }

    }

}
