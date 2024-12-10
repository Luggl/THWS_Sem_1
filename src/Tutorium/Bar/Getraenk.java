package Tutorium.Bar;

public class Getraenk {

    private String name;
    private int fuellstand;
    private int wert;
    Getraenk next;
    Getraenk prev;

    public Getraenk(String name, int fuellstand, int wert){
        this.name = name;
        this.fuellstand = fuellstand;
        this.wert = wert;
    }

    public String getName(){
        return(name);
    }
    public int getFuellstand(){
        return(fuellstand);
    }
    public int getWert(){
        return(wert);
    }
}
