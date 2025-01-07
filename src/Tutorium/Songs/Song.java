package Tutorium.Songs;

public class Song {
    private String titel;
    private String interpret;
    private int dauer;
    String alternativtitel;
    Song next;


    public Song(String titel, String interpret, int dauer) {
        this.titel = titel;
        this.interpret = interpret;
        if (dauer <= 0) {
            throw new RuntimeException("Dauer darf nicht negativ sein!");
        } else {
            this.dauer = dauer;
        }
    }

    public String getInterpret(){
        return(interpret);
    }
    public String getTitel(){
        return(titel);
    }
    public int getDauer(){
        return(dauer);
    }

}
