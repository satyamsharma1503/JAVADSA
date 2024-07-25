package pratice;

public class creating_array {
//    public static void main(String[] args){
//        int marks[]= {1,3,2,5,7};
//        for(int i =0; i<marks.length; i++) {
//            System.out.print(marks[i]+" ");
//        }
//        System.out.println();
//    }
public static int linearsearch(int numbers[],int keys){
    for(int i = 0; i<numbers.length; i++) {
        if (numbers[i] == keys){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args){
        int numbers[]= {2,4,6,8,10,12,14,16,18,20};
        int keys=10;
        int index = linearsearch(numbers,keys);
        if(index == -1){
            System.out.println("this is invalid numbers");
        }
        else{
            System.out.println("this number is exit " +index);
        }
    }
}
