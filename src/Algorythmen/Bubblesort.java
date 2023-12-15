package Algorythmen;

public class Bubblesort {
    public static int[] bubblesort(int[] unsortiert){

        for(int i = unsortiert.length; i > 0; i--){
            for (int j = 1; j < i; j++){

                if (unsortiert[j-1] > unsortiert[j]){
                        int zwischen = unsortiert[j-1];
                        unsortiert[j-1] = unsortiert[j];
                        unsortiert[j] = zwischen;
                }
            }
        }

        return(unsortiert);

    }
}
