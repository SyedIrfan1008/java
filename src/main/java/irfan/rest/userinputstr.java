package irfan.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("st")
public class userinputstr {
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("{str}")
	public String stringOp(@PathParam("str")String s){
		int length=s.length(); //number of chars
        String cap=s.toUpperCase(); //to capital letters
        String low=s.toLowerCase(); //small letters
        int ind=7;
        char c='*';
        if(ind<length)
            c=s.charAt(7);//to find char at given index
        String s1=(c+"").toUpperCase()+s.substring(1);//to get a part of string from given index
        int start=3,end=6;
        String s2="";
        if(start<length&&end<length)
            s2=s.substring(start,end);//to get a part of string from start index to end index
        String last3=s.substring(length-3, length).toUpperCase();
        String inp="ah";
        String inds="";
        for(int i=0;i<inp.length();i++)
            inds+=s.indexOf(inp.charAt(i))+" "; //to get index of given char
        String replace=s.replaceAll(last3.toLowerCase(), "nagar");
        String s3="lords engg collg";
        String ar[]=s3.split(",");
        String split="";
        for (int i=0;i<ar.length;i++)
        	if(i==ar.length-1)
        		split+=ar[i];
        	else
        		split+=ar[i]+",";
        String res=length+"<br>"+cap+"<br>"+low+"<br>"+c+"<br>"+s1+"<br>"+s2+"<br>"+last3+"<br>"+ind;
        return "<font size=3px>"+res+"</font>"+"<br>"+replace+"<br>"+split;
	}
		
		
		
	
@Produces(MediaType.TEXT_HTML)
@GET
@Path("if/{str}")
public String getvowels(@PathParam("str")String s) {
	String in="aeiou";
	String inds="";
	int count=0;
	for(int i=0;i<in.length();i++) {
		inds+=s.indexOf(in.charAt(i))+"";
	}
	for (int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			count++;
		}
	}
	return "index of vowels:"+inds+"<br>"+"number of vowels in the given string is:"+count;

}
	
@Produces(MediaType.TEXT_HTML)	
	@GET
	@Path("replace/{s},{s1},{s2}")
	
	
public String replace(@PathParam("s")String s,@PathParam("s1")String s1,@PathParam("s2")String s2) {
	return "<font size=10px>"+s.replace(s1, s2)+"</font>";	
	
	
	
}
}
	
	

	
	

