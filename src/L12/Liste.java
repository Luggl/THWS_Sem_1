package L12;

public class Liste {
    Personenknoten start;

    public void sortEinf(Personenknoten x){
        if(start == null){
            start = x;
        } else if(x.getAlter() < start.getAlter()) {
            x.next = start;
            start.prev = x;
            start = start.prev;

        }else{
            Personenknoten temp = start.next;
            Personenknoten oldTemp = start;
            while(temp!= null){
                if(x.getAlter() < temp.getAlter()){
                    oldTemp.next = x;
                    x.next = temp;
                    break;

                }else if(temp.next == null) {
                    temp.next = x;
                    break;
                }else{
                    oldTemp = temp;
                    temp = temp.next;
                }
            }

        }


    }
    //public Personenknoten namenSuchen(String nameGesucht){
        
    //}
}
