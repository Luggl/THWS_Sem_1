package Probeklausur_again;

public class Sitzplatzreservierung {
    private char[][] Reihen;

    public char[][] erstelleSaal(int anzahlReihen){
        Reihen = new char[anzahlReihen][];
        for(int i=3; i<anzahlReihen+3; i++){
            char[] x = new char[i];
            Reihen[anzahlReihen+2-i] = x;
        }
        return(Reihen);
    }

    public void fuelleSitze(){
        for(int i =0; i<Reihen.length; i++){
            for(int j = 0; j<Reihen[i].length; j++){
                int x = (int) (Math.random() * 2);
                if(x == 0){
                    Reihen[i][j] = 'o';
                }else{
                    Reihen[i][j] = 'x';
                }
            }
        }

    }

    public void bucheSitz(int reihe, int sitz){
        if (Reihen[reihe][sitz] == 'o') {
            Reihen[reihe][sitz] = 'x';
        } else {
            System.out.println("Dieser Platz ist nicht frei");
        }

    }

    @Override
    public String toString(){
        String out ="";
        for(int i = 0; i<Reihen.length; i++){
            for(int j = 0; j<Reihen[i].length; j++){
                out+=Reihen[i][j];
            }
            out +="\n";
        }
        return(out);

    }

    public static void main(String[] args) {
        Sitzplatzreservierung saal = new Sitzplatzreservierung();
        saal.erstelleSaal(5);
        System.out.println(saal);
        saal.fuelleSitze();
        System.out.println(saal);
        saal.bucheSitz(2, 3);
        System.out.println(saal);
    }
}
