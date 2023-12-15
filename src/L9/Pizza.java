package L9;

public class Pizza {

    String name;
    float[] durchmesser;
    float[] preise;

    public Pizza(String name, float[] durchmesser, float[] preise){
        if(durchmesser.length != preise.length){
            System.out.println("Durchmesser und Preise müssen die gleiche Anzahl haben!");
        }else{
            this.name = name;
            this.durchmesser = durchmesser;
            this.preise = preise;
        }
    }

    public double mVPPizza(){
        int index = 0;
        double preisLeistung;
        for(int i = 1; i < durchmesser.length; i++){
            preisLeistung = preise[index] / durchmesser[index];
            if(preisLeistung > preise[i] / durchmesser[i]){
                index = i;
            }
        }
        preisLeistung = preise[index] / durchmesser[index];

        return(preisLeistung);
    }
}
