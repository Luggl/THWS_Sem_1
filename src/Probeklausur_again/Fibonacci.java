package Probeklausur_again;

public class Fibonacci {
    public static int berechneFibonacci(int n){
        int out = 0;
        if(n < 2 && n>=0){
            out = n;
        }else{
            if (n<0){
                System.out.println("nicht möglich!");
            }else{
                out = berechneFibonacci(n-1) + berechneFibonacci(n-2);
            }

        }
        return(out);
    }

    public static void main(String[] args) {
        System.out.println(berechneFibonacci(50));
    }
}
