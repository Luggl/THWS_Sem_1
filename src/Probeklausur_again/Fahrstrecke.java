package Probeklausur_again;

public class Fahrstrecke {
    Zielort start;
    Zielort temp;

    public void einfuegen(Zielort in){
        if(start == null){
            start = in;
        }else{
        temp = start;
        while(temp != null){
            if(temp.next != null){
                temp = temp.next;
            }else{
                temp.next = in;
                break;
            }
        }

        }


    }
//    public int gesamteStrecke(){
//
//    }
}
