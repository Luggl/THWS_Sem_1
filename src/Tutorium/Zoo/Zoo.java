package Tutorium.Zoo;

public class Zoo {

    Tier root;

    public void einfuegen(Tier in){
        if(root == null){                                   //als erstes immer die Prüfung, ob die Struktur noch ungefüllt ist
            root = in;
        }else{
            einfuegen(root, in);                            //erst, wenn klar ist, dass ein Objekt im Baum vorhanden ist, muss verglichen werden
        }
    }

    private void einfuegen(Tier temp, Tier in){             //Methode bekommt ein Objekt, welches bereits im Baum vorhanden ist "temp", und das neue Objekt zum vergleichen
        if(temp.getGroesse() > in.getGroesse()){
            if(temp.right == null){                          //wenn klar ist, ob es größer oder kleiner ist, prüfen, ob der Platz bereits belegt ist oder nicht
                temp.right = in;                             //wenn frei, dann wird eingefügt
            }else{
                einfuegen(temp.right, in);                   //wenn belegt, wird eine Stufe weitergegangen und die Prüfung wird nochmals vorgenommen
            }
        }else{
            if(temp.left == null){
                temp.left = in;
            }else{
                einfuegen(temp.left, in);
            }
        }
    }

    @Override
    public String toString(){
        if(root == null){
            return("Baum ist leer!");                       //Wenn leer, dann wird nur "Baum ist leer" ausgegeben
        }else{
            return toString(root);                          //Ansonsten wird wieder die private Methode verwendet, um den String zu bauen
        }
    }

    private String toString(Tier temp){
        String out = "";

        if(temp.left != null){
            out += toString(temp.left);                     //Zuerst iterieren wir nach links, bis wir das Objekt gefunden haben, welches kein weiteres links hat
        }
        out += temp.getName() + " -- Größe: " + temp.getGroesse() + "\n";           //Wenn wir hier sind, werden diese Informationen an den out String gehängt
        if(temp.right != null){                             //Dann wird in jeder Ebene zusätzlich das rechts überprüft
            out += toString(temp.right);
        }
        return(out);
    }


    public static void main(String[] args) {
        Tier a = new Tier("Giraffe", 390);
        Tier b = new Tier("Ameise", 2);
        Tier c = new Tier("Waschbär", 65);

        Zoo zoo = new Zoo();

        zoo.einfuegen(a);
        zoo.einfuegen(b);
        zoo.einfuegen(c);

        System.out.println(zoo);
    }

}
