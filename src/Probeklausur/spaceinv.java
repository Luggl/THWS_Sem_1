package Probeklausur;

public class spaceinv {

    char[][] spielfeld = new char[4][8];

    public void init(){
        for(int i = 0; i<spielfeld[0].length; i++){
            spielfeld[0][i] = 'O';
        }
        for(int i = 1; i<4; i++){
            for(int j = 0; j<spielfeld[i].length; j++){
                spielfeld[i][j] = ' ';
            }
        }

        int rand = (int) (Math.random()*8);
        spielfeld[spielfeld.length-1][rand] = 'V';

    }
    public void print(){
        for(int i = 0; i< spielfeld.length; i++){
            for(int j = 0; j<spielfeld[i].length; j++){
                System.out.print(spielfeld[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        spaceinv s = new spaceinv();
        s.init();
        s.print();
    }
}
