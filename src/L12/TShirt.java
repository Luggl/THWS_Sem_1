package L12;

public class TShirt {
    private String farbe;
    private String marke;
    TShirt next;
    TShirt prev;

    public TShirt(String farbe, String marke){
        this.farbe = farbe;
        this.marke = marke;
    }
    public String getFarbe(){
        return(farbe);
    }
    public String getMarke(){
        return(marke);
    }
}
