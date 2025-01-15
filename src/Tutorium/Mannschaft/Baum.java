package Tutorium.Mannschaft;

public class Baum {
    Knoten root;
    int maxTore=0;

    public Baum(Mannschaft in){
        root = new Knoten(in);
    }

    public void einfuegen(Mannschaft neu){
        if(root == null)
            root = new Knoten(neu);
        else einfuegen(root,new Knoten(neu));
    }
    private void einfuegen(Knoten temp, Knoten neu){
        if(neu.mannschaft.getName().compareTo(temp.mannschaft.getName()) < 0) {
            if (temp.left == null)
                temp.left = neu;
            else einfuegen(temp.left, neu);
        }else
        if (temp.right == null)
            temp.right = neu;
        else einfuegen(temp.right, neu);
    }


    public int maxTore(){       // Annahme: Aufgabe bezieht sich auf die Anzahl der Tore, nicht auf die Mannschaft selbst
        return(maxTore(root));
    }

    private int maxTore(Knoten temp){
        int out = 0;
        if(temp.left!=null){
            maxTore(temp.left);
        }
        if(temp.right != null){
            maxTore(temp.right);
        }
        if(temp.mannschaft.getTore()>= out){
            out = temp.mannschaft.getTore();
        }


        return(out);
    }

    public static void main(String[] args) {
        Mannschaft a = new Mannschaft("Mannschaft A", 5, 12);
        Mannschaft b = new Mannschaft("Mannschaft B", 8, 2);
        Mannschaft c = new Mannschaft("Mannschaft C", 19,1);

        Baum f = new Baum(a);
        f.einfuegen(b);
        f.einfuegen(c);

        System.out.println(f.maxTore());

    }

}
