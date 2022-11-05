package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/input")
public class userinputsal {
	
	public String annsal() {
		salaries e1=new salaries();
		return 12*e1.sal+"";
	}

	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("empss")
	
	public String getEmpData() {
		salaries e1=new salaries();
		e1.id=1001;
		e1.name="manasa";
		e1.sal=24560;
		return e1.toString();
	}
	
	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("emp/{sal}")
	public String getSal(@PathParam("sal")String sal) {
		salaries e1=new salaries();
		e1.sal=Double.parseDouble(sal);
		return sal+"<br>"+e1.annsal();
	}
	
	

	private void getEmpDetails() {
		// TODO Auto-generated method stub
		
	}
}