package L3;

public class L3_Ueb4 {
    public static void main(String[] args){

        double ergebnis= 0;
        String output = "";
        while(!(ergebnis>0 && ergebnis<7)){
            double x = Math.random();
            ergebnis = x * 10;
        }

        System.out.println((int)ergebnis + " gewürfelt!");
        if((int)ergebnis == 1){
            output = "Eins gewürfelt";
        }else if((int)ergebnis == 2){
            output = "Zwei gewürfelt";
        }else if((int)ergebnis == 3){
            output = "Drei gewüfelt";
        }else if((int)ergebnis == 4){
            output = "Vier gewürfelt";
        }else if((int)ergebnis == 5){
            output = "Fünf gewürfelt";
        }else{
            output = "Sechs gewürfelt";
        }
        System.out.println(output);
    }

}
