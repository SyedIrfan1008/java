package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("split")
public class stringsplit {
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("split/{string}|{by}")
	public String getsplit(@PathParam("string")String name,@PathParam("by")String by) {
		String ar[]=name.split(by);
		String split="";
		for(int i=0;i<ar.length;i++) {
			
			if(i==ar.length-1);
			split+=ar[i];
			
		
		}
		return split;
	}
}
