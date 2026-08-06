package Classes;

public class Class1 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.name = "Rehan" ;
        System.out.print("Object 1 : ");
        d1.walk();

        System.out.println();

        Demo d2 = new Demo();
        d2.name = "Farhan" ;
        System.out.print("Object 2 : ");
        d2.run();
    }
}



class Demo {
    String name ;
    public void walk(){
        System.out.println("Walking");
    }

    public void run(){
        System.out.println("Running");
    }
}
