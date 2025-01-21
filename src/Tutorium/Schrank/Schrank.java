package Tutorium.Schrank;

public class Schrank {
    Muetze ende;

    public void einfuegen(Muetze in){
        if(ende == null){
            ende = in;
        }else{
            Muetze temp = ende;
            if(in.getValue()<temp.getValue()){
                in.prev = temp;
                ende = in;
            }else if(temp.prev == null){
                temp.prev = in;
            }else{
                while(temp.prev != null){
                    if(in.getValue()< temp.prev.getValue()){
                        in.prev = temp.prev;
                        temp.prev = in;
                        break;
                    }
                    temp = temp.prev;
                }
                temp.prev = in;
            }
        }
    }


    public void ausgeben(){
        Muetze temp = ende;
        int count = 1;
        while(temp != null){
            System.out.println("Mütze auf der " + count + ": " + temp);
            temp = temp.prev;
            count++;
        }
    }

    public Muetze suchen(int value){
        Muetze out;
        if(ende.getValue() == value){
            out = ende;
            ende = ende.prev;
            return(out);
        }else{
            Muetze temp = ende;
            while(temp.prev != null){
                if(temp.prev.getValue() == value){
                    out = temp.prev;
                    temp.prev = temp.prev.prev;
                    return(out);
                }
                temp = temp.prev;
            }
        }
        System.out.println("Leider nichts gefunden!");
        return(null);
    }

    public static void main(String[] args) {
        Schrank s = new Schrank();

        Muetze m = new Muetze("Grüne Beanie", 15);
        Muetze n = new Muetze("Blaue Cappie", 12);
        Muetze o = new Muetze("Pinkes Durag", 50);
        Muetze p = new Muetze("Kampfhelm aus dem römischen Reich", 500);

        s.einfuegen(m);
        s.einfuegen(n);
        s.einfuegen(o);
        s.einfuegen(p);
        s.ausgeben();

        Muetze gesucht = s.suchen(50);
        System.out.println(gesucht);
        s.ausgeben();
    }
}
