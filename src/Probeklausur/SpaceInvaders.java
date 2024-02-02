package Probeklausur;

import java.util.Scanner;

public class SpaceInvaders {

    public char[][] spaceinv = new char[5][8];




    public void init(){

        for(int i = 0; i<8; i++){
            spaceinv[0][i] = '0';
        }
        for(int j = 1; j<4; j++){
            for(int k = 0; k<8; k++){
                spaceinv[j][k] = ' ';
            }
        }
        boolean ship = false;

        for(int l = 0; l<8; l++){
            if(Math.random()*10 > 5 && ship == false){
                spaceinv[4][l] = 'V';
                ship = true;
            }else if(l == 7 && ship == false){
                spaceinv[4][l] = 'V';
            }else{
                spaceinv[4][l] = ' ';
            }

        }

    }

    public void bewege(char in){
        if(in == 'a'){
            if(spaceinv[4][0] == ' '){
                for(int i = 0; i<spaceinv[4].length-1; i++){
                    spaceinv[4][i] = spaceinv[4][i+1];
                }
                spaceinv[4][7] = ' ';
            }
        }
        if(in == 'd') {
            if (spaceinv[4][7] == ' ') {
                for (int i = 7; i > 0; i--) {
                    spaceinv[4][i] = spaceinv[4][i - 1];
                }
                spaceinv[4][0] = ' ';
            }
        }else if(in == 'e'){
            for(int i = 0; i<=7; i++){
                if(spaceinv[4][i] == 'V'){
                    spaceinv[3][i] = 'I';
                    toString();
                    spaceinv[3][i] = ' ';
                    spaceinv[2][i] = 'I';
                    toString();
                    spaceinv[2][i] = ' ';
                    spaceinv[1][i] = 'I';
                    toString();
                    spaceinv[1][i] = ' ';
                    spaceinv[0][i] = ' ';
                }
            }
        }else{
            return;
        }
    }
    @Override
    public String toString(){
        for(int i = 0; i < spaceinv.length; i++){
            for(int j = 0; j < spaceinv[i].length; j++){
                System.out.print(spaceinv[i][j]);
            }
            System.out.print("\n");

        }
        return(null);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char input;
        SpaceInvaders x = new SpaceInvaders();
        x.init();
        x.toString();
        do{
            input = scanner.next().charAt(0);

            x.bewege(input);
            x.toString();
        }while(input != 'x');



    }


}
