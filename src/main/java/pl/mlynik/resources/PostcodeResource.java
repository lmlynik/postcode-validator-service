package pl.mlynik.resources;

import io.dropwizard.jersey.caching.CacheControl;

import pl.mlynik.models.Postcode;
import pl.mlynik.repository.PostcodeRepository;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.concurrent.TimeUnit;
import java.util.List;


@Path("/postcode")
@Produces(MediaType.APPLICATION_JSON)
public class PostcodeResource {

    private final PostcodeRepository repository;

    public PostcodeResource(PostcodeRepository repository) {
        this.repository = repository;
    }

    @GET
    @Path("/{postcode}/validate")
    @CacheControl(maxAge = 6, maxAgeUnit = TimeUnit.HOURS)
    public Response validate(@PathParam("postcode") String postcode) {
        postcode = postcode.replace(" ", "").toUpperCase();
        if (repository.get(postcode, false).isEmpty()) {
            return Response.status(404).build();
        } else {
            return Response.ok().build();
        }
    }

    @GET
    @Path("/{postcode}")
    @CacheControl(maxAge = 6, maxAgeUnit = TimeUnit.HOURS)
    public List<Postcode> get(@PathParam("postcode") String postcode, @QueryParam("partial") boolean partial) {
        postcode = postcode.replace(" ", "").toUpperCase();
        return repository.get(postcode, partial);
    }
}
