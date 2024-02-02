package Probeklausur;

public class Schachbrett {

    public boolean [][] schachbrett = new boolean[8][8];

    @Override
    public String toString(){
        String out = "";
        for(int i = 0; i< schachbrett.length; i++){
            for(int j = 0; j<schachbrett[i].length; j++){
                if(schachbrett[i][j]){
                    out += "X ";
                }else{
                    out += "O ";
                }
            }
            out +="\n";
        }
        return(out);
    }

    public void markierePosition(int x, int y){
        if(x >=0 && x <9 && y >=0 && y<9){
            schachbrett[x][y] = true;

        }
    }

    public void gibVomSpringerErreichbareFelder(int x, int y){

        if(x >=0 && x <9 && y >=0 && y<9){
            try{
                schachbrett[x-2][y-1] = true;
            }catch (IndexOutOfBoundsException e){
                System.out.println("OutofBound");
            }
            try{
                schachbrett[x-2][y+1] = true;
            }catch (IndexOutOfBoundsException e){
                System.out.println("OutofBound");
            }
            try{
                schachbrett[x-1][y-2] = true;
            }catch (IndexOutOfBoundsException e){
                System.out.println("OutofBound");
            }
            try{
                schachbrett[x-1][y+2] = true;

            }catch (IndexOutOfBoundsException e){
                System.out.println("OutofBound");
            }
            try{

                schachbrett[x+1][y-2] = true;

            }catch (IndexOutOfBoundsException e){
                System.out.println("OutofBound");
            }
            try{
                schachbrett[x+1][y+2] = true;

            }catch (IndexOutOfBoundsException e){
                System.out.println("OutofBound");
            }
            try{
                schachbrett[x+2][y-1] = true;
            }catch (IndexOutOfBoundsException e){
                System.out.println("OutofBound");
            }
            try{
                schachbrett[x+2][y+1] = true;
            }catch (IndexOutOfBoundsException e){
                System.out.println("OutofBound");
            }
        }

    }
    public static void main(String[] args) {

        Schachbrett s = new Schachbrett();
        s.gibVomSpringerErreichbareFelder(4, 4);
        System.out.println(s);
    }
}
