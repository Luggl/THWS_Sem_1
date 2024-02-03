package Probeklausur_again;

import java.util.Scanner;

public class Main_Kampfschule {

    public static void main(String[] args) {
        Kurs karate = new Kurs("Karate", 90);
        Kurs judo = new Kurs("Judo", 60);
        Kurs boxen = new Kurs("Boxen", 90);
        Kurs[] angeboteneKurse = {karate, judo, boxen};

        boolean worked = false;
        Scanner scanner = new Scanner(System.in);
        do{
            try {
                String gesucht = scanner.nextLine();
                boolean gefunden = false;
                for (int i = 0; i < angeboteneKurse.length; i++) {
                    if (gesucht.equals(angeboteneKurse[i].getKursart())) {
                        worked = true;
                        gefunden = true;
                        System.out.println("Kursdauer: " + angeboteneKurse[i].getKursdauer() + "\nMaximale Teilnehmer: " + angeboteneKurse[i].getMitglieder().length);

                    }
                }
                if (!gefunden) {
                    RuntimeException e = new RuntimeException();
                    throw (e);
                }
            }catch(RuntimeException e) {
                System.out.println("Dieser Kurs wird nicht angeboten!");
            }
        }while(!worked);

    }
}
