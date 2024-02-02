package L12;

import L8.Auto;

public class Liste_einfach {
    Auto_einfach start;
    Auto_einfach temp;

    public void einfuegen_ps(Auto_einfach x){
        if(start == null){
            start = x;
        }else{

            if(x.getPs()<start.getPs()){
                x.next = start;
                start = x;
            }else{
                temp = start;
                while(temp != null){
                    if(temp.next == null){
                        temp.next = x;
                        break;

                    }else if(x.getPs()>temp.next.getPs()){
                        temp = temp.next;

                    }else{
                        x.next = temp.next;
                        temp.next = x;
                        break;

                    }
                }

            }
        }

    }
    @Override
    public String toString(){
        String out ="";
        temp = start;
        while(temp != null){
            out += "Farbe: " + temp.getFarbe() + " --- PS: " + temp.getPs() + "\n";
            temp = temp.next;
        }
        return(out);
    }


    public static void main(String[] args){
        Liste_einfach l = new Liste_einfach();
        Auto_einfach a = new Auto_einfach("blau", 150);
        l.einfuegen_ps(a);
        Auto_einfach b = new Auto_einfach("gruen", 50);
        l.einfuegen_ps(b);
        Auto_einfach c = new Auto_einfach("gelb", 500);
        l.einfuegen_ps(c);
        System.out.println(l);
    }
}
