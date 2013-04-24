package co.ohba.MavenEngine.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestResource {

    @GET
    public String getTest(){
        return "Hello World!";
    };

    @GET
    @Path("/another")
    public String getAnotherTest(){
        return "awesome sauce";
    };
}
