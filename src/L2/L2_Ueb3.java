package L2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class L2_Ueb3 {
    public static void main(String[] args) {
        /*Schreiben Sie ein Programm, das die Variablen stunden, minuten und sekunden
enthält. Initialisieren Sie die Variablen manuell mit der aktuellen Uhrzeit, d.h. wenn
gerade 12:30 Uhr ist, weisen Sie der Variablen stunden 12, der Variable minuten 30
und der Variablen sekunden 0 zu.
a) Berechnen Sie die Anzahl der Sekunden seit Mitternacht und geben Sie diese aus!
b) Berechnen Sie die Anzahl der verbleibenden Sekunden für diesen Tag und geben
Sie diese aus!
c) Berechnen Sie, wie viel Prozent des Tages schon vergangen sind und geben Sie
das Ergebnis aus! Die Prozentangabe soll auf mehrere Nachkommastellen genau
angegeben werden.
d) (weiterführend) Initialisieren Sie die Variablen mit der Systemzeit. Verwenden
Sie LocalTime.now(). Recherchieren Sie, welche Methodenaufrufe Ihnen der
Aufruf von LocalTime.now() zur Verfügung stellt.
         */

        Scanner userInputTime = new Scanner(System.in);
        System.out.println("Aktuelle Stunde: ");
        int stunden = userInputTime.nextInt();
        System.out.println("Aktuelle Minute: ");
        int minuten = userInputTime.nextInt();
        System.out.println("Aktuelle Sekunden: ");
        int sekunden = userInputTime.nextInt();

        System.out.println("Uhrzeit nach User: " + stunden + ":" + minuten + ":" + sekunden);
        System.out.println("Aktuelle Uhrzeit: " + LocalTime.now());



        int stundenAktuell = LocalTime.now().getHour();
        int minutenAktuell = LocalTime.now().getMinute();
        int sekundenAktuell = LocalTime.now().getSecond();

        int secCountMidnightAktuell = stundenAktuell * 60 * 60 + minutenAktuell * 60 + sekundenAktuell;
        int secCountMidnight = stunden * 60 * 60 + minuten * 60 + sekunden;

        System.out.println("Vergangene Sekunden seit Mitternacht nach User Input: " + secCountMidnight + " Sekunden sind vergangen.");
        System.out.println("Vergangene Sekunden seit Mitternacht aktuell: " + secCountMidnightAktuell + " Sekunden sind vergangen.");
        int secWholeDay = 24 * 60 * 60;

        int secRest = secWholeDay - secCountMidnight;
        int secRestAktuell = secWholeDay - secCountMidnightAktuell;
        System.out.println("Verbleibende Sekunden bis Mitternacht nach User Input: " + secRest + " Sekunden verbleiben bis Mitternacht.");
        System.out.println("Verbleibende Sekunden bis Mitternacht aktuell: " + secRestAktuell + " Sekunden verbleiben bis Mitternacht.");
        float percentage_sec = (float) secCountMidnight/ secWholeDay * 100;
        float percentage_secAktuell = (float) secCountMidnightAktuell/ secWholeDay * 100;
        System.out.println(percentage_sec + " Prozent sind bereits vergangen nach User Input");
        System.out.println(percentage_secAktuell + " Prozent sind bereits vergangen aktuell");

    }
}
