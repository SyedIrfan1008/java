package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("product")
public class multip {
	@GET
	@Produces("text/plain")
	@Path("/multiplication/{m}/{n}")
	public String multiplication(@PathParam("m")int u,@PathParam("n")int v) {
	return "multiplication:"+(u*v);
	}



	@GET
	@Produces("text/plain")
	@Path("/divide/{k}/{l}")
	public String divide (@PathParam("k")int i,@PathParam("l")int j) {
		return "divide:"+(i/j);
	}
}