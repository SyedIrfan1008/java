package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("last")
public class lastcharofword {
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("last/{char}")
	public String getlastchar(@PathParam("char")String s) {
		String ar[]=s.split(" ");
		String res="";
		for (String b:ar)
			res+=b.charAt(b.length()-1);
		return res;

}
	}
