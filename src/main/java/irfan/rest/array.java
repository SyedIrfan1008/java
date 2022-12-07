package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("is")
public class array {
@Produces(MediaType.TEXT_HTML)	
@GET
@Path("array")
	public String getArray() {
		//int a[]=new int[5];
	String a[]= {"a","b","c"};
		String S=" ";
		for (int i=0;i<a.length;i++)
			S+=a[i]+"<br>";
		return S;
				
	}


@Produces(MediaType.TEXT_HTML)
@GET
@Path("stud.array")

public String getStudArray() {
	student arr[]=new student[4];
	int ids[]= {101,102,103,104};
	String names[]= {"ab","cd","ef","gh"};
	String courses[]= {"cvl","mech","ece","cse"};
	int ages[]= {21,22,23,24};
	String s="<table border=5><tr><th>Id</th><th>Name</th><th>Course</th><th>Age</th><th>College</th></tr>";
	for (int i=0;i<arr.length;i++) {
		arr[i]=new student();
		arr[i].id=ids[i];
		arr[i].name=names[i];
		arr[i].course=courses[i];
		arr[i].age=ages[i];
		arr[i].college="IAAS";
		s+="<tr><td>"+arr[i].id+"</td><td>"+arr[i].name+"</td><td>"+arr[i].course+"</td><td>"+arr[i].age+"</td><td>"+arr[i].college+"</tr>";
	}
		 s+="</table>";
	
		return s;
	}

	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("arrayeg1")
public String readvalues() {
	arrayeg1 a=new arrayeg1();
	String s1;
	s1=a.readvalue();
	return s1; 
	}
	

@Produces(MediaType.TEXT_HTML)
@GET
@Path("arrayeg2")
public String loadval() {
	arrayeg2 a=new arrayeg2();
	String s2;
	s2=a.loadval();
	return s2;
	
		
	}
}

