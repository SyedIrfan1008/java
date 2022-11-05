package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("test")
public class assignEMP {
@Produces(MediaType.TEXT_HTML)
@GET
@Path("assignsal")
	public String getEmpArray() {
		salaries arr[]=new salaries[3];
		int ids[]= {101,102,103};
		String names[]= {"irfan","syed","sd"};
		double salary[]= {10000,11000,12000};
		double annsAL[]= {120000,132000,144000};
		String s="<table border=5><tr><th>Id</th><th>Name</th><th>salary</th><th>annsAL</th></tr>";
		for (int i=0;i<arr.length;i++) {
			arr[i]=new salaries();
			arr[i].id=ids[i];
			arr[i].name=names[i];
			arr[i].sal=salary[i];
			arr[i].annsAL=annsAL[i];
			
			s+="<tr><td>"+arr[i].id+"</td><td>"+arr[i].name+"</td><td>"+arr[i].sal+"</td><td>"+arr[i].annsAL+"</td></tr>";
		}
			 s+="</table>";
		
			return s;
	
	}
}
	

