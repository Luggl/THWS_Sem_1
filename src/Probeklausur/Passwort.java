package Probeklausur;

public class Passwort {
    public static String pw;

    public static boolean alsPWgeeignet(String pw){
        char[] x = pw.toCharArray();
        boolean out = false;
        boolean length = false;

        if(pw.length() >= 8){
            length = true;
        }
        int countKb = 0;
        int countGb = 0;
        int countZ = 0;

        for(int i = 0; i < pw.length(); i++){
            if(x[i] >= 'A' && x[i] <= 'Z'){
                countGb++;
            }
            if(x[i] >= 'a' && x[i] <= 'z'){
                countKb++;
            }
            if(x[i] >= '0' && x[i] <= '9'){
                countZ++;
            }
        }
        if(countGb > 1 && countKb > 1 && countZ > 1 && length){
            out = true;
        }

        return(out);
    }

    public Passwort(String pw){
        if(alsPWgeeignet(pw)){
            this.pw = pw;
        }
    }

    @Override
    public String toString(){
        String out = "";
        if(pw!= null){
            for(int i = 0; i<pw.length(); i++){
                out = out + "*";
            }
        }else{
            out = "Kein gültiges Passwort!";
        }
        return(out);
    }

    public static boolean pwAendern(String neu1){
        boolean out = false;

        if(alsPWgeeignet(neu1)){
            if(pw!=null){
                char[] alt = pw.toCharArray();
                char[] neu = neu1.toCharArray();
                if(alt[0] != neu[0] && alt[pw.length()-1] != neu[neu1.length()-1]){
                    out = true;
                }
            }
        }
        return(out);

    }

    public static int pruefung(int[] x){
        int out = 0;
        for(int i = 0; i<x.length; i++){
            if(x[i] % 3 == 0){
                out ++;
            }
        }
        return(out);
    }

    public static double altHarm(){
        double out = 1;
        double temp;
        boolean x = false;
        for(int i = 2; i<1000; i++){
            if(!x){
                temp = -1;
                x = true;
            }else{
                temp = 1;
                x = false;
            }
            out = out + (temp / i);
        }
        return (out);
    }

    public static void printQuadrat(int zeilen){
        for(int i = 0; i<zeilen; i++){
            System.out.print("* ");
        }
        System.out.print("\n");
        for(int j = 0; j<zeilen-2; j++){
            System.out.print("* ");
            for(int i = 0; i<zeilen-2; i++){
                System.out.print("  ");
            }
            System.out.print("* \n");
        }
        for(int i = 0; i<zeilen; i++) {
            System.out.print("* ");
        }

    }

    public static void main(String[] args){
        Passwort pw = new Passwort("Prog1Und2");
        System.out.println(pw);
        Passwort.pwAendern("achadj123DCK");
        System.out.println(altHarm());
        printQuadrat(28);

    }
}
