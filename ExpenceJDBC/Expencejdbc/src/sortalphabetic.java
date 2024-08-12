import java.util.Arrays;
import java.util.Scanner;
public class sortalphabetic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name[]= new String[n];
        for(int i=0; i< n;i++){
            name[i]= sc.nextLine();
        }
        for(int i=0;i< n;i++){
            for(int j=i+1;j< n; j++){
                if(name[i].compareTo(name[j])>0){
                   String temp = name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        for(int i=0; i < n; i++) {
            System.out.println("this is sort name " + name[i]);
        }
    }
}
