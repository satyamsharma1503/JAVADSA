package conditional;

public class findhighest {
    public static void main(String[] args){
        int arr[]={1,6,7,10,11};
        int max=arr[0];
        for(int i=0; i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
