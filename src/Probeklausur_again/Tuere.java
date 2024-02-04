package Probeklausur_again;

public class Tuere {
    private int nr;
    private boolean geschlossen = false;

    public Tuere(int nr, boolean geschlossen){
        this.nr = nr;
        this.geschlossen = geschlossen;
    }

    public int getNr(){
        return(nr);
    }
    public boolean isGeschlossen(){
        return (geschlossen);
    }
    public void setNr(int nr){
        this.nr = nr;
    }
    public void setGeschlossen(boolean geschlossen){
        this.geschlossen = geschlossen;
    }

    @Override
    public String toString(){
        String out ="";
        if(geschlossen){
            out = "z";
        }else{
            out = "o";
        }
        return(out);
    }

    public static void main(String[] args) {
        int nr = 1;
        Tuere[] tueren = new Tuere[100];
        for(int i = 0; i<100; i++){
            Tuere t = new Tuere(nr, true);
            nr ++;
            tueren[i] = t;
        }
        for(int i =0; i<tueren.length; i++){
            for(int j = 0; j< tueren.length; j++){
                System.out.print(tueren[j]);
                if(tueren[j].getNr() % (i+1) == 0){
                    if(tueren[j].isGeschlossen()){
                        tueren[j].setGeschlossen(false);
                    }else{
                        tueren[j].setGeschlossen(true);
                    }

                }
            }
            System.out.println();
        }
        int anzahlOffen = 0;
        for(int i=0; i<tueren.length; i++){
            if(!tueren[i].isGeschlossen()){
                anzahlOffen++;
            }

        }
        System.out.println("Nach 100 Durchläufen sind noch " + anzahlOffen + " Türen offen!");
    }
}
