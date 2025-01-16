package Probeklausur_again;

public class Zielort {
    private String zielort;
    private int dist;
    Zielort next;

    public Zielort(String zielort, int dist){
        this.zielort = zielort;
        this.dist = dist;
    }
    public void setDist(int dist){
        this.dist = dist;
    }
    public void setZielort(String zielort){
        this.zielort = zielort;
    }
    public String getZielort(){
        return(zielort);
    }
    public int getDist(){
        return(dist);
    }

    @Override
    public String toString(){
        String out = "Ortsname: " + getZielort() + " --- Distanz: " + getDist();
        return(out);
    }

    public static void main(String[] args) {
        System.out.println(0=='\u0000');

    }
}
