package L11;

public class L11_Ueb6 {

    public static int zaehleZeichen(char[][] textdoc){
        int zeichenanzahl = 0;
        for(int i = 0; i < textdoc.length; i++){
            for(int j = 0; j<textdoc[i].length; j++){
                if(textdoc[i][j] != ' '){
                    zeichenanzahl++;
                }
            }
        }
    return(zeichenanzahl);
    }

    public static boolean vertauscheZeilen(char[][] textdoc, int ersteZeile, int zweiteZeile){
        boolean output;
        try{
            char[] swapArray = textdoc[ersteZeile];
            textdoc[ersteZeile] = textdoc[zweiteZeile];
            textdoc[zweiteZeile] = swapArray;
            output = true;

        }catch (ArrayIndexOutOfBoundsException a){
            output = false;
        }
        return(output);
    }

    public static char[][] fuegeEinTextdokument(char[][]textdoc, char[][] einzufuegen, int zeile){

        char[][] outputArray = new char[textdoc.length + einzufuegen.length][];

        try{
            for(int i = 0 ; i < zeile; i++){
                outputArray[i] = textdoc[i];
            }
            for(int i = 0; i < einzufuegen.length; i++){
                outputArray[zeile+i] = einzufuegen[i];
            }
            for(int i = 0; i< textdoc.length-zeile; i++){
                outputArray[zeile + einzufuegen.length + i] = textdoc[textdoc.length - zeile + i];
            }




        }catch(RuntimeException a){
            System.out.println("Ungültige Zeilenposition");
        }
        return outputArray;
    }

    public static void main(String[] args){

        char[][] testArray = new char[13][24];
        char[][] einfArray = new char[2][13];
        for(int i = 0; i<einfArray.length; i++){
            for(int j = 0; j < einfArray[i].length; j++) {
                einfArray[i][j] = (char) (Math.random() * 90 + 33);
            }

        }
        for(int i = 0; i<testArray.length; i++){
            for(int j = 0; j < testArray[i].length; j++) {
                testArray[i][j] = (char) (Math.random() * 90 + 33);
            }

        }
        for(int i =0; i<testArray.length; i++){
            System.out.println(testArray[i]);
        }
        System.out.println(zaehleZeichen(testArray));

        testArray[4][8] =' ';
        testArray[4][13] =' ';
        testArray[2][4] =' ';

        for(int i =0; i<testArray.length; i++){
            System.out.println(testArray[i]);
        }

        System.out.println(zaehleZeichen(testArray));


        fuegeEinTextdokument(testArray, einfArray, 4);
        for(int i =0; i<testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
}
