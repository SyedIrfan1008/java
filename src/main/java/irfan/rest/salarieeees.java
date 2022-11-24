package irfan.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class salarieeees implements Comparable <salarieeees> {
	public   int id;
    public   String name;
    public     int salary;
    public salarieeees(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary=salary;
        
    }
    public salarieeees() {
        super();
}


		// TODO Auto-generated constructor stub
	
@Override
public String toString() {
    return "Item [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
@Override
public int compareTo(salarieeees i) { 
    return this.name.length()-i.name.length();
}
}