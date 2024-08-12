public class constructorname {
    public static void main(String[]args){
        String fname="Satyam";
        String lname = "Sharma";
        MyName myName =new MyName(fname,lname);
        System.out.println(myName.fname +myName.lname);

    }
}
class MyName{
    public MyName(String f, String l){
        this.fname=f;
       this .lname =l;
        System.out.println(f+l);
    }
//    int a,b;
    String fname ,lname;
}
