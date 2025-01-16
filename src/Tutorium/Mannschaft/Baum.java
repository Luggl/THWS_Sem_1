package Tutorium.Mannschaft;

public class Baum {
    Knoten root;
    int maxTore;
    Mannschaft maxToreMannschaft;

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


    public int maxTore(){                   // Annahme: Aufgabe bezieht sich auf die Anzahl der Tore, nicht auf die Mannschaft selbst
        maxTore(root);
        return(maxTore);

    }

    private void maxTore(Knoten temp){
        if(temp.left!=null){
            maxTore(temp.left);
        }
        if(temp.mannschaft.getTore()>= maxTore){
            maxTore = temp.mannschaft.getTore();
        }
        if(temp.right != null){
            maxTore(temp.right);
        }

    }

    public Mannschaft maxToreM(){
        maxToreM(root);
        return(maxToreMannschaft);
    }
    private void maxToreM(Knoten temp){
        if(temp.left != null){
            maxToreM(temp.left);
        }
        if(maxToreMannschaft == null || temp.mannschaft.getTore()>maxToreMannschaft.getTore()){
            maxToreMannschaft = temp.mannschaft;
        }
        if(temp.right != null){
            maxToreM(temp.right);
        }

    }

    public static void main(String[] args) {
        Mannschaft a = new Mannschaft("Mannschaft A", 5, 12);
        Mannschaft b = new Mannschaft("Mannschaft B", 8, 2);
        Mannschaft d = new Mannschaft("Mannschaft D", 25, 1);
        Mannschaft c = new Mannschaft("Mannschaft C", 19,1);

        Baum f = new Baum(a);
        f.einfuegen(b);
        f.einfuegen(d);
        f.einfuegen(c);

        System.out.println(f.maxTore());

        System.out.println(f.maxToreM());

    }

}
