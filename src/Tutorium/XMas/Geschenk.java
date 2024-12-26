package Tutorium.XMas;

public class Geschenk {
    private String absender;
    public String empfaenger;
    private int wert;
    private String bezeichnung;
    private boolean isOpen = false;

    public Geschenk(String absender, String empfaenger, int wert, String bezeichnung){
        this.absender = absender;
        this.empfaenger = empfaenger;
        this.wert = wert;
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung(){
        if(isOpen){
            return(bezeichnung);
        }else{
            return("Verschlossen!");
        }
    }

    public String getAbsender(){
        if(isOpen){
            return(bezeichnung);
        }else{
            return("Verschlossen!");
        }
    }

    public Geschenk auspacken(String empfaengerIn){
        if(empfaengerIn.equals(empfaenger)){
            isOpen = true;
        }
        return (this);
    }

    @Override
    public String toString(){
        double euro = wert / 100d;
        String out ="";
        if(isOpen){
            out += bezeichnung + "\nkommt von: " + absender + "\nund ist für: " + empfaenger + "\nPssst: Wert: " + euro + "€\n############\n";
        }else{
            out = "Dieses Geschenk ist verschlossen!";
        }
        return(out);
    }
}
