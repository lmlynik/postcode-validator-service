package pl.mlynik.repository;

import com.mongodb.MongoClient;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;
import pl.mlynik.models.Postcode;

import java.util.List;
import java.net.UnknownHostException;

public class PostcodeRepository {

    private final Datastore datastore;

    public PostcodeRepository(String host, int port, String db) throws UnknownHostException {
        Morphia morphia = new Morphia();
        morphia.map(Postcode.class);
        MongoClient mongoClient = new MongoClient(host, port);
        datastore = morphia.createDatastore(mongoClient, db);
    }


    public List<Postcode> get(String postcode, boolean partial) {
        Query<Postcode> query = datastore.createQuery(Postcode.class);
        if (partial) {
            query = query.field("postcodeCleaned").startsWith(postcode);
        } else {
            query = query.field("postcodeCleaned").equal(postcode);
        }
        System.out.println(query.toString());

        return query.asList();
    }
}
