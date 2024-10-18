package array;

import java.util.Scanner;

public class SumofSubArray {

    public static void sumofsubarray(int number[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i =0; i< number.length; i++){
            int start = i;
            for(int j=i; j< number.length; j++){
                int end =j;
                currSum= 0;
                for(int k=start; k<=end; k++){
                    currSum = currSum+number[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max-sum is "+ maxSum);
    }

    public static  void main(String[]args){
        Scanner sc = new Scanner(System.in);
    System.out.println("number of element ");
        int n= sc.nextInt();
        int number[] = new int[n];
        System.out.print("enter the element ");
        for(int i=0; i<n; i++){
           number[i] = sc.nextInt();
        }
        System.out.println();
        sumofsubarray(number);
    }
}
