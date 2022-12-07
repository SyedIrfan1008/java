package irfan.rest;

public class sqlEmps {
	public int id;
	public String name;
	public int sal;
	public int bonus;
	public int dep_id;
	public int manager_id;
	public sqlEmps(int id, String name, int sal, int bonus, int dep_id, int manager_id) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.bonus = bonus;
		this.dep_id = dep_id;
		this.manager_id = manager_id;
	}
	public sqlEmps() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emps [id=" + id + ", name=" + name + ", sal=" + sal + ", bonus=" + bonus + ", depId=" + dep_id
				+ ", manId=" + manager_id + "]<br>";
	}

}
