package Probeklausur_again;

public class Roboter {
    private String name;
    private int hoehe;
    Roboter next;

    public Roboter(String name, int hoehe){
        this.name = name;
        this.hoehe = hoehe;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return(name);
    }
    public void setHoehe(int hoehe){
        this.hoehe = hoehe;
    }
    public int getHoehe(){
        return(hoehe);
    }

    @Override
    public String toString(){
        String out ="";
        out+= "Hallo ich bin " + getName() + ", ich bin " + getHoehe() + " Zentimeter groß";
        return(out);
    }


}
