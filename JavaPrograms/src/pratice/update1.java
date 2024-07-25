package pratice;

public class update1 {
    public static void update(int marks[]){
        for(int i =0; i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args){
        int marks[]={1,3,45,6,8,9};
        update(marks);
        for(int i=0;i<marks.length;i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
