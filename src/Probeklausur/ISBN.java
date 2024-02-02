package Probeklausur;

public class ISBN {

    public static boolean iSBNCheck(String in){
        int zwischen = 0;
        boolean out = false;
        if(in.length() == 13){
            for(int i = 0,  j = 1; i<13; i++, j++){
                if(in.charAt(i) != '-'){
                    int ziffer = Character.getNumericValue(in.charAt(i));
                    zwischen += (ziffer * j) %11;
                }else{
                    j--;
                }
            }
            if(zwischen%11 == 0){
                out = true;
            }

        }else if(in.length() == 17){
            for(int i = 0, j = 1; i<17; i++,j++){
                if(in.charAt(i) !='-'){
                    int ziffer = Character.getNumericValue(in.charAt(i));
                    zwischen += (ziffer* j) % 11;
                }else{
                    j--;
                }
            }
            if(zwischen%11 == 0){
                out = true;
            }
        }

        return(out);
    }

    public static void main(String[] args){
        String isbnBeispiel = "3-680-08783-7";
        if(iSBNCheck(isbnBeispiel)){
            System.out.println("Das Beispiel: " + isbnBeispiel + " ist eine ISBN!");
        }else{
            System.out.println("Das Beispiel: " + isbnBeispiel + " ist leider keine ISBN!");
        }
    }
}
