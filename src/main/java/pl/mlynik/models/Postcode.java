package pl.mlynik.models;


import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

@Entity("postcodes")
public class Postcode {
    @Id
    public String postcode;

    public Coord coord;
}