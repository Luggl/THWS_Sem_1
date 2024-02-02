package Probeklausur_again;

public class Bestellung {
    private int bestellnr;
    public Artikel[] artikel = new Artikel[50];

    public Bestellung(int bestellnr, Artikel[] artikel){
        this.bestellnr = bestellnr;
        this.artikel = artikel;
    }
    public void einfuegen(Artikel in){
        for(int i = 0; i<50; i++){
            if(artikel[i] == null){
                artikel[i] = in;
                break;
            }
        }
    }
    //Signatur: public entfernen(int artikelnummer);
    //public entfernen(String artikelname);
    //public entfernen(Artikel x);
    //Rückgabetyp:
}
