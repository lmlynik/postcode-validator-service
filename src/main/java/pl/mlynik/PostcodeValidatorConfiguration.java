package pl.mlynik;

import io.dropwizard.Configuration;

public class PostcodeValidatorConfiguration extends Configuration {
    private String host;
    private String db;
    private int port;

    public String getHost() {
        return host;
    }

    public String getDb() {
        return db;
    }

    public int getPort() {
        return port;
    }
}
