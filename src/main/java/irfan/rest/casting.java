package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("cast")
public class casting {
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("cast/{y}")
	public String cast(@PathParam("y")float b) {
		int a=(int)b;
		return a+"";
	
	}

}
