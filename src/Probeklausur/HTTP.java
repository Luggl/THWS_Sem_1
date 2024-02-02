package Probeklausur;

public class HTTP {

    public void HTTPMethode(String befehl, String url){
        if(befehl != "POST") {
            befehl = "GET";
        }
    }
}
