package L8;

public class Auto {
    String marke, farbe;
    public int hubraum;
    int ps;
    int drehmoment;

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
    }


    public String toString(){
        return("Marke: " + marke + "\nFarbe: " + farbe + "\nHubraum: " + hubraum + "\nPS: " + ps + "\nDrehmoment: " + drehmoment);
    }

    public void setHubraum(int hubraum){
        if (hubraum > 0) {
            this.hubraum = hubraum;
        }


    }
}
