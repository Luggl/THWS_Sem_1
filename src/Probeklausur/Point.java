package Probeklausur;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    public int getX(){
        return(x);
    }
    public int getY(){
        return(y);
    }

    @Override
    public String toString(){
        String out = "X_Koordinate:  " + getX() + "   Y_Koordinate: " + getY();
        return(out);
    }
}
