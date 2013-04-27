package co.ohba.MavenEngine.resources;

import co.ohba.MavenEngine.services.TestService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class TestResource {

    @Inject
    TestService testService;

    @GET
    public String getTest(){
        return "Hello World!";
    };

    @GET
    @Path("/another")
    public String getAnotherTest(){
        return "awesome sauce";
    };

    @GET
    @Path("/service")
    public String getServiceTest(){
       return testService.helloWorld();
    };
}
