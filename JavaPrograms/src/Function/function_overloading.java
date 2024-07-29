package Function;
// function overloading is same name but different parameter
public class function_overloading {
    public static int sum(int a , int b){
        int sum = a + b;
        return sum;
    }
    public static float sum(float a , float  b, float c){
        float sum = a+b+c;
        return sum;
    }
    public static void main(String[]args){
        System.out.println("this is  add two number "+sum(5,2));
        System.out.println("this is  add three number "+sum(5.5f,2.5f, 10.6f));

    }
}
