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
		 s = s ;
		 for (int i = 1; i < s.length(); i++) {
			 if (s.charAt(i) == ' ')
			String s1+=s.charAt(i+1).toUpperCase();
			 
			 return s;
	

}
	}
}