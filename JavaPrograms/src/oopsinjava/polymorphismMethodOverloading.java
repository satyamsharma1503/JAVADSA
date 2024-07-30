package oopsinjava;

public class polymorphismMethodOverloading {
    public static int add(int a , int b){
//        int sum  = a + b;
        return a + b;
    }
    public static double add(double a, double b){
//        double sum = a+b;
        return a+b;
    }
    public static void main(String[] args){
//        add(5,6);
//        Scanner sc= new Scanner(System.in);
        System.out.println(add(5,6));
        System.out.println(add(2.5,3.5));
    }
}
