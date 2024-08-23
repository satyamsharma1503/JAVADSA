package array;

public class updatemarks {

    public static void update(int marks[],int nochange){
        nochange =34;
        for(int i=0; i< marks.length; i++){

            marks[i]= marks[i] +1;
        }
    }
    public static void main(String[] args){
        int marks[] = {21,22,3,4,5};
        int nochange=56;
        System.out.print("before array:-");
        for(int i =0; i< marks.length; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println( );
        update(marks,nochange);
        System.out.print("after array:-");
        for(int i=0; i< marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println( );
    }
}
