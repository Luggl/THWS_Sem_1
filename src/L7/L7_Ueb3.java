package L7;

import java.util.Scanner;

public class L7_Ueb3 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("gib mir eine zeichenfolge: ");
        String zeichenfolge = scanner.nextLine();
        char[] zeichen = new char[zeichenfolge.length()];

        for(int i = 1; i <= zeichenfolge.length(); i++) {
            zeichen[i-1] = zeichenfolge.charAt(i-1);
        }

        System.out.println(inGrossbuchstaben(zeichen));

    }
    public static char[] inGrossbuchstaben(char[] values){
        for(int i = 0; i <= values.length; i++){
            if(values[i] >= 97 && values[i] <= 122){
                values[i] = (char) (values[i] -  32);
            }

        }

        return(values);
    }
}
