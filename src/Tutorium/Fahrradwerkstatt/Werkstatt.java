package Tutorium.Fahrradwerkstatt;

public class Werkstatt {
    public static void main(String[] args) {
        Lagerraum lagerraum = new Lagerraum();
        Fahrrad ridley = new Fahrrad("Ridley 1", 54, "weiß");
        Fahrrad canyon = new Fahrrad("Canyon", 56, "blau");
        Fahrrad sworks = new Fahrrad("SWorks", 56, "schwarz");
        Fahrrad ridley2 = new Fahrrad("Ridley 2", 52, "weiß");
        Fahrrad canyon2 = new Fahrrad("Canyon", 56, "gelb");

        lagerraum.einsortieren(ridley);
        lagerraum.einsortieren(canyon);
        lagerraum.einsortieren(sworks);
        lagerraum.einsortieren(ridley2);
        lagerraum.einsortieren(canyon2);

//        System.out.println(lagerraum);
//
//
//        System.out.println();
//        System.out.println();

        Lagerraum_einfach lagerraumEinfach = new Lagerraum_einfach();

        lagerraumEinfach.einfuegen(ridley);
        lagerraumEinfach.einfuegen(canyon);
        lagerraumEinfach.einfuegen(sworks);
        lagerraumEinfach.einfuegen(ridley2);
        lagerraumEinfach.einfuegen(canyon2);

//        System.out.println(lagerraumEinfach);


//        lagerraum.aussortieren(3);
//        System.out.println(lagerraum);


        System.out.println(ridley.next.getMarke() + " " + ridley.next.getFarbe());
    }
}
