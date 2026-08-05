package Method;

import java.util.*;

public class avgMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First Number : ");
        float num1 = sc.nextFloat();

        System.out.print("Enter your Second Number : ");
        float num2 = sc.nextFloat();

        System.out.println("The sum of two Numbers are : "+avg(num1,num2));
    }

    static float avg(float a , float b){
        return (a+b)/ 2 ;
    }
}
