package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("xnxx")
public class override {
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("valvv")
	public String getval() {
		child c=new child();
		return c.getval()+"";
		
	}

}
