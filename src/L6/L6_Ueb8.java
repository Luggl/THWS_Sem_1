package L6;

public class L6_Ueb8 {
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }else if(n == 0){
            return 0;
        }
        return(fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String[] args){
        for(int i = 1; i<=25; i++){
            System.out.printf("%d ", fibonacci(i));
        }
    }
}
