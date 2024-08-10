import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Random;

public class HotelBookingSystemmongodb {
//create hotel booking java application with mongoDB
//    1.Create the client for establish the connection
//    3.Create database and collection(hotel bookingDB bookingCollection)
//    3.create booking document (no. of room, no. of adults, checkingdate , hotel name, checkoutDate, roomPreference, meal ) and insert document
//    4.update booking document
//    5.Access all booking document
//    6.Delete the booking document
    public static void main(String[] args){
        var client = MongoClients.create("mongodb://localhost:27017/");
//        to create or get the database with name  hotelbookingDB
        var database = client.getDatabase("hotelBookingDB");


//        create the bookingCollection collection in hotelBooking database
        database.createCollection("bookingCollection");
        var bookingCollection = database.getCollection("bookingCollection");
////        to insert many(multiple) document
//        ArrayList<Document> bookingList = new ArrayList<>();
////        create document and add hotel booking system
        var  bookingDocument = new Document();
//        add booking  info
        Random random = new Random();
//        int  no = random.nextInt( 999999);
        bookingDocument.append("bookingID",random.nextInt( 999999));
        bookingDocument.append("hotelName","Rennisance");
        bookingDocument.append("userName","ShivamSharma");
        bookingDocument.append("userEmail","ss9655378@gmail.com");
        bookingDocument.append("userMobileNo","1234567890");
        bookingDocument.append("checkInDate","09-08-2024");
        bookingDocument.append("checkOutDate","12-08-2024");
        bookingDocument.append("noOfDays",1);
        bookingDocument.append("price","2500");
        bookingDocument.append("roomPreference","River Face");
        bookingDocument.append("noOfAdults",2);
        bookingDocument.append("meal",true);
//        bookingList.add(bookingDocument);
        bookingCollection.insertOne(bookingDocument);


//
//
//        var bookingDocument1 = new Document();
//        bookingDocument1.append("bookingID",random.nextInt( 999999));
//        bookingDocument1.append("hotelName","OYO");
//        bookingDocument1.append("userName","Aman");
//        bookingDocument1.append("userEmail","ss978@gmail.com");
//        bookingDocument1.append("userMobileNo","9876543865");
//        bookingDocument1.append("checkInDate","10-08-2024");
//        bookingDocument1.append("checkOutDate","13-08-2024");
//        bookingDocument1.append("noOfDays",2);
//        bookingDocument1.append("price","2500");
//        bookingDocument1.append("roomPreference","RiverFace");
//        bookingDocument1.append("noOfAdults",1);
//        bookingDocument1.append("meal",true);
//        bookingList.add(bookingDocument1);
//
//
//        var bookingDocument2 = new Document();
//        bookingDocument2.append("bookingID",random.nextInt( 999999));
//        bookingDocument2.append("hotelName","Madhuban");
//        bookingDocument2.append("userName","Aman");
//        bookingDocument2.append("userEmail","ss978@gmail.com");
//        bookingDocument2.append("userMobileNo","9876543865");
//        bookingDocument2.append("checkInDate","10-08-2024");
//        bookingDocument2.append("checkOutDate","13-08-2024");
//        bookingDocument2.append("noOfDays",2);
//        bookingDocument2.append("price","2500");
//        bookingDocument2.append("roomPreference","RiverFace");
//        bookingDocument2.append("noOfAdults",1);
//        bookingDocument.append("meal",true);
//        bookingList.add(bookingDocument2);
//        var bookingCollection = database.getCollection("bookingCollection");
////        bookingCollection.insertMany(bookingList);



//        to update the single document
//        Document document=new Document();
//        document.append("noOfAdults",1);
//        document.append("roomPreference","Delux");
//        document.append("meal",true);
//        document.append("price","25000");
////        bookingCollection.updateMany(new Document("userName","SatyamSharma"),new Document("$set",document));
////        bookingCollection.updateMany(new Document("userName","SatyamSharma"),new Document("$set",new Document("noOfAdults",1)));
//
//        delete one
//        bookingCollection.deleteOne(new Document("bookingID",350418));

////        delete many
//        bookingCollection.deleteMany(new Document("userName","SatyamSharma"));

    }
}
