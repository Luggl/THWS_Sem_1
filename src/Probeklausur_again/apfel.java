package Probeklausur_again;

public class apfel {
    int umfang;
    String farbe;

    @Override
    public String toString(){
        String out = "Mein Apfel hat den Umfang: " + umfang + " und die Farbe: " + farbe;
        return(out);

    }

    public static void main(String[] args) {
        apfel x = new apfel();
        x.umfang = 13;
        x.farbe = "blau";
        System.out.println(x);
    }
}
