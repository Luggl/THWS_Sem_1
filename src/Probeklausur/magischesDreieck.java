package Probeklausur;

public class magischesDreieck {


    public static int berechneHauptdiagonale(int[][] werte){
        int out = 0;
        for(int i = 0; i < werte.length;i++){

            for(int j = 0; j<werte.length; j++){
                if(j == i){
                    out += werte[i][j];
                }

            }
        }
        return(out);
    }

    public static int berechneGegendiagonale(int[][] werte){
        int out = 0;
        for(int i = werte.length-1; i>=0; i--){
            for(int j = werte.length-1; j>=0; j--){
                if(j == i){
                    out += werte[i][j];
                }
            }
        }

        return(out);
    }

    public static void main(String[] args){
        int[][] x = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        System.out.println(berechneHauptdiagonale(x));
        System.out.println(berechneGegendiagonale(x));
    }
}
