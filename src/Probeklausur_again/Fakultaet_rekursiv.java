package Probeklausur_again;

public class Fakultaet_rekursiv {
    public static long fak(int in){
        if(in == 1){
            return(1);
        }
        return(in * fak(in-1));
    }

    public static void main(String[] args) {
        System.out.println(fak(11));
    }
}
