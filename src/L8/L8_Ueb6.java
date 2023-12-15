package L8;

public class L8_Ueb6 {
    public static void main(String[] args){

        System.out.println(deleteStartingSpace("   ab    c  Hallo Welt      "));
        System.out.println(deleteEndingSpace("   ab    c  Hallo Welt      "));
        System.out.println(splitAtSpace("Hallo Welt"));

    }
    public static String deleteStartingSpace(String sentence){

        char[] sentenceChars = new char[sentence.length()];
        int count = 0;
        int lengthArrayOut = sentence.length();
        boolean erstesLeerzeichen = true;
        for(int i = 0; i<sentence.length(); i++){
            if(sentence.charAt(i) != ' ' || !erstesLeerzeichen){
                sentenceChars[count] = sentence.charAt(i);
                count++;
                erstesLeerzeichen = false;

            }else {
                lengthArrayOut--;
                sentenceChars = new char[lengthArrayOut];

            }
        }
        String output = "";
        for(int i =0; i< sentenceChars.length; i++){
            output = output + sentenceChars[i];
        }
        return(output);
    }

    public static String deleteEndingSpace(String sentence){
        char[] sentenceChars = new char[sentence.length()];
        String output = "";
        int index = sentence.length()-1;
        for(int i = 0; i<sentence.length(); i++){

            if(sentence.charAt(index) == ' '){
                sentenceChars = new char[sentenceChars.length-1];

            }else{
                break;
            }
            index--;
        }
        for(int i = 0; i < sentenceChars.length; i++){
            output = output + sentence.charAt(i);
        }
        return(output);
    }

    public static String[] splitAtSpace(String input){
        int[] indexOfSpace = new int[input.length()];
        int count = 0;
        int anzahlStrings = 1;
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == ' '){
                indexOfSpace[count] = i;
                anzahlStrings++;
                count++;
            }
        }

        String[] output = new String[anzahlStrings];

        for(int i = 0, k = 0; i < anzahlStrings; i++){
            output[i] = input.substring(k, indexOfSpace[i]);
            k = indexOfSpace[i];
        }
        return(output);
    }
}
