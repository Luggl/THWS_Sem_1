package L12;

import java.util.Arrays;

public class L12_Ueb1 {
    public static void main(String[] args){

        int[] lottoziehung = new int[6];

        Lottozahlen start = new Lottozahlen(1);
        Lottozahlen temp = start;
        for(int i = 2; i<=49; i++){
            Lottozahlen k = new Lottozahlen(i);
            temp.next = k;

            while(temp.next != null){
                temp = temp.next;
            }


        }
        for(int i = 0 ; i<6; i++){
            int lottoRandom = (int) (Math.random()*(49-i)+1);

            temp = start;

            if(lottoRandom == 1){
                lottoziehung[i] = start.getWert();
                start = start.next;
            }
            else if(lottoRandom == 2){
                lottoziehung[i] = temp.next.getWert();
                temp.next = temp.next.next;
            }else{
                for(int j = 2; j<lottoRandom; j++){
                    temp = temp.next;
                }
                lottoziehung[i] = temp.next.getWert();
                temp.next = temp.next.next;

            }



        }

        for(int i = lottoziehung.length; i>0; i--){
            for(int j = 1; j<i; j++){
                if(lottoziehung[j-1]>lottoziehung[j]){
                    int zwischen = lottoziehung[j];
                    lottoziehung[j] = lottoziehung[j-1];
                    lottoziehung[j-1] = zwischen;
                }
            }
        }
        System.out.println(Arrays.toString(lottoziehung));

    }

}
