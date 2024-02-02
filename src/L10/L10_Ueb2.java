package L10;

public class L10_Ueb2 {
    public static void main(String[] args){
        Uhr[] weltzeit = new Uhr[24];
        int std = 0;
        int min = 23;
        int sek = 7;
        for(int i = 0; i<24; i++){
            weltzeit[i] = new Uhr(std,min,sek);
            int iStd = weltzeit[i].getStd();
            int iMin = weltzeit[i].getMin();
            int iSek = weltzeit[i].getSek();
            std++;

            System.out.println(i + ". Uhr: " + String.format("%02d", iStd) + ":" + iMin + ":" + String.format("%02d", iSek));
        }

        for(int i = 0; i<24; i++){
            weltzeit[i].naechsteSek();
            System.out.println(i + ". Uhr: " + weltzeit[i].getStd() + ":" + weltzeit[i].getMin() + ":" + String.format("%02d", weltzeit[i].getSek()));


        }
        weltzeit[3].setUhr(12, 47,53);
        System.out.println("Nach der Änderung \n3. Uhr:" + weltzeit[3].getStd() + ":" + weltzeit[3].getMin() + ":" + String.format("%02d", weltzeit[3].getSek()));
    }

}
