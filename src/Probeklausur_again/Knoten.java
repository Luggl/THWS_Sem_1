package Probeklausur_again;

public class Knoten {
    private String name;
    Knoten prev;

    public Knoten(String name){
        this.name = name;
    }
    public String getName(){
        return(name);
    }
    public void setName(String name){
        this.name = name;
    }

}
