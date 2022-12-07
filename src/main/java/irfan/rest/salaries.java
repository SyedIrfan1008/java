package irfan.rest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("emp")
public class salaries {

	public int id;
	public String name;
	public double sal;
	public double annsAL;
	public int no;
		
		public String toString() {
		return id+"<br>"+name+"<br>"+sal+"<br>"+annsAL;	
	}
	
@Produces(MediaType.TEXT_HTML)
@GET
@Path("emplys")
	public String annsal() {
		salaries e1=new salaries();
		salaries e2=new salaries();
		salaries e3=new salaries();
		
		e1.id=101;
		e1.name="irfan";
		e1.sal=10000;
	    e1.annsAL=e1.sal*12;
	    
	    e2.id=102;
		e2.name="syed";
		e2.sal=12000;
		e2.annsAL=e2.sal*12;
		
		e3.id=103;
		e3.name="sd";
		e3.sal=11000;
		e3.annsAL=e3.sal*12;
		
		return e1+"<br>"+e2+"<br>"+e3;
}}