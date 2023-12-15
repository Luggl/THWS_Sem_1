package L7;

import java.util.Scanner;

public class L7_Ueb7 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib mir einen Satz und ich drehe ihn für dich um: ");
        String satz = scanner.nextLine();

        System.out.println(stringrevers(satz));



    }
    public static String stringrevers(String input){

        char[] inputChars = input.toCharArray();
        char[] outputChars = new char[inputChars.length];
        int count = 0;

        for(int i = inputChars.length - 1; i>=0; i--) {
            outputChars[count] = inputChars[i];
            count++;
        }

        String returnString = new String(outputChars);
        return(returnString);
    }
}
