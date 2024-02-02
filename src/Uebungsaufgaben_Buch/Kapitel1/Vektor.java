package Uebungsaufgaben_Buch.Kapitel1;

import java.sql.SQLOutput;

public class Vektor {
    private int x;
    private int y;
    private int z;

    public Vektor(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    public int getX(){
        return(x);
    }
    public int getY(){
        return(y);
    }
    public int getZ(){
        return(z);
    }
    public Vektor(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vektor(Vektor a){
        this.x = a.x;
        this.y = a.y;
        this.z = a.z;
    }

    public void anzeige(){
        System.out.println("(" + getX() + ", " + getY() +", " + getZ() + ")");
    }

    public Vektor erzeugen(int x, int y, int z){
        int x_new = x + this.x;
        int y_new = y + this.y;
        int z_new = z + this.z;
        Vektor n = new Vektor(x_new, y_new, z_new);
        return(this);
    }
    public Vektor erzeugen(Vektor x){
        Vektor n = new Vektor(x.getX() + this.getX(), x.getY() + this.getY(), x.getZ() + this.getZ());
        return(this);
    }
}
