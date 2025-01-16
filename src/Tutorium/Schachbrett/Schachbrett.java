package Tutorium.Schachbrett;

public class Schachbrett {
    char[][] spielfeld = new char[8][8];

    public static int indexEins(String in){
        char gesucht = in.charAt(1);
        int berechnung = ('8' - gesucht);
        int out = berechnung % 8;

        return(out);
    }

    public static int indexZwei(String in){
        char gesucht = in.toUpperCase().charAt(0);
        int berechnung = (gesucht - 'A');
        int out = berechnung % 8;
        return(out);
    }

    public static void main(String[] args) {
        String gesucht = "D3";

        System.out.println("("+indexEins(gesucht)+","+indexZwei(gesucht)+")");
    }
}
