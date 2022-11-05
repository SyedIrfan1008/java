package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("index")
public class stringindex {
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("index/{string}")
	public String getindexOf(@PathParam("string")String name) {
		String in="abcdefghijklmnopqrstuvwxyz";
		String inds="";
		int count=0;
		for(int i=0;i<in.length();i++) {
			inds+=name.indexOf(in.charAt(i))+"";
		}
		
		return inds;
	}

}
