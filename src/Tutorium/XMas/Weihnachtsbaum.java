package Tutorium.XMas;

import static Tutorium.XMas.res.*;

public class Weihnachtsbaum {
    static Geschenk[] geschenke = new Geschenk[15];

    public static void main(String[] args) {
    for(int i = 0; i<geschenke.length; i++){
        geschenke[i] = new Geschenk(
                namen[(int)(Math.random()*namen.length)],
                namen[(int)(Math.random()*namen.length)],
                (int) (Math.random()*90000),
                res.geschenke[(int)(Math.random()*res.geschenke.length)]);
    }

        geschenke[2].auspacken(geschenke[2].empfaenger);
        System.out.println(geschenke[2]);
    }
}
