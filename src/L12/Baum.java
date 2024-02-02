package L12;

public class Baum {

    Wortknoten root;

    public void insert(Wortknoten k) {
        if (root == null) {
            root = k;
        } else {
            insert(root, k);

        }
    }

    private void insert(Wortknoten temp, Wortknoten neu) {
        if (neu.getWort().compareTo(temp.getWort()) < 1) {
            if (temp.left == null) {
                temp.left = neu;
            } else {
                insert(temp.left, neu);
            }
        } else {
            if (temp.right == null) {
                temp.right = neu;
            } else {
                insert(temp.right, neu);
            }
        }


    }

    public void print() {
        print(root);

    }
    private void print(Wortknoten temp){
        if(temp.left != null){
            print(temp.left);
        }
        System.out.println(temp.getWort());
        if(temp.right != null){
            print(temp.right);
        }
    }

    public void search(String gesucht){
        search(root, gesucht);

    }
    private void search(Wortknoten temp, String gesucht){
        if(gesucht.compareTo(temp.getWort())<1 && temp.left != null){
            search(temp.left, gesucht);
        }else if(gesucht.equals(temp.getWort())){
            System.out.println(temp.getBedeutung());
        }else if(temp.right != null){
            search(temp.right, gesucht);
        }
        else{
            return;                 // nicht sicher, wie man hier umgeht - void return ja eh nichts
        }
    }

    public static void main(String[] args){
        Baum baum = new Baum();
        Wortknoten apfel = new Wortknoten();
        apfel.setWort("Apfel");
        apfel.setBedeutung("Leckeres Obst");
        baum.insert(apfel);
        Wortknoten birne = new Wortknoten();
        birne.setWort("Birne");
        birne.setBedeutung("Obst in Form der Figur unserer ehemaligen Kanzlerin");
        baum.insert(birne);
        Wortknoten tomate = new Wortknoten();
        tomate.setWort("Tomate");
        tomate.setBedeutung("rotes Gemüse was eigentlich auch Obst ist");
        baum.insert(tomate);
        Wortknoten armbanduhr = new Wortknoten();
        armbanduhr.setWort("Armbanduhr");
        armbanduhr.setBedeutung("Armband mit integrierter Funktion die Zeit anzuzeigen");
        baum.insert(armbanduhr);
        Wortknoten trinkflasche = new Wortknoten();
        trinkflasche.setWort("Trinkflasche");
        trinkflasche.setBedeutung("Gefäß zum trinken");
        baum.insert(trinkflasche);
        Wortknoten strick = new Wortknoten();
        strick.setWort("Strick");
        strick.setBedeutung("Festes Seil, falls die Prog-Klausur doch zu hart wird");
        baum.insert(strick);


        baum.print();

        baum.search("Trinkflasche");
        baum.delete(tomate);
        baum.print();
    }

    public void delete(Wortknoten loeschknoten){
       delete(root, loeschknoten, root);
    }

    private void delete(Wortknoten temp, Wortknoten loeschknoten, Wortknoten vorgaenger){
        if(loeschknoten == temp){
            if(vorgaenger.getWort().compareTo(loeschknoten.getWort()) > 0){
                vorgaenger.left = null;
            }else{
                vorgaenger.right = null;
            }
            if(temp.left != null){
                insert(temp.left);

            }
            if(temp.right != null){
                insert(temp.right);
            }

        }
        else if(loeschknoten.getWort().compareTo(temp.getWort())<1){
            delete(temp.left, loeschknoten, temp);
        }else{
            delete(temp.right, loeschknoten, temp);
        }
    }



}
