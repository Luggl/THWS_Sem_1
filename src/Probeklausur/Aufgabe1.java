package Probeklausur;

public class Aufgabe1 {

    public static int ersetze(char[] original){

        int out = 0;
        for(int i = 0; i<original.length-4; i++){
            if(original[i] == '.'){
                original[i] = '_';
                out++;
            }

        }
        for(int j = 0; j<original.length; j++){
            System.out.print(original[j]);
        }
        System.out.println("\n");



        return(out);
    }

    public static void main(String[] args){
        System.out.println(ersetze("Graphik.Init.Datei.ini".toCharArray()));
    }

}

