package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("ol")
public class overload {
	
	public int add(int x, int y) {
		return x+y;
	
		
	}
	 public float add(int x, float y) {
		 return x+y;
	 }
	public float add(float x, float y) {
		return x+y;
	}
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("sum_int/{x},{y}")
	
	public String get(@PathParam("x")int x,@PathParam("y")int y) {
		overload ol=new overload();
		return ol.add(x,y)+"";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("sum_int_float/{x}/{y}")
	
	public String getol(@PathParam("x")int x,@PathParam("y")float y) {
		overload ol=new overload();
		return ol.add(x,y)+"";
	}


@GET
@Produces(MediaType.TEXT_HTML)
@Path("float/{x}/{y}")
public String getovl(@PathParam("x")float x,@PathParam("y")float y) {
	overload ol=new overload();
	return ol.add(x,y)+"";
	
}

}






