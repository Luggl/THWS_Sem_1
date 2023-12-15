package L8;

public class L8_Ueb5 {
    public static void main(String[] args){

        Auto audiR8 = new Auto("Audi", "Daytonagrau Perleffekt", 5204, 620, 580);
        Auto trabant = new Auto("Trabant", "grau", 1100, 40, 74);
        Auto hondaE = new Auto("Honda", "gruen", 0, 154, 315);

        System.out.println(audiR8.hubraum);
        audiR8.setHubraum(4123);
        System.out.println(audiR8.hubraum);
        audiR8.setHubraum(-45);
        System.out.println(audiR8.hubraum);

    }


}
