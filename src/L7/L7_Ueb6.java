package L7;

public class L7_Ueb6 {
    public static void main(String[]args){

        System.out.println("Hier die Lottozahlen der nächsten Woche:");
        System.out.println(minSort(lottozahlen()));

    }
    public static int[] lottozahlen(){
        int[] lottozahlen = new int[6];
        for(int i = 0; i < 6; i++){
            int zahl = (int) (Math.random() * 49) + 1;
            for(int j = 0; j<6; j++){
                if(zahl == lottozahlen[j]){
                    zahl = (int) (Math.random() * 49) + 1;

                }

            }
            lottozahlen[i] = zahl;
        }

        return(lottozahlen);
    }
    public static String minSort(int[] ursprungsarray){

        int zwischenspeicher;


        for(int i = 0; i < ursprungsarray.length; i++){
            for(int j = i+1; j< ursprungsarray.length; j++){
                if(ursprungsarray[j] < ursprungsarray[i]){
                    zwischenspeicher = ursprungsarray[i];
                    ursprungsarray[i] = ursprungsarray[j];
                    ursprungsarray[j] = zwischenspeicher;

                }

            }

        }
        String returnString = "";

        for(int i = 0; i < ursprungsarray.length; i++){
            returnString = returnString + ursprungsarray[i] + ", ";
        }

        return(returnString);


    }
}
