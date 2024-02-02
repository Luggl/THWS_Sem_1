package Probeklausur_again;

public class ersetze {
    public static int ersetze(char[] in){
        int count = 0;
        for(int i = 0; i<in.length-4; i++){
            if(in[i] == '.'){
                count++;
                in[i] = '_';
            }
        }
        System.out.println(in);
        return(count);
    }

    public static void main(String[] args) {
        System.out.println(ersetze("Graphik.Init.Datei.ini".toCharArray()));
    }
}
