package irfan.rest;

public class varArgs {
	public String add(String op,String... x) {
		int sum=0;
		for (String n:x) {
			sum+=Integer.parseInt(n);
			 
	}
		return op+":"+ sum+"";
	

}

public String avg(String op,String...x) {
	int sum=0;
	for (String n:x) {
		sum+=Integer.parseInt(n);
	}
	return op+":"+sum/x.length+"";
}
}