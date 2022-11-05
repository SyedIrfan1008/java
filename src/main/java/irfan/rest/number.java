package irfan.rest;
// method to sqaure root//


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("square")
public class number {
int n;
public number(){
	n=0;
}
public number(int x){
	n=x;
}	
	
public int square() {	
	return n*n;
			
	
}

@Produces(MediaType.TEXT_HTML)
@GET
@Path("square/{n}")
public String getsquare(@PathParam("n")int n) {
	number number=new number(n);
	return number.square()+"";
}


@Produces(MediaType.TEXT_HTML)
@GET
@Path("sin/{num}")
public String getsin(@PathParam("n")int n) {
	trig.number number=new trig.number();
	return number.sin()+"";
}
	
}








