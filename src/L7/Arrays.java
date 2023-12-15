package L7;

public class Arrays {
    public static void main(String[] args) {

        int [] gewuerfelteSeiten = new int[6];

        for (int i = 1; i < 100000; i++) {
            int wurf = (int) (Math.random() * 6 + 1);
            gewuerfelteSeiten[wurf-1]++;
        }
        for(int i = 0; i < 6; i++){
            System.out.println(i+1 + "er: " + gewuerfelteSeiten[i]);
        }
    }
}



