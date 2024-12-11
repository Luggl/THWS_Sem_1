package Tutorium.Bar;

public class Bar {
    Getraenk start;

    public void einsortieren(Getraenk in){
        if(start == null){
            start = in;
        }else{
            if(start.getWert()>in.getWert()){
                in.next = start;
                start.prev = in;
                start = in;
            }else{
                if(start.next == null){
                    start.next = in;
                    in.prev = start;
                }else{
                    Getraenk temp = start;
                    while(temp.next != null && temp.next.getWert()<in.getWert()){
                            temp = temp.next;
                    }
                    if(temp.next == null){
                        temp.next = in;
                        in.prev = temp;
                    }else{
                        in.next = temp.next;
                        temp.next.prev = in;
                        temp.next = in;
                        in.prev = temp;
                    }

                }

            }

        }
    }

    @Override
    public String toString(){
        String out = "";
        if(start == null){
            out = "Liste ist leider leer!";
        }else{
            Getraenk temp = start;
            while(temp != null){
                out += temp.getName() + "\tWert: " + temp.getWert() + " Cent\tFüllstand: " + temp.getFuellstand() + "\n";
                temp = temp.next;
            }
        }
        return(out);
    }

    public Getraenk ausgeben(String gesucht){
        Getraenk out = null;
        if(start.getName().equals(gesucht)){
            out = start;
            start = start.next;
            start.prev = null;
        }else{
            Getraenk temp = start;
            while(temp.next != null && (!temp.getName().equals(gesucht))){
                temp = temp.next;
            }
            if(temp.getName().equals(gesucht)){
                out = temp;
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                temp.next = null;
                temp.prev = null;
            }
        }
        return(out);
    }

    public static void main(String[] args) {
        Getraenk cola = new Getraenk("Cola", 330, 190);
        Getraenk mate = new Getraenk("Mate", 500, 220);
        Getraenk ayran = new Getraenk("Ayran", 250, 110);
        Getraenk limo = new Getraenk("Hausgemachte Limo", 500, 390);

        Bar bar = new Bar();
        bar.einsortieren(cola);
        bar.einsortieren(mate);
        bar.einsortieren(ayran);
        bar.einsortieren(limo);

        System.out.println(bar);

        bar.ausgeben("Cola");
        System.out.println(bar);
    }
}
