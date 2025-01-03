package Tutorium.OnlineShop;

public class Kunde {
    public Bestellung[] bestellungen = new Bestellung[50];

    public Bestellung suchenArtikel(String gesucht){
        for(int i = 0; i<bestellungen.length; i++){
            for(int j = 0; j<bestellungen[i].getArtikel().length; j++){
                if(bestellungen[i].getArtikel()[j].artikelname.equals(gesucht)){
                    return(bestellungen[i]);

                }
            }
        }
        return(null);
    }
}
