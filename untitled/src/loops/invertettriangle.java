package loops;
import java.util.Scanner;
public class invertettriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

//        this inverted pyramid

//        for(int i=1; i<=a; i++){
//            for(int j=1; j<=(a-i+1); j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

// pyramid
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = a; k >= 1; k--) {
                    System.out.println("*");
            }

        }
    }
}
