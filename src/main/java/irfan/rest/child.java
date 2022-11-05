package irfan.rest;

public class child extends parent {
	int x=50;
	public String getval() {
		String ps=super.getval();
		return"Child Value"+x+"<br>"+ps;
	}

}
