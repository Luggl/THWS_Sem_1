package L8;

public class Auto {
    private String marke, farbe;
    private int hubraum;
    private int ps;
    private int drehmoment;
    public static int anzahlProd = 0;

    public Auto(String marke, String farbe, int hubraum, int ps, int drehmoment){
        this.marke = marke;
        this.farbe = farbe;
        if(hubraum > 0) {
            this.hubraum = hubraum;
        }else{
            this.hubraum = 1600;        //default
        }
        this.ps = ps;
        this.drehmoment = drehmoment;
        anzahlProd++;
        System.out.println("Glückwunsch, das ist das " + anzahlProd + ". Auto!");
    }


    public String toString(){
        return("Marke: " + marke + "\nFarbe: " + farbe + "\nHubraum: " + hubraum + "\nPS: " + ps + "\nDrehmoment: " + drehmoment);
    }

    public void setHubraum(int hubraum){
        if (hubraum > 0) {
            this.hubraum = hubraum;
        }


    }
    public int getHubraum(){
        return hubraum;
    }

    public void setPs(int ps){
        if (ps > 0){
            this.ps = ps;
        }
    }

    public int getPs(){
        return ps;
    }

    public void setDrehmoment(int drehmoment){
        if (drehmoment > 0){
            this.drehmoment = drehmoment;
        }
    }

    public int getDrehmoment(){
        return drehmoment;
    }

    public void setFarbe(String farbe){
        this.farbe = farbe;
    }

    public String getFarbe(){
        return farbe;
    }

    public void setMarke(String marke){
        this.marke = marke;
    }

    public String getMarke(){
        return farbe;
    }
}
