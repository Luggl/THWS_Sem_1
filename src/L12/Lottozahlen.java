package L12;

public class Lottozahlen {
    int wert;
    Lottozahlen next;

    public Lottozahlen(int wert){
        this.wert = wert;
    }

    public int getWert(){
        return(wert);
    }
}
