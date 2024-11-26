package de.thws.Tabellenvergleich;

public class Tabelle {
    boolean[][] werte = new boolean[8][8];

    public Tabelle(){
        for(int i = 0; i < werte.length; i++){
            for(int j = 0; j<werte[i].length; j++){
                if(Math.random() <= 0.5){
                    werte[i][j] = true;
                }else{
                    werte[i][j] = false;
                }
            }
        }
    }
    @Override
    public String toString(){
        String out = "";
        for(int i = 0; i< werte.length; i++){
            for(int j = 0; j<werte[i].length; j++){
                if(werte[i][j]){
                    out+="1 ";
                }else{
                    out+="0 ";
                }
            }
            out+="\n";
        }
        return(out);
    }

    public int returnValue(){
        int out = 0;
        for(int i = 0; i<werte.length; i++) {
            for (int j = 0; j < werte[i].length; j++) {
                if (werte[i][j]) {
                    out++;
                }
            }
        }
        return(out);
    }

    public static void main(String[] args) {


        Tabelle[] tabellen = new Tabelle[10];
        for(int i = 0; i<tabellen.length; i++){
            tabellen[i] = new Tabelle();
        }
        Tabelle größte = tabellen[0];
        for(int i = 1; i< tabellen.length; i++){
            if(tabellen[i].returnValue() > größte.returnValue()){
                größte = tabellen[i];
            }
        }

        System.out.println("Wert der größten Tabelle: " + größte.returnValue() + "\n"+größte);
    }
}

