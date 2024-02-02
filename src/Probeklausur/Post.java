package Probeklausur;

public class Post {
    private String text;
    private String absender;
    private String empfaenger;
    Post next;

    public String getText(){
        return(text);
    }
    public String getAbsender(){
        return(absender);
    }
    public String getEmpfaenger(){
        return(empfaenger);
    }
    public Post(String text, String absender, String empfaenger){
        this.text = text;
        this.absender = absender;
        this.empfaenger = empfaenger;
    }

}
