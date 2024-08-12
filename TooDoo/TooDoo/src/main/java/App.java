///TooDoApp using MongoDB
//Create new task with Date , name , task status, Time
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClients;
import org.bson.Document;

import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        var client = MongoClients.create("mongodb://localhost:27017/");
//        to create or access the database
        var todoDB = client.getDatabase("todoDB");
//        to create collection
//    //    todoDB.createCollection("todoList");
//        to access the collection
        var todoCollection =todoDB.getCollection("todoList");
//        to create the document and add data into document
        var todoDocument = new Document();
        todoDocument.append("TaskName","work on mongoDB");
        todoDocument.append("TaskDate","13-08-2024");
        todoDocument.append("TaskTime","13hrs");
        todoDocument.append("TaskStatus",false);
//        add document into collection
//        todoCollection.insertOne(todoDocument);

//        to update the document
//        todoCollection.updateMany(new Document("TaskStatus",false ),new Document("$set",new Document("TaskDate","15-08-2024")));


//        to delete
//        todoCollection.deleteOne(new Document("TaskStatus" , true));

//        to fetch the document  from collection
        FindIterable<Document> todoList = todoCollection.find();
        for(Document document: todoList)
        {
            System.out.println("Task Name " +document.getString("TaskName")+"Task Date "+document.getString("TaskDate"));
        }
    }
}
