package L11;

public class L11_Ueb2 {
    public static void main(String[] args) {

        boolean[][][] ticTacToe = new boolean[3][3][3];
        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                for (int k = 0; k < ticTacToe[i][j].length; k++) {
                    if (Math.random() > 0.5) {
                        ticTacToe[i][j][k] = true;
                        System.out.print("X");
                    } else {
                        ticTacToe[i][j][k] = false;
                        System.out.print("O");
                    }
                }
                System.out.println();

            }
            System.out.println();

        }

    }
}