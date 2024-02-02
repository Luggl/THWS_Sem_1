package L12;

public class Personenknoten {

    private int alter;
    private String nachname;
    Personenknoten next;
    Personenknoten prev;

    public Personenknoten(int alter, String nachname){
        this.alter = alter;
        this.nachname = nachname;
    }

    public int getAlter(){
        return(alter);
    }
    public String getNachname(){
        return(nachname);
    }
}
