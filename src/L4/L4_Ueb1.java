package L4;

public class L4_Ueb1 {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("15 Sekunden-Timer startet: ");
        Thread.sleep(1000);             // Sleep 1000ms - 1 Sekunde Unterbrechung
        int i = 15;
        while(i>=0){                        // while-Schleife für 15 Sek-Timer
            System.out.println(i);
            i--;
            Thread.sleep(1000);         // Sleep 1000ms - 1 Sekunde Unterbrechung
        }
    }
}
