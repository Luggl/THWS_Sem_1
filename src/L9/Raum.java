package L9;

public class Raum {
    private String kennung;
    private int anzahlMax;
    boolean belegt;

    public Raum(String kennung, int anzahlMax, boolean belegt){

        this.kennung = kennung;
        this.anzahlMax = anzahlMax;
        this.belegt = belegt;
    }


    public String getKennung(){
        return kennung;
    }
    public int getAnzahlMax(){
        return anzahlMax;
    }

}
