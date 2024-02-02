package L9;

public class Raum {
    private final String kennung;
    private int anzahlMax;
    private boolean belegt;
    private String[] aktuelleStudenten;
    private int anzahlaktuell = 0;

    public Raum(String kennung, int anzahlMax, boolean belegt){

        this.kennung = kennung;
        this.anzahlMax = anzahlMax;
        this.belegt = belegt;
        aktuelleStudenten = new String[anzahlMax];
    }


    public String getKennung(){
        return kennung;
    }
    public int getAnzahlMax(){
        return anzahlMax;
    }
    public boolean isBelegt(){
        return belegt;
    }
    public void setBelegt(){
        this.belegt = true;
    }
    public void setAvailable(){
        this.belegt = false;
    }

    public void betreteRaum(String student){
        aktuelleStudenten[anzahlaktuell] = student;
        anzahlaktuell++;
    }

    public void verlasseRaum(String student){
        for(int i = 0; i<anzahlaktuell; i++){
            if(aktuelleStudenten[i].equals(student)){
                aktuelleStudenten[i] = null;
            }
        }
        anzahlaktuell--;
    }

    public String[] getStudenten(){
        return(aktuelleStudenten);
    }

}
