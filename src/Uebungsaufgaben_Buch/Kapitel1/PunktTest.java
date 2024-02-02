package Uebungsaufgaben_Buch.Kapitel1;

public class PunktTest {
    public static void main(String[] args) {
        Punkt h = new Punkt(3, 8);
        h.anzeige();
        h.setX(4.8);
        h.setY(8.3);
        h.anzeige();
    }
}
