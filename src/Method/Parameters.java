package Method;

//Parameters are the named variable passed in Method or Constructor that act as a placeholder for the data the object need to perform a task 
public class Parameters {

    static void myMethod(String name){ //here String name is parameter which is passed as a variable 
        System.out.println("Hello! "+name);
    }
    public static void main(String[] args){
        myMethod("Arshil");
        myMethod("Rehan");
        myMethod("Huzefa");
        myMethod("Farhan");
        myMethod("Talha");
        myMethod("Javed");
    }
}
