package Probeklausur;

public class charArrayAufgabe {

    public static char[] wandleUmInCents(String preis){
        preis = preis.replace(",", "");
        char[] temp = preis.toCharArray();
        int lengthCheckOld = 0;
        boolean x = false;

        while(!x && lengthCheckOld < temp.length){
            if(temp[lengthCheckOld] != '0'){
                x = true;
            }else{
                lengthCheckOld++;
            }
        }

        char[] out = new char[temp.length - lengthCheckOld];
        for(int i = lengthCheckOld; i<temp.length; i++){
            out[i-lengthCheckOld] = temp[i];
        }
        return(out);
    }

    public static void main(String[] args){
        char[] x = wandleUmInCents("12,99");
        for(int i = 0; i<x.length; i++){
            System.out.print(x[i]);
        }
    }
}
