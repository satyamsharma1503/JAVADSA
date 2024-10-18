package array;

import java.util.Scanner;

public class inputinarrayuers {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of element input ");
        int n = sc.nextInt();
        System.out.print("enter the element ");
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
//            System.out.print(a[i]);
        }
        System.out.print("");
    }
}
