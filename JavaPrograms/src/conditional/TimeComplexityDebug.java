package conditional;

public class TimeComplexityDebug {
    public static void main(String[] args) {
        int arr[]={1,7,9,11,12};
        int sum =0;
        for(int i=0; i<arr.length; i++ ){
            sum=sum+arr[i];

        }
        int avg =(sum/arr.length);
        System.out.println(avg);
    }
}
