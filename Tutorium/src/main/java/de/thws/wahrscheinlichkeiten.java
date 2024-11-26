package de.thws;

public class wahrscheinlichkeiten {

    int[] ergebnis = {0, 0, 0};

    public void test(){
        int wert = (int) (Math.random()*100+1);

        if(wert <= 50){
            wert = (int) (Math.random()*3);
            ergebnis[wert]++;
        }
    }

    public static void main(String[] args) {
        wahrscheinlichkeiten a = new wahrscheinlichkeiten();
        for(int i = 0; i<=10000; i++){
            a.test();
        }

        for(int i = 0; i<a.ergebnis.length; i++){
            System.out.println(a.ergebnis[i]);
        }
    }

}
