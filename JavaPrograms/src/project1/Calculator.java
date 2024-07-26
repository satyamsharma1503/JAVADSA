package project1;
import java.util.Scanner ;
public class Calculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        char operator;
        double number1 , number2,result;
        System.out.println("Choose this operator :\n1. +\n2. -\n3. *\n4. /\n5. %\n6. nothing ");
        System.out.println("Enter ypur choose opertor : ");
        operator = sc.next().charAt(0);
        System.out.println("Enter a first number ");
        number1 = sc.nextDouble();
        System.out.println("Enter a Second number ");
        number2 = sc.nextDouble();
        switch (operator){
            case '1':
                result = number1 + number2;
                System.out.println("the final result is "+number1 + " + "+number2 + " = "+result);
                break;
            case '2':
                result = number1 - number2;
                System.out.println("the final result is "+number1 + " - "+number2 + " = "+result);
                break;
            case '3':
                result = number1 * number2;
                System.out.println("the final result is "+number1 + " * "+number2 + " = "+result);
                break;
            case '4':
                result = number1 + number2;
                System.out.println("the final result is "+number1 + " / "+number2 + " = "+result);
                break;
            case '5':
                result = number1 %  number2;
                System.out.println("the final result is "+ number1 + " % "+number2 + "  =  "+result);
                break;
            default:
                System.out.println("Invalid operator ");
        }
    }
}
