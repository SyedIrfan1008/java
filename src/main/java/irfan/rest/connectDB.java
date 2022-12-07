package irfan.rest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class connectDB {
	
	public static Connection c;
	
	public static Connection connectDB1() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver is ok");
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/restdb?enabledTLSProtocols=TLSv1.2", "root", "root");
			System.out.println("connected");
			return c;
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}
	
	public void insert(int id,String name,int sal,int dep_id,int manager_id){
		int bonus=sal*15/100;
		String sql="insert into sqlemps values(?,?,?,?,?,?)";
		PreparedStatement ps;
		try {
			System.out.println(" trying to insert......");
			ps = c.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, sal);
			ps.setInt(4, bonus);
			ps.setInt(5, dep_id);
			ps.setInt(6, manager_id);
			ps.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<sqlEmps> readAllEmps(){
		PreparedStatement ps;
		try {
			ps = c.prepareStatement("select * from sqlemps");
			ResultSet rs=ps.executeQuery();
			List<sqlEmps> emps=new ArrayList<>();
			while(rs.next()) {
				emps.add(new sqlEmps(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6)));
			}
			return emps;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
		
		public String readAllEmpsAsString(){
			PreparedStatement ps;
			try {
				ps = c.prepareStatement("select * from sqlemps");
				ResultSet rs=ps.executeQuery();
				List<sqlEmps> emps=new ArrayList<>();
				while(rs.next()) {
					emps.add(new sqlEmps(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getInt(6)));
				}
				return emps.toString();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		
	
	
	public static void main(String args[]) {
		/*Object ar[]= {10,4.5,'a',"priya"};
		for(Object obj:ar)
			System.out.println(obj);*/
		
	}
	

}



