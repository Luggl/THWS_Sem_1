package Probeklausur_again;

import java.util.List;

public class Liste_backwards {
    Knoten ende;
    Knoten temp;

    public void einfuegen(Knoten in){
        if(ende == null){
            ende = in;
        }else{
            in.prev = ende;
            ende = in;
        }
    }

    @Override
    public String toString(){
        temp = ende;
        String out ="";
        while(temp!=null){
            out = " " + temp.getName() + out;
            temp = temp.prev;
        }
        return(out);
    }

    public static void main(String[] args) {
        Knoten a = new Knoten("a");
        Knoten b = new Knoten("b");
        Knoten c = new Knoten("c");
        Liste_backwards l = new Liste_backwards();
        l.einfuegen(a);
        l.einfuegen(b);
        l.einfuegen(c);
        System.out.println(l);
    }
}
