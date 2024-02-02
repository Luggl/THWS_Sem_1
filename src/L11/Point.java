package L11;

public class Point {
    private int col;
    private int row;

    public Point(int col, int row){
        this.col = col;
        this.row = row;

    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public String getCoordinate(){
        String output = "Zeile + Spalte:  (" + getCol() + "; " + getRow()+ ")";

        return(output);
    }
}
