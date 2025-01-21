package Tutorium.Mosaik;

public class Mosaik {
    boolean[][] mosaikpuzzle;

    public Mosaik(boolean [][] mosaikpuzzle){
        this.mosaikpuzzle = mosaikpuzzle;
    }

    public Mosaik(){
        this.mosaikpuzzle = new boolean[10][10];
        for(int i = 0; i<mosaikpuzzle.length; i++){
            for(int j = 0; j<mosaikpuzzle[i].length; j++){
                mosaikpuzzle[i][j] = (Math.random() * 100) >= 50;
            }
        }
    }

    public int ermittleHinweiszahl(int zeilenindex, int spaltenindex){
        int out = 0;

        for(int i = zeilenindex -1; i<=zeilenindex + 1; i++){
            if(i>=0 && i<= mosaikpuzzle.length -1){
                for(int j = spaltenindex -1; j<=spaltenindex +1; j++){
                    if(j>=0 && j<= mosaikpuzzle[i].length -1){
                        if(mosaikpuzzle[i][j]){
                            out++;
                        }
                    }
                }
            }
        }

        return(out);

    }




    @Override
    public String toString(){
        String out = "";
        for(int i = 0; i<mosaikpuzzle.length; i++){
            for(int j = 0; j<mosaikpuzzle[i].length; j++){
                out += " [";
                if(mosaikpuzzle[i][j]){
                    out+="X]";
                }else{
                    out+=" ]";
                }
            }
            out+="\n";
        }
        return(out);
    }


    public static void main(String[] args) {
        Mosaik m = new Mosaik();
        System.out.println(m);

        System.out.println(m.ermittleHinweiszahl(10, 6));
    }

}
