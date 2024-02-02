package Probeklausur;

public class min {

    public static void main(String[] args){
        Zielort a = new Zielort(0, "Würzburg");
        Fahrstrecke x = new Fahrstrecke();
        Fahrstrecke.einfuegen(a);
        Zielort b = new Zielort(19, "Kitzingen");
        Fahrstrecke.einfuegen(b);
        Zielort c = new Zielort(42, "Neustadt");
        Fahrstrecke.einfuegen(c);
        Zielort d = new Zielort(49, "Nürnberg");
        Fahrstrecke.einfuegen(d);

        System.out.println("Gesamtdistanz: " + Fahrstrecke.gesamtStrecke());
        System.out.println(b);

    }
}
