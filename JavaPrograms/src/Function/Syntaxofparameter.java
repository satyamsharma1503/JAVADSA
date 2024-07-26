package Function;
import java.util.Scanner;
public class Syntaxofparameter {
    public static int calculateSum(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number ");
        int a= sc.nextInt();
        System.out.println("enter a second number ");
        int b = sc.nextInt();
        int sum =calculateSum(a,b);
        System.out.println("this is sum of two number " +sum);
    }
}
