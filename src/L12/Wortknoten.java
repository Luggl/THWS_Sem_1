package L12;

public class Wortknoten {

    private String wort;
    private String bedeutung;
    Wortknoten left;
    Wortknoten right;

    public void setWort(String wort){
        this.wort = wort;
    }
    public void setBedeutung(String bedeutung){
        this.bedeutung = bedeutung;
    }

    public String getWort(){
        return(wort);
    }
    public String getBedeutung(){
        return(bedeutung);
    }
}
