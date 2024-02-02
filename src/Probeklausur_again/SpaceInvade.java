package Probeklausur_again;

import java.util.Scanner;

public class SpaceInvade {

    char[][] game = new char[12][12];

    public void init(){
        for(int i = 0; i<12; i++){
            for(int j = 0; j<12; j++){
                game[i][j] = ' ';
            }
        }
        for(int i = 0; i<2; i++){
            for(int j = 0; j<5; j++){
               game[i][j] = 'O';
            }
            for(int j=7; j<12; j++){
                game[i][j] = 'O';
            }
        }
        for(int i = 2; i<4; i++){
            for(int j = 3; j<9; j++){
                game[i][j] = 'O';
            }
        }
        for(int i =6; i<8; i++){
            for(int j = 0; j<12; j++){
                if(j < 4) {
                    game[i][j] = 'X';
                }else if(j < 8){

                }else{
                    game[i][j] = 'X';
                }
             }
        }
        int rand = (int) (Math.random()*12);
        game[11][rand] = 'V';
    }

    @Override
    public String toString(){
        String out = "";
        for(int i = 0; i<game.length; i++){
            for(int j = 0; j<game[i].length; j++){
                out += game[i][j];
            }
            out +="\n";
        }
        return(out);
    }

    public void bewege(char in){
        if(in == 'a'){
            if(game[11][0] == ' '){
                for(int i = 0; i<11; i++){
                    game[11][i] = game[11][i+1];
                }
                game[11][11] = ' ';
            }
        }else if(in == 'd'){
            if(game[11][11] == ' '){
                for(int i = 11; i>0; i--){
                    game[11][i] = game[11][i-1];
                }
                game[11][0] = ' ';
            }
        }
    }

    public void begin(){
        init();
        System.out.println(toString());
        Scanner scanner = new Scanner(System.in);
        char inp = scanner.nextLine().charAt(0);

        do{
            System.out.println(toString());
            bewege(inp);
            inp = scanner.nextLine().charAt(0);
        }while(inp != 'x');

        System.out.println("Thank you for playing!");
    }

    public static void main(String[] args){
        SpaceInvade x = new SpaceInvade();
        x.begin();
    }
}
