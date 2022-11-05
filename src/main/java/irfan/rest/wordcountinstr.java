package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("wc")
public class wordcountinstr {
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("wc/{str}")
	public String getWC(@PathParam("str")String s) {
		int length=s.length();
		int count =1;
		 for (int i = 0; i < s.length() - 1; i++) {
			   if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' ')) {
		count=count+1;
			   }
}
		return count+"";
}}