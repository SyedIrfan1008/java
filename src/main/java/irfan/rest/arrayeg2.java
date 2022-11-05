package irfan.rest;

public class arrayeg2 {

public String s="";
public String loadval() {
	String a[]=new String[13];
	a[4]="hw r u";
	for (int i=0;i<a.length-1;i++) {
	
	s+=a[i]+"<br>";
	
}
	return s;
}
}