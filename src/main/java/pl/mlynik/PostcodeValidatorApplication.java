package pl.mlynik;


import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.eclipse.jetty.servlets.CrossOriginFilter;
import pl.mlynik.repository.PostcodeRepository;
import pl.mlynik.resources.PostcodeResource;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

public class PostcodeValidatorApplication extends Application<PostcodeValidatorConfiguration> {
    public static void main(String[] args) throws Exception {
        new PostcodeValidatorApplication().run(args);
    }

    @Override
    public String getName() {
        return "postcode-validator";
    }

    @Override
    public void initialize(Bootstrap<PostcodeValidatorConfiguration> bootstrap) {

    }

    @Override
    public void run(PostcodeValidatorConfiguration configuration, Environment environment) throws Exception {
        PostcodeRepository repository = new PostcodeRepository(
                configuration.getHost(),
                configuration.getPort(),
                configuration.getDb());
        environment.jersey().register(new PostcodeResource(repository));

        //for cross-site resource calls
        environment.servlets().addFilter("cors-filter", CrossOriginFilter.class)
                .addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
    }


}