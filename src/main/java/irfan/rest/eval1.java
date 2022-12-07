package irfan.rest;



public class eval1 {
	String s;
	int z;
	String add=" ";
	String sz=" ";
	public String ascii() {
	   
		char ch[]=s.toCharArray();
	    for(int i=0;i<ch.length;i++) {
	    	
	        z=(int)(ch[i]);
	        for(int j=0;j<=z;j++) {
	        	
	        sz+=z%10;
	            z=z/10;
	            
	        }
	       sz+=z+"<br>";
	    }
	    return " "+ sz;
	}
	
}
	
