package pratice;

public class largestvalue {
    public static int getlargest(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<=number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {1,3,4,5,6,9};
        System.out.print("largest value is: " + getlargest(number));

    }
}
