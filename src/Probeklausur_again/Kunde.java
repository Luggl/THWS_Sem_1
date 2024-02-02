package Probeklausur_again;

public class Kunde {
    Bestellung[] bestellungen =new Bestellung[50];

    public Bestellung gesuchteBestellung(String name_in){
        Bestellung out = null;
        for(int i = 0; i<50; i++){
            for(int j = 0; j<50; j++){
                if(name_in.equals(bestellungen[i].artikel[j].getArtikelname())){
                    out = bestellungen[i];
                    break;
                }

            }
        }
        return(out);
    }
}
