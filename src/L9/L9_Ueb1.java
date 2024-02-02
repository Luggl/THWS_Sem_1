package L9;


import L8.Auto;

public class L9_Ueb1 {
    public static void main(String[]args){

        Auto fiatMultipla = new Auto("Fiat", "kotzgruen", 1581, 103, 144);
        System.out.println(fiatMultipla.getHubraum());

        fiatMultipla.setHubraum(2581);
        System.out.println(fiatMultipla.getHubraum());
        fiatMultipla.setHubraum(-512);
        System.out.println(fiatMultipla.getHubraum());
    }
}
