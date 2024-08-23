package FunctionAndMethod;

import java.util.Scanner;

     class Algebra {
       int  Add(int a, int b) {
            int sum = a + b;
            return sum;
       }
    }
 public class addtwonumberusingmethod {
    public static void main(String[] args){
        Algebra obj = new Algebra();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Add two number is ");
        int ans = obj.Add(a,b);
        System.out.println(ans);
    }
}