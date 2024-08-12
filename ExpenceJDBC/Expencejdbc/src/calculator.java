import java.util.Scanner;

public class calculator {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the first number =");
        int a = sc.nextInt();
        System.out.print("enter the Second number =");
        int b = sc.nextInt();
        System.out.print("Choose the operator\n1.+\n2.-\n3.*\n4./");
        int operator =sc.nextInt();
        MyCalculator myCalculator = new MyCalculator(a,b,operator);

    }
}
class MyCalculator{
    public MyCalculator(int a ,int b , int operator){
        switch(operator){
            case 1:
            System.out.print(a+b);
            break;

            case 2:
                System.out.print(a-b);
                break;
            case 3:
                System.out.print(a*b);
                break;
            case 4:
                System.out.print(a/b);
                break;
            case 5:
                System.out.print("choose the operator");
            default:
        }

    }
}
