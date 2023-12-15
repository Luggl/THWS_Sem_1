package L8;

public class Hangman_Class {


    public static void Hangman_Function(int count){
        String header = "THIS IS HANGMAN!";
        String ersteZeile = "*";
        String zweiteZeile = "*";
        String dritteZeile = "*";
        String vierteZeile = "*";
        String fuenfteZeile = "*";
        String sechsteZeile = "*";
        String siebteZeile = "*";
        String achteZeile = "*";
        if(count == 1){
            achteZeile = "*    ____";
        }else if(count == 2){
            zweiteZeile = "*     |/";
            dritteZeile = "*     | ";
            vierteZeile = "*     | ";
            fuenfteZeile = "*     | ";
            sechsteZeile = "*     | ";
            siebteZeile = "*     | ";
            achteZeile = "*    ____";
        }else if(count == 3){
            ersteZeile = "*  ____________";
            zweiteZeile = "*     |/";
            dritteZeile = "*     | ";
            vierteZeile = "*     | ";
            fuenfteZeile = "*     | ";
            sechsteZeile = "*     | ";
            siebteZeile = "*     | ";
            achteZeile = "*    ____";
        }else if(count == 4){
            ersteZeile = "*  ____________";
            zweiteZeile = "*     |/      |";
            dritteZeile = "*     | ";
            vierteZeile = "*     | ";
            fuenfteZeile = "*     | ";
            sechsteZeile = "*     | ";
            siebteZeile = "*     | ";
            achteZeile = "*    ____";
        }else if(count == 5){
            ersteZeile = "*  ____________";
            zweiteZeile = "*     |/      |";
            dritteZeile = "*     |      (_)";
            vierteZeile = "*     | ";
            fuenfteZeile = "*     | ";
            sechsteZeile = "*     | ";
            siebteZeile = "*     | ";
            achteZeile = "*    ____";

        }else if (count == 6) {

            ersteZeile = "*  ____________";
            zweiteZeile = "*     |/      |";
            dritteZeile = "*     |      (_)";
            vierteZeile = "*     |       | ";
            fuenfteZeile = "*     | ";
            sechsteZeile = "*     | ";
            siebteZeile = "*     | ";
            achteZeile = "*    ____";
        }else if(count == 7){

            ersteZeile = "*  ____________";
            zweiteZeile = "*     |/      |";
            dritteZeile = "*     |      (_)";
            vierteZeile = "*     |      \\|/";
            fuenfteZeile = "*     | ";
            sechsteZeile = "*     | ";
            siebteZeile = "*     | ";
            achteZeile = "*    ____";
        }else if(count == 8){

            ersteZeile = "*  ____________";
            zweiteZeile = "*     |/      |";
            dritteZeile = "*     |      (_)";
            vierteZeile = "*     |      \\|/";
            fuenfteZeile = "*     |       |";
            sechsteZeile = "*     | ";
            siebteZeile = "*     | ";
            achteZeile = "*    ____";
        }else if(count == 9){

            ersteZeile = "*  ____________";
            zweiteZeile = "*     |/      |";
            dritteZeile = "*     |      (_)";
            vierteZeile = "*     |      \\|/";
            fuenfteZeile = "*     |       |";
            sechsteZeile = "*     |      / \\";
            siebteZeile = "*     | ";
            achteZeile = "*    ____";
        }
        System.out.println(header);
        System.out.println(ersteZeile);
        System.out.println(zweiteZeile);
        System.out.println(dritteZeile);
        System.out.println(vierteZeile);
        System.out.println(fuenfteZeile);
        System.out.println(sechsteZeile);
        System.out.println(siebteZeile);
        System.out.println(achteZeile);
    }
}

