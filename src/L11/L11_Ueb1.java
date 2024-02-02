package L11;


import java.util.Arrays;

public class L11_Ueb1 {

    public static void main(String[] args){

        double[][] test = {{15.3, 16.4, 4.2},{3.5, 2.1},{4.8, 31.8, 6.4}};

        System.out.println(Arrays.toString(zeilenMaxima(test)));
    }

    public static double[] zeilenMaxima(double[][] mehrdim){

        double[] out = new double[mehrdim.length];

        for(int i = 0; i<mehrdim.length; i++){
            double biggest = 0;
            for(int j = 0; j<mehrdim[i].length; j++){
                if(mehrdim[i][j] > biggest){
                    biggest = mehrdim[i][j];
                }

            }
            out[i] = biggest;
        }
        return(out);
    }
}
