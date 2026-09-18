package Method;

public class MethodOverloading {
    public static void main(String[] args){
        Greet person1 = new Greet();
        person1.greeting();

        Greet person2 = new Greet();
        person2.greeting("Arshil");
    }
}

class Greet{
    void greeting(){
        System.out.println("Hello, Good Morning!");
    }

    void greeting(String name){
        System.out.println("Hello "+name+", Good Morning!");
    }
}
