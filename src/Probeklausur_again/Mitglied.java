package Probeklausur_again;

public class Mitglied {
    private int mitgliedsnr;
    boolean bereitsAngemeldet = false;

    public Mitglied(int mitgliedsnr){
        this.mitgliedsnr = mitgliedsnr;
    }
    public int getMitgliedsnr(){
        return(mitgliedsnr);
    }
}
