import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class railway {
    public static void main(String[]args){
        MongoClient client = MongoClients.create("mongodb://localhost:27017/");
        MongoDatabase database = client.getDatabase("RailwayDB");
// var database = client.getDatabase("RailwayDB");

//        database.createCollection("Username");
//        System.out.println("Collection is created");
//        database.createCollection("Train");
//        System.out.println("Collection is created");
//        database.createCollection("Route");
//        System.out.println("Collection is created");
//        System.out.println("Collection is created");
//        database.createCollection("Station");
//        database.createCollection("Staff");
//        System.out.println("Collection is created");

//   to delete the collection
//        var usernameCollection = database.getCollection("Username");
//        System.out.println("Collection is created");
//        usernameCollection.drop();



//to access the list of collection from database
//
//        for(String collectionName: database.listCollectionNames()){
//            System.out.println(collectionName);
//        }

//        to insert the document into collection
//        to insert the user data into user collection
        var userCollection= database.getCollection("Username");
//        to create new document for users collection
        Document userDocument = new Document();
        userDocument.append("name", "Satyam");
        userCollection.insertOne(userDocument);
        System.out.println("user data added");
    }
}
