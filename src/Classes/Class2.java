package Classes;

class Pen {

    String color;
    String type;

    public void print(){
        System.out.println(color);
        System.out.println(type);
    }
}

public class Class2 {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "gel";

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "fountain";

        p1.print();
        p2.print();
    }
}
