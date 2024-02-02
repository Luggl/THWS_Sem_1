package Probeklausur;

public class Timeline {

    Post start;

    public void fuegePostEin(Post in){
        if(start == null){
            start = in;
        }else{
            in.next = start;
            start = in;
        }
    }
    public void gibAus(){
        Post temp = start;
        while(temp!=null){
            System.out.println(temp.getAbsender() + "--> " + temp.getEmpfaenger() + "\n" + temp.getText());
            temp = temp.next;
        }
    }

    public static void main(String[]args){
        Timeline t = new Timeline();
        Post x = new Post("Frohe Weihnachten!", "Alice", "Bob");
        t.fuegePostEin(x);
        x = new Post("Danke! Guten Rutsch ins neue Jahr!", "Bob", "Alice");
        t.fuegePostEin(x);
        x = new Post("Gutes neues Jahr!", "Alice", "Bob");
        t.fuegePostEin(x);

        t.gibAus();
    }
}
