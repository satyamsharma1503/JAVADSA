public class Exceptionhandling {
    public static void main(String[] args){

//   System.out.println(100/0);
//        read the

        try{
            System.out.print(100/0);
        } catch (Exception e) {
            System.out.print("this / by zero");
//            throw new RuntimeException(e);
        }

        String name = null;

        try{
            System.out.print(name.length());
        } catch (Exception e) {
            System.out.print(e);
//            new Exception(e);
        }


//        number formate exception error

        String fullname ="SatyamSharma";
        try {
            int a = Integer.parseInt(fullname);
            System.out.print(a);
        } catch (NumberFormatException e) {
            System.out.print(e);
        }

// array exception error

        int array[] = {1,2,3,4,5};
        try {
            System.out.print(array[4]);
        } catch (Exception e) {
            System.out.print(e);
        }


//
        finally {
            System.out.print("this is finally code");
        }
    }
}
