package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path ("ad")
public class addoftwo {
	@GET
	@Produces("text/plain")
	@Path("add/{a}/{b}")
	public String add(@PathParam("a")int x,@PathParam("b")int y) {
		return "add:"+(x+y);
				
	}
}
