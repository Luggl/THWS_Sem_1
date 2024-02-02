package Data;

public class Auto {

    public String farbe;
    public String marke;
    Auto next;
    Auto prev;

    public Auto(String farbe, String marke){
        this.farbe = farbe;
        this.marke = marke;
    }
}
