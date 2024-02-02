package Probeklausur_again;

public class Artikel {
    int artikelnummer;
    String artikelname;

    public Artikel(int artikelnummer, String artikelname){
        this.artikelnummer = artikelnummer;
        this.artikelname = artikelname;
    }
    public int getArtikelnummer(){
        return(artikelnummer);
    }
    public String getArtikelname(){
        return(artikelname);
    }
    public void setArtikelnummer(int artikelnummer){
        this.artikelnummer = artikelnummer;
    }
    public void setArtikelname(String artikelname){
        this.artikelname = artikelname;
    }

}
