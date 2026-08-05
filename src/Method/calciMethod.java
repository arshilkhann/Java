package Method;

import java.util.*;

public class calciMethod {
    public static void main(String[] args) {
        System.out.println("Welcome To Calculator!");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Choice (+ , - , / , *) : ");
        String choice = sc.nextLine();

        System.out.print("Enter your First Number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter your Second Number : ");
        float num2 = sc.nextFloat();


        switch (choice) {
            case "+":
                System.out.print("The Addition of Two number is : "+sum(num1 , num2));
                break;
            case "-":
                System.out.print("The Subtraction of Two number is : "+subtract(num1 , num2));
                break;
            case "/":
                System.out.print("The Division of Two number is : "+divide(num1 , num2));
                break;
            case "*":
                System.out.print("The Multiplication of Two number is : "+multiply(num1 , num2));
                break;
            default:
                System.out.print("Invalid choice , choose from (+ , - , / , *) ");
        }
    }

    static float sum(float a , float b){
        return a+b ;
    }

    static float subtract(float a , float b){
        return a-b ;
    }

    static float divide(float a , float b){
        return a/b ;
    }

    static float multiply(float a , float b){
        return a*b ;
    }

}
