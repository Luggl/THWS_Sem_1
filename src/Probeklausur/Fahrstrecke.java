package Probeklausur;

public class Fahrstrecke {
    static Zielort start;
    static Zielort temp;

    public static void einfuegen(Zielort x){
        if(start == null){
            start = x;
        }else{
            temp = start;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = x;
        }
    }
    public static int gesamtStrecke(){
        int out = 0;
        temp = start;
        while(temp != null){
            out += temp.getDist();
            temp = temp.next;
        }
        return(out);
    }
}


