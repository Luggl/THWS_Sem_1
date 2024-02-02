package L11;

public class Landscape {
    private String[][] colorMatrix;

    public void setColorMatrix(String[][] colorMatrix) {
        this.colorMatrix = colorMatrix;
    }

    public Point findColor(String color){
        Point output = new Point(-1, -1);

        for(int i =0; i< colorMatrix.length; i++){
            for(int j =0; j<colorMatrix[i].length; j++){
                if(colorMatrix[i][j].equals(color)){
                    output = new Point(i, j);
                }

            }
        }
        return(output);
    }
    
}
