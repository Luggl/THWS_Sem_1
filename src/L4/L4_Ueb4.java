package L4;

public class L4_Ueb4 {
    public static void main(String[] args){
        int fahrenheit = 0;
        System.out.println("Fahrenheit\tCelsius");
        while(fahrenheit<=300){
            float celsius = 5 / 9f *(fahrenheit - 32);
            String outString = String.format(fahrenheit + "\t" + "\t" + "\t" + "%.2f", celsius);
            System.out.println(outString);

            fahrenheit++;
        }
    }
}
