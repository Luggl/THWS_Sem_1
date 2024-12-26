package Probeklausur;

public class Artikel {
    private int artikelnr;
    private String bezeichnung;

    public int getArtikelnr() {
        return artikelnr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setArtikelnr(int artikelnr) {
        this.artikelnr = artikelnr;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Artikel(int artikelnr, String bezeichnung){
        this.artikelnr = artikelnr;
        this.bezeichnung = bezeichnung;
    }
}
