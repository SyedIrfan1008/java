package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/irfan")
public class test {

	    @GET 
	    @Produces("text/plain")
	    public String getIt() {
	        return "Hi all!,This is irfan";
	    }
	}


