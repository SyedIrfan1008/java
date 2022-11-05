package irfan.rest;

public class varArgs {
	public int add(String... x) {
		int sum=0;
		for (String n:x) {
			sum+=Integer.parseInt(n);
			 
	}
		return sum;
	

}
}