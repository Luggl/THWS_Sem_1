package Tutorium.Fahrradwerkstatt;

public class Fahrrad {
    private String marke;
    private int rahmenhoehe;
    private String farbe;
    Fahrrad next;


    private int index;

    public Fahrrad(String marke, int rahmenhoehe,String farbe){
        this.marke = marke;
        this.rahmenhoehe = rahmenhoehe;
        this.farbe = farbe;
    }

    public String getMarke(){
        return marke;
    }

    public int getRahmenhoehe(){
        return rahmenhoehe;
    }

    public String getFarbe(){
        return farbe;
    }

    public int getIndex(){
        return index;
    }
    public void setIndex(int index){
        this.index = index;
    }
}
