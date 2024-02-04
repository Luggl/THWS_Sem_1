package Probeklausur_again;

public class Potenz_rekursiv {
    public static int potenz(int basis, int exponent){
        int out;
        if(exponent ==0){
            return(1);
        }
        return(basis*potenz(basis, exponent-1));
    }

    public static void main(String[] args) {
        System.out.println(potenz(2, 5));
    }
}
