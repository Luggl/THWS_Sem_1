package Probeklausur_again;

public class ISBN {
    public static boolean checkISBN(String in){
        boolean out = false;
        int[] nummern = new int[in.length()-3];
        int count = 0;
        for(int i = 0; i<in.length(); i++){
            if(in.charAt(i) == '-'){
                continue;
            }
            else{
                nummern[count] = in.charAt(i);
                count++;
            }
        }
        int sum = 0;
        for ( int i = 0; i<nummern.length; i++){
            sum = sum + (nummern[i] * (i+1));
        }
        if(sum % 11 == 0){
            out = true;
        }
        return(out);
    }

    public static void main(String[] args) {
        String ISBN = "3-528-05912-5";
        System.out.println(checkISBN(ISBN));
    }
}
