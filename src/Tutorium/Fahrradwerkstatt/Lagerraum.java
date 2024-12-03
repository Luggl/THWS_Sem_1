package Tutorium.Fahrradwerkstatt;

public class Lagerraum {
    Fahrrad start;
    Fahrrad temp;

    public void einsortieren(Fahrrad in) {
        if (start == null) {        //Wenn Liste leer --> das IN-Fahrrad wird zu meinem Listenanfang
            start = in;
        } else if (start.getRahmenhoehe() > in.getRahmenhoehe() ||          // Bedingungen, die dazu führen, dass mein IN-Fahrrad an die erste Stelle kommt
                    start.getRahmenhoehe() == in.getRahmenhoehe() && start.getFarbe().compareTo(in.getFarbe()) > 0 ||
                    start.getRahmenhoehe() == in.getRahmenhoehe() && start.getFarbe().compareTo(in.getFarbe()) == 0 && start.getMarke().compareTo(in.getMarke()) > 0
                    ){
                in.next = start;
                start = in;
        } else {        // Hier weiß ich, dass meine Liste mindestens 1 Element besitzt und mein IN-Fahrrad NICHT an die erste Stelle kommt
            if (start.next == null) {       // Prüfen, ob meine Liste ein zweites Element besitzt (Das muss ich tun, da ich in der kommenden while-Schleife immer die Attribute von next prüfe
                start.next = in;            // Hier also die Sonderbehandlung für das zweite Element in der Liste
            }else{
                temp = start;               // Hier wird das erste mal ein temp benötigt, da ich durch meine Liste durchlaufen muss

                while (temp.next != null &&  temp.next.getRahmenhoehe() < in.getRahmenhoehe() ||     // Bedingungen so gestellt, dass ich auf jeden Fall mein temp auf das nächste Element verschieben muss (also mein IN muss weiter geschoben werden
                       temp.next != null && temp.next.getRahmenhoehe() == in.getRahmenhoehe() && temp.next.getFarbe().compareTo(in.getFarbe()) < 0 ||
                       temp.next != null && temp.next.getRahmenhoehe() == in.getRahmenhoehe() && temp.next.getFarbe().equals(in.getFarbe()) && temp.next.getMarke().compareTo(in.getMarke()) < 0
                ) {
                    temp = temp.next;       // Weiterschieben von temp
                }
                in.next = temp.next;        // Sobald die while-Schleife endet, weiß ich, dass mein IN-Fahrrad eingefügt werden muss!
                temp.next = in;             // Auch hier die Reihenfolge beachten - erst die Verknüpfung meines neuen Objektes erstellen bevor die Referenz temp.next neu gesetzt wird
            }
        }
        index();                            // Am Ende von einfügen / aussortieren immer die index-Methode setzen
    }

    private void index(){
        if(start != null){                  // Wenn kein Element in der Liste, muss die Methode auch nichts tun
            temp = start;
            int index = 1;
            while(temp != null){            // Da wir in der Schleife temp verschieben, muss ich die Bedingung setzen - sonst Endlosschleife
                temp.setIndex(index);       // setter-Methode von Fahrrad benutzt, um den Index zu vergeben
                index++;
                temp = temp.next;           // Hier wird temp verschoben
            }
        }
    }

    public void aussortieren(int index){
        if(start.getIndex() == index){
            start = start.next;
        }else{
            temp = start;
            while(temp.next != null){
                if(temp.next.getIndex() == index){
                    temp.next = temp.next.next;     //Hier weißen wir der Referenz "next" vom Objekt temp das Objekt zu, welches eigentlich am "next" des nächsten Objektes hängt
                    break;                          //  O -> O -> O
                }else{                              //  0 ------> O
                    temp = temp.next;
                }
            }
        }
        index();
    }

    @Override
    public String toString(){
        String out = "************Lagerraum \"komplex\":************\n";
        temp = start;
        while(temp != null){
            out+= temp.getIndex() + ". Stelle im Lagerraum\t" + temp.getMarke() + "\tRahmenhöhe: " + temp.getRahmenhoehe() + "\tFarbe: " + temp.getFarbe() + "\n";
            temp = temp.next;
        }
        return out;
    }
}
