public class flatten {
    public static void main(String[] args) {

        int[][] x = new int[(int)(Math.random()*500)][(int)(Math.random()*500)];

        for(int i = 0; i<x.length; i++){
            for(int j = 0; j<x[i].length; j++){
                x[i][j] = (int)(Math.random()*42300);
            }
        }

        for(int i = 0; i<x.length; i++){
            for(int j = 0; j<x[i].length; j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }

        int [] out = flatten(x);
        for(Integer i : out){
            System.out.print(i + " ");
        }


    }

    public static int[] flatten(int[][] in){
        int counter=0;
        for(int i=0;i<in.length;i++){
            for(int k=0;k<in[i].length;k++){
                counter++;
            }
        }
        int [] flatter1=new int[counter];
        int c = 0;
        for(int i=0;i<in.length;i++){
            for(int k=0;k<in[i].length;k++){
                flatter1[c] = in[i][k];
                c++;
            }
        }
        return(flatter1);
    }
}
