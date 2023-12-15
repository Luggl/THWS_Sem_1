package L1;

public class L1_Ueb5 {
    public static void main(String[] args){
        /*Tauschen Sie die Inhalte der beiden Variablen, d. h. wenn vor dem Tausch x den
Wert 5 hatte und y den Wert 7, dann soll x nach dem Tausch den Wert 7 haben und y
den Wert 5. Führen Sie den Tausch so durch, dass der Tausch funktioniert, egal mit
welchen Werten x und y initialisiert wurden.
Sie dürfen nur Code zwischen den beiden Kommentaren //Tausch und //Nach dem
Tausch hinzufügen!
         */
        int x = 5;
        int y = 7;
        //Vor dem Tausch
        System.out.println(x);
        System.out.println(y);
        //Tausch
        int z = x; //z als Zwischenspeicher definiert, um X-Wert nach Tausch beizubehalten
        x = y;
        y = z;
        //Nach dem Tausch
        System.out.println(x);
        System.out.println(y);

    }
}
