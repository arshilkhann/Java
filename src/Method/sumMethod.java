package Method;
import java.sql.SQLOutput;
import java.util.*;

public class sumMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your First Number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter your Second Number : ");
        int num2 = sc.nextInt();

        System.out.println("The sum of two Numbers are : "+sum(num1,num2));

    }

    static int sum(int a  , int b){
        return a+b;
    }
}
