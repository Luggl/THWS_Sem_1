package L7;

import java.util.Scanner;

public class L7_Ueb8 {

    public static void main(String[] args){
        System.out.println("Gib mir eine positive Ganzzahl, bis zu der ich dir die Primzahlen prüfe:");

        Scanner scanner = new Scanner(System.in);
        int obergrenze = scanner.nextInt();

        showContent(sieve(fillArray(obergrenze)));

    }

    public static int[] fillArray(int obergrenze){

        int[] returnArray = new int[obergrenze+1];
        int count = 0;
        for(int i = 0; i<obergrenze; i++){
            returnArray[i] = count;
            count++;
        }

        return(returnArray);
    }

    public static int[] sieve(int[] ursprungsarray){
        ursprungsarray[0] = -1;
        ursprungsarray[1] = -1;

        for(int i = 0; i< Math.sqrt(ursprungsarray.length); i++) {
            if (!(ursprungsarray[i] == -1)) {
                for (int j = i + 1; j < ursprungsarray.length; j++) {
                    if (ursprungsarray[j] % ursprungsarray[i] == 0) {
                        ursprungsarray[j] = -1;
                    }
                }

            }


        }


    return(ursprungsarray);

    }

    public static void showContent(int[] arraySieved){
        String statement;
        for(int i = 0; i<arraySieved.length; i++){

            if(!(arraySieved[i] == -1)){
                statement = " is a prime number";
            }else{
                statement = " is not a prime number";
            }
            System.out.println(i + statement);
        }

    }

}
