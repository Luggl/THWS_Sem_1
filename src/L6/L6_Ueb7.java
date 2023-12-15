package L6;

import java.util.Scanner;

public class L6_Ueb7 {
    public static void formatName(String firstname, String secondname){
        System.out.println(firstname + ", " + secondname);
    }
    public static void formatNamewithMatriculationNr(String firstname, String secondname, int MatriculationNr){
        System.out.println(firstname + ", " + secondname + " (" + MatriculationNr + ")");
    }
    public static void formatNamewithMatriculationNrandMail(String firstname, String secondname, int MatriculationNr, String email){
        System.out.println(firstname + ", " + secondname + " (" + MatriculationNr + ")" + ": " + email );
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("gib mir deinen Vornamen");
        String vorname = scanner.next();
        System.out.println("gib mir deinen Nachnamen");
        String nachname = scanner.next();
        System.out.println("gib mir deine Matrikelnummer");
        int matrikelnummer = scanner.nextInt();
        System.out.println("gib mir deine E-Mail");
        String mail = scanner.next();

        formatName(vorname, nachname);
        formatNamewithMatriculationNr(vorname, nachname, matrikelnummer);
        formatNamewithMatriculationNrandMail(vorname, nachname, matrikelnummer, mail);
    }
}
