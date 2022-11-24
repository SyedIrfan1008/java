package irfan.rest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("mark")
public class taskMarks {
	@GET
	@Path("markss_map")
	@Produces(MediaType.TEXT_HTML)
	public String getMarks() {
		int n=3;
	    Map<Integer,List<Integer>> map=new HashMap<>();
	    
	    /*List<Integer> list1=Arrays.asList(67,67,67);
	      List<Integer> list2=Arrays.asList(78,78,78);
	      List<Integer> list3=Arrays.asList(89,89,89);
	    */
	    List<Integer> per1=Arrays.asList((64+68+67)/n);
	    List<Integer> per2=Arrays.asList((78+79+70)/n);
	    List<Integer> per3=Arrays.asList((55+90+89)/n);
	    
	    map.put(101, per1);
	    map.put(102, per2);
	    map.put(103, per3);
	    
	    String s="";
	    for(Map.Entry<Integer, List<Integer>> entry:map.entrySet())
	        s+=entry.getKey()+":"+entry.getValue()+"<br>";
	    return s;
	    }
}
