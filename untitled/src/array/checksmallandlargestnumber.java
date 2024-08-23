package array;

public class checksmallandlargestnumber {
    public static int  getlargest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i< numbers.length;i++){
            if(largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
//        return largest;

        System.out.println(" smallest number is array ="+ smallest);
        return largest;

    }
    public static void main(String[] args){
        int numbers[]={1,2,8,6,9,3,};
        getlargest(numbers);
        System.out.println("largest number of array ="+ getlargest(numbers));
    }
}
