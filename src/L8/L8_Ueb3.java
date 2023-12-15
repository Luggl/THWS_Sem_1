package L8;

public class L8_Ueb3 {
    public static void main(String[]args){
        int ergebnis = 0;
        if(args[args.length-1].equals("+")){
            for(int i = 0; i<args.length-1; i++){
                ergebnis = ergebnis + Integer.valueOf(args[i]);
            }
            System.out.println(ergebnis);
        }else if(args[args.length-1].equals("-")){
            ergebnis = Integer.valueOf(args[0]);
            for(int i = 1; i<args.length-1; i++){
                ergebnis = ergebnis - Integer.valueOf(args[i]);
            }
            System.out.println(ergebnis);
        }else{
            System.out.println("Deine Argumente konnte ich nicht verarbeiten");
        }
    }
}
