package pratice;

public class update {
    public static void update(int marks[]){
        for(int i =0;i<marks.length; i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args){
        int marks[]={1,2,3,4,5,6,7};
        for(int i=0;i<marks.length;i++) {
            System.out.println( marks[i]+" ");
        }
        update(marks);
        for(int i =0;i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();


    }
}
