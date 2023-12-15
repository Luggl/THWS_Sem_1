package L7;

import java.util.Scanner;

public class L7_Ueb2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Anzahl der einzulesenden Werte: ");

        int anzahlWerte = scanner.nextInt();
        double[] werte = new double[anzahlWerte];

        for (int i = 0; i < anzahlWerte; i++) {
            System.out.println(i + 1 + ". Wert: ");
            werte[i] = scanner.nextDouble();

        }

        System.out.println("kleinster Wert: " + minVal(werte));
        System.out.println("größter Wert: " + maxVal(werte));
        System.out.println("Arithmetischer Mittelwert: " + mittelwert(werte));
        System.out.println("Standardabweichung: " +standardabweichung(werte));
    }


    /**
     * minVal nimmt ein Array aus double Werten entgegen und prüft auf den kleinsten Wert.
     * @param values ist das Array aus double Werten.
     * @return Kleinster double Wert.
     */
    public static double minVal(double[] values) {
        double min = values[0];

        for(int i = 1; i < values.length; i++) {
            if (values[i] < min) {
                min = values[i];
            }
        }
        return(min);
    }

    /**
     * maxVal nimmt ein Array aus double Werten entgegen und prüft auf den größten Wert.
     * @param values ist das Array aus double Werten.
     * @return Größter double Wert.
     */
    public static double maxVal(double[] values){
        double max = values[0];

        for(int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return(max);
    }

    /**
     * mittelwert nimmt ein Array aus double Werten entgegen und errechnet das Arithmetische Mittel.
     * @param values ist das Array aus double Werten.
     * @return Arithmetischer Mittelwert als double.
     */
    public static double mittelwert(double[] values){
        double summe = 0;

        for(int i = 1; i <= values.length; i++){
            summe = summe + values[i-1];

        }
        return(summe/values.length);



    }

    /**
     * Methode errechnet die Standardabweichung einer Zahlenreihe.
     * @param values entspricht einem Array an doubles.
     * @return Rückgabewert entspricht der Standardabweichung als double
     */
    public static double standardabweichung(double[] values){
        double summe = 0;
        for(int i = 1; i <= values.length; i++){
            summe = summe + (values[i-1] - mittelwert(values)) * (values[i-1] - mittelwert(values));
        }

        return(Math.sqrt(summe/values.length));
    }
}
