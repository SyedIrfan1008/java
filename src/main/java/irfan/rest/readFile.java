package irfan.rest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("readfile")
public class readFile {
	@GET
	@Path("scan_file/{fileName}")
	@Produces(MediaType.TEXT_HTML)
	public String readFileScan(@PathParam("fileName")String fileName) {
		List<String> lines=new ArrayList<>();
		String op="";
		try {
			Scanner sc=new Scanner(new File("D:\\workspace\\rest\\file\\"+fileName));
			//return "..";
			while(sc.hasNextLine())
			lines.add(sc.nextLine());
			return lines.toString();
		}
		catch(Exception e) {
			return e.getMessage();
				
		}
	}
}
