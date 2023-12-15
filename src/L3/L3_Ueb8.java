package L3;

import java.io.IOException;
import java.util.Scanner;

public class L3_Ueb8 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ist das erste Zeichen true (t) oder false (f)?");
        String firstInput_s = scanner.nextLine();
        char firstInput = firstInput_s.charAt(0);
        System.out.println("Ist das zweite Zeichen true (t) oder false (f)?");
        String secondInput_s = scanner.nextLine();
        char secondInput = secondInput_s.charAt(0);

        int ausgabewert;

        if(firstInput == 70 || firstInput == 102){                       //erster Input f oder F
            if (secondInput == 70 || secondInput == 102){                //zweiter Input f oder F
                ausgabewert = 0;
                System.out.println("Ausgabewert = " + ausgabewert);
            }else if (secondInput == 84 || secondInput == 116) {          //zweiter Input t oder T
                ausgabewert = 1;
                System.out.println("Ausgabewert = " + ausgabewert);
            }

        }else if(firstInput == 84 || firstInput == 116) {                 //erster Input t oder T
            if (secondInput == 70 || secondInput == 102) {             //zweiter Input f oder F
                ausgabewert = 2;
                System.out.println("Ausgabewert = " + ausgabewert);
            } else if (secondInput == 84 || secondInput == 116) {           //zweiter Input t oder T
                ausgabewert = 3;
                System.out.println("Ausgabewert = " + ausgabewert);
            }
        }else{
            System.out.println("Fehlerhafte Angaben!");
        }

    }
}
