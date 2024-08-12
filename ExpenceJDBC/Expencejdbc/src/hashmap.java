import java.util.ArrayList;
import java.util.HashMap;

public class hashmap {
    public static void  main(String[] args){

        ArrayList<HashMap<String , Integer>>arrayList = new ArrayList<>();

        HashMap<String , Integer> myfriends = new HashMap<>();
//        adding the friend name with age
         myfriends.put("Satyam",21);
        myfriends.put("Rahul",20);
        myfriends.put("Aman",19);
        myfriends.put("Abhishek",22);
        myfriends.put("Satyam",22);
        arrayList.add(myfriends);
        System.out.println(arrayList);
//        System.out.println(myfriends);
//        for(String name : myfriends.keySet()){
//            System.out.println(name);
//        }
//        for(int age: myfriends.values()){
//            System.out.println(age);
//        }
////        to access the specific value from hashmap
//        System.out.println(myfriends.get("Aman"));
    }
}
