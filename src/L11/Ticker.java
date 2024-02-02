package L11;

import java.util.Arrays;

public class Ticker {

    int groesse;
    char[] nachrichtenpuffer;

    public Ticker(int nachrichtenlaenge){
        groesse = 200;
        if(nachrichtenlaenge>0){
            groesse = nachrichtenlaenge;
        }
        nachrichtenpuffer = new char[groesse];

        for(int i = 0; i<groesse; i++){
            nachrichtenpuffer[i] = ' ';
        }
    }



    public int getGroesse(){
        return(groesse);
    }

    public void setNachricht(char[] nachricht){
        for(int i = 0; i<groesse; i++) {
            if (i < nachricht.length) {
                nachrichtenpuffer[i] = nachricht[i];
            } else {
                nachrichtenpuffer[i] = '+';
            }
        }
    }

    public char[] getNachricht(){
        char[] copy = new char[groesse];
        for(int i = 0; i<groesse; i++){
            copy[i] = nachrichtenpuffer[i];
        }
        return(copy);
    }
    public void resetNachricht(char zeichen){
        for(int i = 0; i<groesse;i++){
            nachrichtenpuffer[i] = zeichen;
        }
    }
    public void resetNachricht(){
        for(int i = 0; i<groesse; i++){
            nachrichtenpuffer[i] = '+';
        }
    }
    public void rotateNachricht(int distance) {
        char[] copy = getNachricht();
        for (int i = 0; i < groesse; i++) {
            if(i+distance < nachrichtenpuffer.length){
                nachrichtenpuffer[i] = copy[i+distance];
            }else{
                nachrichtenpuffer[i] = copy[i-copy.length + distance];
            }
        }

    }
}
