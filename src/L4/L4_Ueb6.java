package L4;

public class L4_Ueb6 {
    public static void main(String[] args){
        int firstCount = 1;
        int secondCount = 1;

        while(firstCount <= 10){
            while(secondCount <= 10){
                System.out.println(firstCount + " * " + secondCount + " = " + firstCount*secondCount);
                secondCount++;
            }
            secondCount = 1;
            firstCount ++;
            System.out.println("\n");
        }
    }
}
