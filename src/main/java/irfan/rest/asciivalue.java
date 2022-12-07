package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("ascii")
public class asciivalue {
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("ascii/{c}")
	public String getascii(@PathParam("c")String c) {
		char[] ar=c.toCharArray();
		String s=" ";
		for (int i=0;i<ar.length;i++) {
		int n=(int)ar[i];
		s+=n+"<br>";
		
	}
return s;
}
}