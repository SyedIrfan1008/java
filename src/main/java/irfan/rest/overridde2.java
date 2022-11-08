package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("vee")
public class overridde2 {
@Produces(MediaType.TEXT_HTML)
@GET
@Path("ssaall")
public String getsavings(@PathParam("ssaall")double sal) {
	child2 ch=new child2();
	return ch.getsavings(sal)+"";
}

}