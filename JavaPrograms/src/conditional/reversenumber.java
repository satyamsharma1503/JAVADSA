package conditional;

import java.util.Scanner;

public class reversenumber {
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a size of element ");
        int n = sc.nextInt();
        int arr[] =new int[n];
        System.out.println("enter array elements ");
        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("this is reverse array");
        for(int i= arr.length;   i>0;  i++ ){
            System.out.print(arr[i]+ "");
        }
    }

}
