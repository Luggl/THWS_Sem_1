package L9;

public class L9_Ueb3 {
    public static void main(String[]args){
        Raum raumI21 = new Raum("I.2.1", 85, false);
        Raum raumI215 = new Raum("I.2.15", 45, false);

        System.out.println(raumI21.isBelegt());
        System.out.println(raumI215.isBelegt());

        raumI21.setBelegt();

        System.out.println(raumI21.isBelegt());
        System.out.println(raumI215.isBelegt());

    }
}
