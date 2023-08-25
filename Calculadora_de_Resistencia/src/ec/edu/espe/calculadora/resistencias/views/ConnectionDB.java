package ec.edu.espe.calculadora.resistencias.views;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import org.bson.Document;


public class ConnectionDB {
   
   private static final String COLLECTION = "registros";
   private static final String DATABASE = "usuarios";
   private static final String URI = "mongodb://localhost:27017/";
   
   public static MongoClient getMongoClient() {
      return MongoClients.create(URI);
   }
   public static MongoCollection<Document> getCollection() {
      MongoClient mongoClient = getMongoClient();
      return mongoClient.getDatabase(DATABASE).getCollection(COLLECTION);
   }
   
   public static void guardarURL(){
      MongoClient mongoClient = ConnectionDB.getMongoClient();
      MongoCollection<Document> collection = mongoClient.getDatabase("usuarios").getCollection("url");
      Document document = new Document();
      document.append("url64", "/ec/edu/espe/calculadora/resistencias/images/resistor-icono-64-1.png");
      document.append("url32", "/ec/edu/espe/calculadora/resistencias/images/resistor-icono-32-1.png");
      document.append("url-estrella-delta", "/ec/edu/espe/calculadora/resistencias/images" + "/estrella-delta1.png");
      document.append("url-delta-estrella", "/ec/edu/espe/calculadora/resistencias/images" + "/delta-estrella1.png");
      collection.insertOne(document);
   }
}


    