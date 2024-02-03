package Probeklausur;

public class Polizei {
    final public static double p = 0.8;
    public static double berechneMasse(int v, double e){
        double out = v * e * p;
        return(out);
    }
    public static double  berechneAlkKonzentration(double a, int m, char s){
        double out;
        if (s =='m'){
            out = a / (m * 0.7);
        }else if(s =='w'){
            out = a / (m * 0.6);
        }else if(s == 'j'){
            out = a / (m * 0.5);
        }else{
            System.out.println("Fehlerhaftes Geschlecht?");
            out = -1.0;
        }
        return(out);
    }

    public static void main(String[] args){
        double masse = 40;
        System.out.println("Folgende Alkoholmasse: " + masse);

        double konz = berechneAlkKonzentration(masse, 70, 'm');
            if(konz >= 0.5){
                System.out.println("Sie dürfen kein Auto mehr fahren!");
                System.out.println("Alkoholkonzentration: " + konz);

            }else if(konz >= 0.3){
                System.out.println("Sie sollten kein Auto mehr fahren!");
            }else{

            }
        }
    }
