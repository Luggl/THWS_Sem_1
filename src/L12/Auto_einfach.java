package L12;

public class Auto_einfach {
    private String farbe;
    private int ps;
    Auto_einfach next;

    public Auto_einfach(String farbe, int ps){
        this.farbe = farbe;
        this.ps = ps;
    }

    public String getFarbe(){
        return(farbe);
    }
    public int getPs(){
        return(ps);
    }
}
