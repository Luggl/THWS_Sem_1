package Tutorium.Mannschaft;

public class Mannschaft {
    final String NAME;
    private int tore;
    private int gegentore;

    public Mannschaft(String name){
        this.NAME = name;
    }
    public Mannschaft(String name, int tore, int gegentore){
        this.NAME = name;
        this.tore = tore;
        this.gegentore = gegentore;
    }

    public void setTore(int tore){
        this.tore = tore;
    }
    public void setGegentore(int gegentore){
        this.gegentore = gegentore;
    }

    public int getTore(){
        return(tore);

    }
    public int getGegentore(){
        return(gegentore);
    }
    public String getName(){
        return(NAME);
    }

    @Override
    public String toString(){
        return(NAME +"\n"+gegentore + " Gegentore\n" + tore + " Tore!");
    }
}
