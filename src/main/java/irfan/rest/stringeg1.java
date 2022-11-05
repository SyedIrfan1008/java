package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//string of length,cap,low letter//

@Path("stringeg1")
public class stringeg1 {
@Produces(MediaType.TEXT_HTML)
@GET
@Path("{as}")
public String stringOp(@PathParam("as")String s) {
	int length=s.length();      //for length of given user input//
	
	
	String cap=s.toLowerCase();   //for doing small letters in given user input//
	
	
	String low=s.toUpperCase();     //for doing capital in given user input//
	
	return length+""+low;
	
	
}

}




