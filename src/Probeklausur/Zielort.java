package Probeklausur;

public class Zielort {

    private String zielort;
    private int dist;
    Zielort next;

    public void setDist(int dist){

        this.dist = dist;
    }
    public void setZielort(String zielort){
        this.zielort = zielort;
    }
    public int getDist(){
        return(dist);
    }
    public String getZielort(){
        return(zielort);
    }
    public Zielort(int dist, String zielort){
        this.dist = dist;
        this.zielort = zielort;
    }
    @Override
    public String toString(){
        String out = "Ortsname: ";
        out += getZielort();
        out += "   Distanz: ";
        out += getDist();
        return(out);
    }

}

