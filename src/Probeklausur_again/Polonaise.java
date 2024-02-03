package Probeklausur_again;

public class Polonaise {
    Roboter start;
    Roboter temp;

    public Polonaise(){

    }
    public void anhaengen(Roboter in){
        if(start == null){
            start = in;
        }else{
            temp = start;
            while(temp!=null) {
                if (in.getHoehe() < start.getHoehe()) {
                    in.next = start;
                    start = in;
                    break;
                } else if (temp.next == null) {
                    temp.next = in;
                    break;
                } else if (in.getHoehe() < temp.next.getHoehe()) {
                    in.next = temp.next;
                    temp.next = in;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
    }

    public void vorstellen(){
        temp = start;
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Polonaise p = new Polonaise();
        Roboter a = new Roboter("Denis", 180);
        p.anhaengen(a);
        Roboter b = new Roboter("Dilan", 125);
        p.anhaengen(b);
        Roboter c = new Roboter("Lukas", 185);
        p.anhaengen(c);
        Roboter d = new Roboter("Tom", 179);
        p.anhaengen(d);
        p.vorstellen();
    }
}
