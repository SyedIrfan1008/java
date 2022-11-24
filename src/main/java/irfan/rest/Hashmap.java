package irfan.rest;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("HashMap")

public class Hashmap {
	@GET
	@Path("map")
	@Produces(MediaType.TEXT_HTML)
	public String getmap() {
		Map<Integer,String> map=new HashMap<>();
		String names[]= {"arathi","naser","irfan","vinayak","akash","aamani"};
	for (int i=101;i<=100+names.length;i++)
	map.put(i, names[i-101]);
	String s="";
	for(Map.Entry<Integer, String> entry:map.entrySet())
		if(entry.getKey()==104)
	s+=entry.getKey()+","+entry.getValue()+"<br>";
	return s;
	}

}
