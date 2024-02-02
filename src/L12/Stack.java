package L12;

public class Stack {
    TShirt start;

    public void push(TShirt in){
        if(start == null){
            start = in;
        }else{
            start.prev = in;
            in.next = start;
            start = in;
        }
    }

    public TShirt pop(){
        TShirt out = null;
        if(start != null){
            out = start;
            if(start.next != null){
                start.next.prev = null;
                start = start.next;
            }else{
                start = null;
            }
        }
        return(out);
    }
    public boolean isEmpty(){
        boolean out = true;
        if(start != null){
            out = false;
        }
        return(out);
    }

    public String retrieveContent(){
        String out = "";
        TShirt temp = start;
        while(temp!=null){
            out += temp.getMarke() + " -- " +  temp.getFarbe() + "\n";
            temp = temp.next;
        }
        return(out);
    }

    public static void main(String[] args){
        Stack y = new Stack();
        TShirt x = new TShirt("darkred", "marke a");
        y.push(x);
        System.out.println(y.retrieveContent());
        x = new TShirt("blue", "marke b");
        y.push(x);
        System.out.println(y.retrieveContent());
        x = new TShirt("lightblue", "marke c");
        y.push(x);
        System.out.println(y.retrieveContent());
        x = new TShirt("green", "Denis Goshi");
        y.push(x);
        System.out.println(y.retrieveContent());
        x = new TShirt("yellow", "Marke E");
        y.push(x);
        System.out.println(y.retrieveContent());
        x = new TShirt("lightorange", "Marke f");
        y.push(x);
        System.out.println(y.retrieveContent());
        x = new TShirt("orange", "Marke g");
        y.push(x);
        System.out.println(y.retrieveContent());

        TShirt out = y.pop();
        System.out.println("Gerade herausgenommen: " + out.getMarke() + " -- " + out.getFarbe());

    }
}
