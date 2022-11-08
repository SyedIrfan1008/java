package irfan.rest;



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.persistence.internal.dynamic.ValuesAccessor;

@Path("trainee")
public class trainee {
	
	@GET
	@Produces("text/plain")
	@Path("all")
	public String wish() {
		return "Hello trainees, Welcome to REST";
	}
	
	@GET
	@Produces("text/plain")
	@Path("{user_name}")
	public String wish(@PathParam("user_name")String name) {
		return "Hello "+name+", Welcome to REST";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("add/{n1},{n2}")
	public String add(@PathParam("n1")String x,@PathParam("n2")String y) {
		try {
			float sum=Float.parseFloat(x)+Float.parseFloat(y);
			return "<h1>sum:"+sum+"<h1>";
		}
		catch(NumberFormatException e) {
			return "<h1>one or more values are not numeric<br>sum:unknown</h1>";
		}
		
	}
	
	@GET
	@Path("add/{values}")
	public String add(@PathParam("values")String values) {
		String[] vals=values.split(",");
		float sum=0.0f;
		try {
			for(int i=0;i<vals.length;i++)
				sum+=Float.parseFloat(vals[i]);
			return sum+"";
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	
	

@Produces(MediaType.TEXT_HTML)
@GET
@Path("zye/{op}/{v}")
public String varArgs(@PathParam("op")String op,@PathParam("v")String v) {
	String[] vals=op.split(",");
String[] v1=v.split(",");
varArgs va=new varArgs();
return va.add("add",vals)+"<br>"+va.avg("avg", v1);
}
@Produces(MediaType.TEXT_HTML)
@GET
@Path("instance")
public String instanceOf() {
	instance<Object> i=new instance<Object>();
	i.x=0.9f;
	return i.getType();
	
}
}
