package oopsinjava;

public class inheritance {
    public static void main(String[] args) {
//        Parent parents = new Parent();
//        parents.printParent();
//        //using inheritance call grandParent method
//        parents.printGrandParent();
        MyInheritance myInheritance = new MyInheritance();
        myInheritance.printCals();
    }
}
//class Parent extends GrandParent{
//    void  printParent(){
//        System.out.println("in parent");
//    }
//}
//class GrandParent{
//    void printGrandParent(){
//        System.out.println("this is grand Parent");
//    }
//}

class MyInheritance extends Calculator{
    void printCals(){
       System.out.println( printadd(3,5));
       System.out.println( printmultiply(4,2));
        System.out.println(printsubtraction(4,2));
    }

}
class Calculator{
    int printadd(int a, int b){
//        int add = a+b;
        return a+b;
    }
    int printsubtraction(int a, int b){
//        int sub = a-b;
        return a-b;
    }
    int printmultiply(int a, int b){
//        int multiply = a*b;
        return a*b;
    }
        }