package pratice;

public class subarray {
    public static void subarray(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            int start=i;
            for(int j=0; j<num.length; j++){
                int end=j;
                currSum=0;
                for(int k=start; k<=end; k++){
                    currSum=currSum+num[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("maxSum="+maxSum);
    }
    public static void main(String[] args){
        int num[]={2,1,4};
        subarray(num);
    }
}
