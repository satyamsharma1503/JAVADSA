package pratice.linear;

public class linearsearch {
public static int linearsearch(int numbers[],int key){
    for(int i = 0; i<numbers.length; i++){
        if(numbers[i]==key){
            return i;
        }
    }
    return -1;
}
    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 5, 6, 4, 7, 8, 9, 10};
        int key = 5;
        int index = linearsearch(numbers, key);
        if (index == -1) {
            System.out.println("This is invailid number");
        } else {
            System.out.println("This is vailid number" + index);
        }

    }
}
