package L11;

public class L11_Ueb3 {
    public static void main(String[] args){

    }

    public static int betrag(int input){
        int out;
        if(input<0){
            out = -1 * input;
        }else{
            out = input;
        }
        return(out);
    }
    public static double betrag(double input){
        double out;
        if(input < 0){
            out = -1 * input;
        }else{
            out = input;
        }
        return(out);
    }
    public static float betrag(float input){
        float out;
        if(input < 0){
            out = -1 * input;
        }else{
            out = input;
        }
        return(out);
    }
    public static long betrag(long input){
        long out;
        if(input < 0){
            out = -1 * input;
        }else{
            out = input;
        }
        return(out);
    }
    public static short betrag(short input){
        short out;
        if(input < 0){
            out = (short)( -1 * input);
        }else{
            out = input;
        }
        return(out);
    }
}
