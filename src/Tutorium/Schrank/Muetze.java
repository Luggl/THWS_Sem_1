package Tutorium.Schrank;

public class Muetze {
    private String marke;
    private int value;
    Muetze prev;

    public Muetze(String marke, int value){
        this.marke = marke;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getMarke() {
        return marke;
    }

    @Override
    public String toString(){
        return("Marke: " + marke + " ----- Wert: " + value);
    }
}
