package uz.qazaprayers.daos;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;
import java.util.ResourceBundle;

public class BaseDao {

    private static final ResourceBundle settings = ResourceBundle.getBundle("application");

    private static final ThreadLocal<MongoClient> mongoClient = ThreadLocal.withInitial(
            () -> new MongoClient("localhost", 27017));

    private static final MongoDatabase database =
            mongoClient.get().getDatabase("qazaprayers");

    public static MongoCollection<Document> getCollection(String collection) {
        return database.getCollection(collection);
    }

}


