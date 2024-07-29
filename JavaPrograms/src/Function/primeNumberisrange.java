package Function;
import java.util.Scanner;
public class primeNumberisrange {
    public static boolean  primeNumber(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean primenumber(int n){
        for(int i=2; i<=n;i++) {
            if (primeNumber(i)){
                System.out.print(i+",");
            }
//            System.out.print(" ");
        }
        return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number prime to check how number is prime :");
        int n = sc.nextInt();
       primenumber(n);
        }

    }
