package Tutorium.OnlineShop;

public class Bestellung {
    public int bestellnr;
    private Artikel[] artikel = new Artikel[50];

    public Artikel[] getArtikel(){
        return(artikel);
    }

    public void setArtikel(Artikel[] artikel){
        this.artikel = artikel;
    }

    public void einfuegen(Artikel in){
        for(int i = 0; i < artikel.length; i++){
            if(artikel[i] == null){
                artikel[i] = in;
                break;
            }
        }
    }

    public void loeschen(int artikelnr){};

}
