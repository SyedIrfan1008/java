package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("inh")
public class inhansal extends salaries {
	public double annualSal() {
		return sal*12;
	}
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("{s12}")
	
	public String getinhannaulsal(@PathParam("s12")double s12) {
		inhansal i=new inhansal();
		i.sal=s12;
		double d=i.annualSal();
		
		return d+"";
		
	}
	

}
