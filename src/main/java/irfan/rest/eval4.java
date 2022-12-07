package irfan.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class eval4 {
	  int v,sum;
	    String s="";
	    public int get() {
	        for(int i=100;i<=999;i++) {
	            v+=i%10;
	            i=i/10;
	            sum+=v;
	        }
	        
	        return sum;
	    }


public String getmapp() {
    Map<Integer, Integer> m=new HashMap<Integer, Integer>();
    
    for(int i=100;i<=999;i++) {
        m.put(i,get());
    }
    for(Entry<Integer, Integer> entry:m.entrySet())
    {
        
   s+=entry.getKey()+","+entry.getValue()+"<br>";
}
    return s;
}}