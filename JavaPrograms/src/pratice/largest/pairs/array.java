package pratice.largest.pairs;

public class array {
    public static void pairs(int number[]) {
        for (int i = 0; i < number.length; i++) {
            int currentnumber = number[i];
            for (int j = i+1; j < number.length; j++) {
                System.out.print("(" + currentnumber + "," + number[j] + ")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int number[]= {2,4,6,8,10};
        pairs(number);
    }
}
