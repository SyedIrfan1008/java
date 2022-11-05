package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("student")
public class student {
	public int id;
	public String name;
	public String course;
	public int age;
	public static String college;
	
	public String toString() {
		return id+","+name+","+course+","+age+","+college;
		
	}


@Produces(MediaType.TEXT_HTML)
@GET
@Path("studs")
	public String getstuds() {
		student s1=new student();
		student s2=new student();
		student s3=new student();
		
		s1.id=101;
		s1.name="irfan";
		s1.course="civilengg";
		s1.age=23;
		
		s2.id=102;
		s2.name="syed";
		s2.course="mbait";
		s2.age=23;
		
		s3.id=103;
		s3.name="sd";
		s3.course="hrit";
		s3.age=23;
		
		student.college="engineering college";
		
		return s1+"<br>"+s2+"<br>"+s3;
				
		
		
}		
	
}	
	