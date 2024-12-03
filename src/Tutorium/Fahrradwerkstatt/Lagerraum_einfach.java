package Tutorium.Fahrradwerkstatt;

public class Lagerraum_einfach {
    Fahrrad start;
    Fahrrad temp;

    public void einfuegen(Fahrrad in){
        if(start == null){
            start = in;
        }else if(start.next == null) {
            if (start.getRahmenhoehe() < in.getRahmenhoehe()) {
                start.next = in;
            } else {
                in.next = start;
                start = in;
            }
        }else if(start.getRahmenhoehe() >= in.getRahmenhoehe()){
            in.next = start;
            start = in;
        }else{
            temp = start;
            while(temp.next != null && temp.next.getRahmenhoehe() <= in.getRahmenhoehe()){
                temp = temp.next;
            }
            in.next = temp.next;
            temp.next = in;
        }
        index();
    }

    private void index(){
        if(start != null){
            temp = start;
            int index = 1;
            while(temp != null){
                temp.setIndex(index);
                index++;
                temp = temp.next;
            }
        }
    }

    @Override
    public String toString(){
        String out = "************Lagerraum \"einfach\":************\n";
        temp = start;
        while(temp != null){
            out+= temp.getIndex() + ". Stelle im Lagerraum\t" + temp.getMarke() + "\tRahmenhöhe: " + temp.getRahmenhoehe() + "\tFarbe: " + temp.getFarbe() + "\n";
            temp = temp.next;
        }
        return out;
    }

}
