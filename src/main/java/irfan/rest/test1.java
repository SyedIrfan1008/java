package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

 
@Path("irf")
public class test1 {
	@GET 
    @Produces("text/plain")
	@Path("/subt/{x}/{y}")
    public String add(@PathParam("x")int a,@PathParam("y")int b) {
        return "subt:"+(a-b);
    }
}

