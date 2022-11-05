package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("path")
public class inhansal2 extends salaries {
	public double annsalary() {
		return sal*12;
	}
@Produces(MediaType.TEXT_HTML)
@GET
@Path("{123}")
public String ansal12(@PathParam("123")double s) {
	inhansal2 i=new inhansal2();
	i.sal=s;
	double d=i.annsalary();
	return d+"";
	
	
}
}
