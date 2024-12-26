package Probeklausur;

public class Bestellung {
    private int bestellnr;
    private Artikel[] artikelListe = new Artikel[50];

    public Artikel[] getArtikelListe() {
        return artikelListe;
    }

    public int getBestellnr() {
        return bestellnr;
    }

    public void einfuegen(Artikel in){
        for(int i = 0; i<artikelListe.length; i++){
            if(artikelListe[i] == null){
                artikelListe[i] = in;
                break;
            }
        }
    }

}
