package Probeklausur_again;

public class Student {
    private String name;
    private int alter;

    public Student(String name, int alter){
        this.name = name;
        this.alter = alter;
    }

    public int getAlter(){
        return(alter);
    }

    public static Student[] ab18(Student[] in){
        int countStud = 0;
        int countIn=0;
        for(int i = 0 ; i<in.length; i++){
            if(in[i].getAlter()>17){
                countStud++;
            }
        }
        Student[] out = new Student[countStud];
        for(int i = 0; i<in.length; i++){
            if(in[i].getAlter()>17){
                out[countIn]=in[i];
                countIn++;
            }
        }
        return(out);
    }
    public String getName(){
        return(name);
    }

    public static void main(String[] args) {
        Student a = new Student("Lukas", 27);
        Student b = new Student("Denis", 20);
        Student c = new Student("Tom", 26);
        Student d = new Student("Dilan", 12);
        Student e = new Student("Timo", 21);
        Student f = new Student("Tobi", 13);
        Student[] test = {a, b, c, d, e, f};

        for(int i = 0; i<test.length; i++){
            System.out.println(test[i].getName());
        }
        for(int i = 0; i<ab18(test).length; i++){
            System.out.println(ab18(test)[i].getName());
        }
    }
}
