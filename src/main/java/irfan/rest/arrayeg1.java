package irfan.rest;

//method to load and read values from an array//

public class arrayeg1 {
public String s="";
	public String readvalue() {
		String a[]=new String[10];
		a[1]="my name is irfan";
		a[5]="i m software engg";
		a[9]="i m working in IAAS";
		 
		for (int i=0;i<a.length;i++)
		s+=a[i]+"<br>";
		return s;
	}


}
	

