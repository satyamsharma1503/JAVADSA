import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class mongo {
//    public static void main(String[]args){
//        try {
//    1. Establish the mango database connection with java
//    2. create the collection
//    3.get the collection
//    4.insert the document in collection
//    5.update the document in the collection
//    6.delete the document in the collection
//    7.get the document from in collection
//    8.get the specific document from collection
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

    public static void main(String[] args) {
//        to establish mongodb collection
        MongoClient client = MongoClients.create("mongodb://localhost:27017/");
        MongoDatabase database = client.getDatabase("AdvanceJava1");


        for(String databaseName:database.listCollectionNames()){
            System.out.println(databaseName);
//            create new database name

        }

        database.createCollection("faculty");
        System.out.println("New collection is created");

//        to
        database.createCollection("friend");
        System.out.println("collection is created");

    }

}