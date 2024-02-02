package Data;

public class Liste {
    static Auto start;

    public static void sortieren(Auto obj) {
        if (start == null) {
            start = obj;
        } else {
            Auto temp = start;
            while (temp != null) {
                if (obj.marke.compareTo(temp.marke) < 0) {

                    if (temp.prev != null) {
                        obj.prev = temp.prev;
                        temp.prev.next = obj;
                        obj.next = temp;
                        temp.prev = obj;
                    } else {
                        obj.next = temp;
                        temp.prev = obj;
                        start = start.prev;
                    }
                    break;
                } else if (temp.next == null) {
                    temp.next = obj;
                    obj.prev = temp;
                    break;
                } else {
                    temp = temp.next;
                }
            }

        }

    }

    public static void main(String[] args) {
        Auto x = new Auto("gruen", "Ferrari");
        sortieren(x);
        Auto y = new Auto("blau", "Audi");
        sortieren(y);
        Auto z = new Auto("gelb", "BMW");
        sortieren(z);

        Auto temp = start;
        while(temp != null){
            System.out.println(temp.marke);
            temp = temp.next;
        }


    }
}
