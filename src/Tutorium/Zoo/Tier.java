package Tutorium.Zoo;

public class Tier {

    private String name;
    private int groesse;
    Tier left;
    Tier right;

    public Tier(String name, int groesse){
        this.name = name;
        this.groesse = groesse;
    }

    public String getName(){
        return(name);
    }
    public int getGroesse(){
        return(groesse);
    }


}
