package conditional;

public class findsecondhighestnumber {
    public static void main(String[] args){
        int arr[]={12,34,5,66,78,99};
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=arr[0]){

                System.out.println(arr[i]);
            }
        }
    }
}
