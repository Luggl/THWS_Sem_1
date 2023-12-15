package L7;

import java.util.Scanner;

public class L7_Ueb4 {
    public static void main(String[]args){

        System.out.println("Lass uns ein Spiel spielen!\nGib mir einen Satz deiner Wahl: ");
        Scanner scanner = new Scanner(System.in);
        String userSatz = scanner.nextLine();

        System.out.println(spielen(userSatz));


    }

    public static String spielen(String satz) {

        char[] origin = satz.toCharArray();
        int length = origin.length;
        char[] zwischenspeicher = new char[length * 2];
        int count = 0;


        for(int i = 0; i<origin.length; i++){
            if(origin[i] == 'a' || origin[i] == 'e'|| origin[i] == 'i' || origin[i] == 'o' || origin[i] == 'u'){
                zwischenspeicher[count] = origin[i];
                zwischenspeicher[count+1] = 'b';
                zwischenspeicher[count+2] = origin[i];
                count = count + 3;
            }else{
                zwischenspeicher[count] = origin[i];
                count++;
            }


        }
        char[] neuerSatz = new char[count];
        for(int i = 0; i<count; i++){
            neuerSatz[i] = zwischenspeicher[i];
        }

        return(String.valueOf(neuerSatz));




    }
}
