package Probeklausur_again;

public class Kurs {
    private String kursart;
    private int kursdauer;
    Mitglied[] mitglieder;

    public Kurs(String kursart, int kursdauer){
        this.kursart = kursart;
        this.kursdauer = kursdauer;
        this.mitglieder = new Mitglied[25];
    }
    public String getKursart(){return(kursart);}
    public int getKursdauer(){return(kursdauer);}
    public void setKursart(String kursart){this.kursart = kursart;}
    public void setKursdauer(int kursdauer){this.kursdauer = kursdauer;}

    public Mitglied[] getMitglieder() {
        return mitglieder;
    }
    public void anmeldungKurs(Mitglied in){
        for(int i =0; i< mitglieder.length; i++){
            if(in.bereitsAngemeldet){
                System.out.println("bereits zu einem Kurs angemeldet");
                break;
            }else if(mitglieder[i] == null){
                mitglieder[i] = in;
                in.bereitsAngemeldet = true;

                break;
            }else if(i == mitglieder.length-1 && mitglieder[i]!= null){
                System.out.println("Dieser Kurs ist bereits voll!");
            }
        }
    }
    public void abmeldungKurs(Mitglied in){
        boolean worked = false;
        for(int i = 0; i< mitglieder.length; i++){
            if(mitglieder[i].getMitgliedsnr() == in.getMitgliedsnr()){
                mitglieder[i] = null;
                in.bereitsAngemeldet = false;
                worked = true;
            }
        }
        if(!worked){
            System.out.println("Mitgliedsnummer nicht im Kurs angemeldet?");
        }
    }

}
