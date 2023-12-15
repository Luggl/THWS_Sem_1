package Algorythmen;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        int[] unsortiert = {15, 26, 3, 8, 14, 28, 763, 85, 476, 125, 5, 1, 0, 0, 186, 4};

        int[] sortiert = Bubblesort.bubblesort(unsortiert);

        System.out.println(Arrays.toString(sortiert));
}
}
