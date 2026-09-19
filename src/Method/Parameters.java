package Method;

//Parameters are the named variable passed in Method or Constructor that act as a placeholder for the data the object need to perform a task 
public class Parameters {

    static void myMethod(String name , int age){ //here String name is parameter which is passed as a variable 
        System.out.println(name+"'s age is "+age);
    }
    public static void main(String[] args){
        myMethod("Arshil" , 20);
        myMethod("Rehan",16);
        myMethod("Huzefa",16);
        myMethod("Farhan",20);
        myMethod("Talha",12);
        myMethod("Javed",17);
    }
}
