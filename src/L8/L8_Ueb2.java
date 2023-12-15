package L8;

public class L8_Ueb2 {
    public static void main(String[] args){

        if(args.length == 2){
            double a = Double.valueOf(args[0]);
            double b = Double.valueOf(args[1]);
            System.out.println(a * b);
        }else{
            System.out.println("Ich benötige exakt 2 Zahlen");
        }

    }
}

