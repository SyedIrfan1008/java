package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("flc")
public class firstlttrcap {
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("flc/{cap}")
	public String getcap(@PathParam("cap")String s) {
		String words[]=s.split("\\s"); 
		String s1="";
		for(String w:words){
			  String first=w.substring(0,1);  
		        String afterfirst=w.substring(1);  
		        s1+=first.toUpperCase()+afterfirst+" ";  
		    }  
		return s1;
		}

}
