package Probeklausur_again;

public class ArrayFlat {

    public static int[] flatten(int[][] in){
        int length = 0;
        for(int i = 0; i<in.length; i++){
            for(int j = 0; j<in[i].length; j++){
                length++;
            }
        }
        int[] out = new int[length];
        int countIn = 0;
        for(int i = 0; i<in.length; i++){
            for(int j = 0; j<in[i].length; j++){
                out[countIn] = in[i][j];
                countIn++;
            }
        }

        return(out);
    }

    public static void main(String[] args) {
        int[][] test = {{1, 5, 13} ,{4 ,5}, {6, 7, 8, 9}, {10, 11}};
        int[] newTest = flatten(test);
        for(int i = 0; i<newTest.length; i++){
            System.out.print(newTest[i] + " ");
        }
    }
}
