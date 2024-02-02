package L10;

public class Uhr {
    private int std;
    private int min;
    private int sek;

    public Uhr(int std, int min, int sek){
        if(std < 0 || min < 0 || sek < 0 || std > 24 || min > 60 || sek > 60){
            this.std = 12;
        }else{
            this.std = std;
            this.min = min;
            this.sek = sek;
        }

    }

    public int getStd(){
        return(std);
    }

    public int getMin(){
        return(min);
    }

    public int getSek(){
        return(sek);
    }

    public void setUhr(int std, int min, int sek){
        if(std < 0 || min < 0 || sek < 0 || std > 24 || min > 60 || sek > 60){
            System.out.println("Mindestens eine Angabe ist Fehlerhaft.");
        }else{
            this.std = std;
            this.min = min;
            this.sek = sek;
        }
    }

    public void naechsteSek(){
        sek++;
        if(sek == 60){
            min++;
            sek = 0;
            if(min == 60){
                std++;
                min = 0;
                if(std == 24){
                    std = 0;
                }
            }
        }
    }
}
