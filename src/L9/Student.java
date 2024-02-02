package L9;

public class Student {

    private String name;
    private int matrikelnummer;

    public Student(String name, int matrikelnummer){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    }

    public String getName(){
        return(name);
    }
    public int getMatrikelnummer(){
        return(matrikelnummer);
    }
}
