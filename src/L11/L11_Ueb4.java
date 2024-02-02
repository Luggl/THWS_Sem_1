package L11;

public class L11_Ueb4 {
    public static void main(String[] args){
        Ticker ticker = new Ticker(45);
        System.out.println(String.valueOf(ticker.getNachricht()));

        char[] neueNachricht = "Wettervorhersage: Schnee in Würzburg!".toCharArray();

        ticker.setNachricht(neueNachricht);
        System.out.println(String.valueOf(ticker.getNachricht()));

        ticker.rotateNachricht(14);
        System.out.println(String.valueOf(ticker.getNachricht()));
    }

}
