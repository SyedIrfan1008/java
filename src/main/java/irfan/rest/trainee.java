package irfan.rest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.eclipse.persistence.internal.dynamic.ValuesAccessor;

@Path("trainee")
public class trainee {

	@GET
	@Produces("text/plain")
	@Path("all")
	public String wish() {
		return "Hello trainees, Welcome to REST";
	}

	@GET
	@Produces("text/plain")
	@Path("{user_name}")
	public String wish(@PathParam("user_name") String name) {
		return "Hello " + name + ", Welcome to REST";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("add/{n1},{n2}")
	public String add(@PathParam("n1") String x, @PathParam("n2") String y) {
		try {
			float sum = Float.parseFloat(x) + Float.parseFloat(y);
			return "<h1>sum:" + sum + "<h1>";
		} catch (NumberFormatException e) {
			return "<h1>one or more values are not numeric<br>sum:unknown</h1>";
		}

	}

	@GET
	@Path("add/{values}")
	public String add(@PathParam("values") String values) {
		String[] vals = values.split(",");
		float sum = 0.0f;
		try {
			for (int i = 0; i < vals.length; i++)
				sum += Float.parseFloat(vals[i]);
			return sum + "";
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("zye/{op}/{v}")
	public String varArgs(@PathParam("op") String op, @PathParam("v") String v) {
		String[] vals = op.split(",");
		String[] v1 = v.split(",");
		varArgs va = new varArgs();
		return va.add("add", vals) + "<br>" + va.avg("avg", v1);
	}

	@Produces(MediaType.TEXT_HTML)
	@GET
	@Path("instance")
	public String instanceOf() {
		instance<Object> i = new instance<Object>();
		i.x = 0.9f;
		return i.getType();

	}

	@GET
	@Path("Abst/{i}")
	@Produces(MediaType.TEXT_HTML)
	public String getShape(@PathParam("i") float i) {
		circleAbst c1 = new circleAbst();
		String c2 = c1.area(i) + "";
		squareAbst s1 = new squareAbst();
		String s2 = s1.area(i) + "";

		return "Circle:  " + c2 + " " + c1.drawnBy("irfan") + "<br>" + "Square: " + s2 + " " + s1.drawnBy("irfan");

	}

	@GET
	@Path("vehicle")
	@Produces(MediaType.TEXT_HTML)
	public String getVehicleData() {
		petrolCar car = new petrolCar();
		// car.maxSpeed=180;
		return car.wheelCount() + "<br>" + car.fuelType() + "<br>" + car.color() + "<br>" + car.maxSpeed + "<br>"
				+ car.seatCount();
	}

	@GET
	@Path("signal")
	@Produces(MediaType.TEXT_HTML)
	public String getSignalObj() {
		Signal signal = Signal.RED;
		return signal.toString();
	}

	@GET
	@Path("allsignal")
	@Produces(MediaType.TEXT_HTML)
	public String getAllSignals() {
		String allSig = "";
		for (Signal sig : Signal.values())
			allSig += sig.toString() + "<br>";
		return allSig;
	}

	@GET
	@Path("vote/{age}")
	@Produces(MediaType.TEXT_HTML)
	public String vote(@PathParam("age") int age) {
		String votingPage = "";
		try {
			Vote vote = new Vote();
			if (vote.canVote(age))
				votingPage = "<form><input type='radio' name='party'>BJP<br><input type='radio' name='party'>TRS<br><input type='radio' name='party'>Congress<br><input type='radio' name='party'>MIM";
			else
				throw new LessAgeException("U r not eligible");
			return votingPage;
		} catch (LessAgeException e) {
			votingPage = e.getMessage();
			return votingPage;
		}

	}

	@SuppressWarnings("finally")
	@GET
	@Path("signal/{color}")
	@Produces(MediaType.TEXT_HTML)
	public String getSignal(@PathParam("color") String color) {
		int code = 0;
		String text = "";
		String result = "";
		Signal signal = Signal.valueOf(color.toUpperCase());
		try {
			for (int i = 0; i < 4; i++) {
				code += (int) color.toUpperCase().charAt(i);
			}
			switch (signal) {
			case RED:
				text = "<font color='red' size=10px>";
				break;
			case YELLOW:
				text = "<font color='yellow' size=10px>";
				break;
			case GREEN:
				text = "<font color='green' size=10px>";
				break;
			default:
				text = "<font color='green' size=10px>";
			}
			result = text + signal.toString() + ":" + signal.action + ":" + signal.time + ":" + code + "</font>";
			return result;
		} catch (IllegalArgumentException ex) {
			result = "<font color='" + color + "' size=10px>The given signal color is not valid</font>";
			return result;
		} catch (StringIndexOutOfBoundsException ex) {
			text = "<font color='" + color + "' size=10px>";
			result = text + signal.toString() + ":" + signal.action + ":" + signal.time + ":" + code + "</font>";
			return result;
		} catch (Exception ex) {
			return "";

		}
	}

	@GET
	@Path("arithm/{a},{b}")
	@Produces(MediaType.TEXT_HTML)
	public String getdoIt(@PathParam("a") float a, @PathParam("b") float b) {
		Arith add = (x, y) -> {
			return x + y;
		};
		String res = add.doOperation(a, b) + "";
		return res;
	}
	@GET
	@Path("read_file/{fname}")
	@Produces(MediaType.TEXT_HTML)
	public String readFile(@PathParam("fname")String fname) {
		try {
			FileInputStream in=new FileInputStream("C:\\ashwin\\classes\\java_iam_b3\\rest\\files\\"+fname);
			int c=in.read();
			String s="";
			while(c!=-1) {
				if(c==13)
					s+="<br>";
				else
					s+=(char)c;
				c=in.read();
			}
			return s;
		}
		catch(Exception e) {
			return e.getMessage();
		}
		
	}
@GET
@Path("{fname}/{a}/{b}")
@Produces(MediaType.TEXT_HTML)	
public String writeFile(@PathParam("fname")String fname,@PathParam("a")int a,@PathParam("b")int b) {
try {
	FileOutputStream file=new FileOutputStream("D:\\workspace\\rest\\file\\"+fname,true);
	String s="";
	s=(a+b)+"";
	byte x[]=s.getBytes();
	file.write(x);
	file.write(System.lineSeparator().getBytes());
	return "data saved in file:"+s;
}
catch(Exception e) {
	return e.getMessage();
}}

@GET
@Path("filecopy/{source}/{destination}")
@Produces(MediaType.TEXT_HTML)
public String copyFileUsingStream(@PathParam("source")String source,@PathParam("destination")String destination){
    InputStream is = null;
    OutputStream os = null;
    try {
        is = new FileInputStream("D:\\workspace\\rest\\file\\source");
        os = new FileOutputStream("D:\\workspace\\rest\\file\\destination");
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
    
        is.close();
        os.close();
        return "file copied";
    }
    catch (Exception e) {
    	return e.getMessage();
    }
}



@GET
@Path("list/{values}")
@Produces(MediaType.TEXT_HTML)
public String getList(@PathParam("values")String values) {
    String ar[]=values.split(",");
    Integer ia[]=new Integer[ar.length];
    int i=0;
    for(String val:ar)
        ia[i++]=new Integer(val);//i is increased by 1 after every execution.
    listEx ex=new listEx();
    List<Integer> list=ex.addValues(ia);
    String res="";
    for(Integer val:list)
        res+=val+"<br>";
    return res;
}
@GET
@Path("list")
@Produces(MediaType.TEXT_HTML)
public String getList() {
    List<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(-30);
    list.add(40);
    list.remove(1);
    list.add(2, 50);
    List<Integer> list2=new LinkedList<>();
    list2.add(100);
    list2.add(70);
    list2.add(90);
    list2.add(30);
    list.addAll(list2);
    list.removeAll(list2);
    list.set(2, 85);
    Collections.sort(list);
    Collections.reverse(list);
    int x=list.get(2);//get value from given index
    String res="";
    for(Integer i:list)
        res+=i+"<br>";
    res+="----<br>";
    res+=x+"<br>";
    int i=list.indexOf(500);
    res+=i+"<br>";
    boolean b=list.contains(40);
    res+=b+"<br>";
    return res;
}


@GET
@Path("listt")
@Produces(MediaType.TEXT_HTML)
public String getListt() {
    List<Integer> list=new ArrayList<>();
    List<Integer> list3=new ArrayList<>();
    String s=" ";
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    List<Integer> list2=new LinkedList<>();
    list2.add(10);
    list2.add(70);
    list2.add(90);
    list2.add(30);
    for(Integer i:list)
    	if(list2.contains(i))
    		//list3.add(i);//for getting common values
    		list3.remove(i);// for removing common values
    		else
    			list3.add(i);
    return "different values from list: "+list3;


    
}

@GET
@Path("item_list")
@Produces(MediaType.APPLICATION_XML)
public List<Item> getItems() {
    Item i1=new Item (10,"briyani",250);
    Item i2=new Item (11,"roti",25);
    Item i3=new Item (12,"curry",150);
    List<Item> items=new ArrayList<>();
    items.add(i1);
    items.add(i2);
    items.add(i3);
    Collections.sort(items);
    return items; 

}

@GET
@Path("sal_list")
@Produces(MediaType.APPLICATION_XML)
public List<salarieeees> getsalarieeees() {
    salarieeees i1=new salarieeees (101,"irfan",2500);
    salarieeees i2=new salarieeees (102,"naser",1250);
    salarieeees i3=new salarieeees (103,"akash",1500);
    List<salarieeees> items=new ArrayList<>();
    items.add(i1);
    items.add(i2);
    items.add(i3);
    Collections.sort(items);
    return items; 

}
@GET
@Path("map")
@Produces(MediaType.TEXT_HTML)
public String getmap() {
	Map<Integer,String> map=new HashMap<>();
	String names[]= {"arathi","naser","irfan","vinayak","akash","aamani"};
for (int i=101;i<=100+names.length;i++)
map.put(i, names[i-101]);
String s="";
for(Map.Entry<Integer, String> entry:map.entrySet())
	if(entry.getKey()==104)
s+=entry.getKey()+","+entry.getValue()+"<br>";
return s;
}
@GET
@Path("marks_map")
@Produces(MediaType.TEXT_HTML)
public String getMarks() {
    Map<Integer,List<Integer>> map=new HashMap<>();
    List<Integer> list1=Arrays.asList(67,67,67);
    List<Integer> list2=Arrays.asList(78,78,78);
    List<Integer> list3=Arrays.asList(89,89,89);
    map.put(101, list1);
    map.put(102, list2);
    map.put(103, list3);
    
    String s="";
    for(Map.Entry<Integer, List<Integer>> entry:map.entrySet())
        s+=entry.getKey()+":"+entry.getValue()+"<br>";
    return s;
    }

@GET
@Path("fam_map")
@Produces(MediaType.TEXT_HTML)
public String familyMap() {
Map<String,Map<String,Object>>	family=new LinkedHashMap<>();
Map<String,Object>head=new LinkedHashMap<>();
Map<String,Object>mem1=new LinkedHashMap<>();	
Map<String,Object>mem2=new LinkedHashMap<>();
Map<String,Object>mem3=new LinkedHashMap<>();
	head.put("name", "father");
	head.put("age", 50);
	head.put("sex", "male");
	
	mem1.put("name", "mother");
	mem1.put("age", 35);
	mem1.put("sex", "female");
	
	mem2.put("name", "bro");
	mem2.put("age", 15);
	mem2.put("sex", "male");
	
	mem3.put("name", "sister");
	mem3.put("age", 5);
	mem3.put("sex", "female");
	
	family.put("head", head);
	family.put("mem1", mem1);
	family.put("mem2", mem2);
	family.put("mem3", mem3);
	
	String s="";
	for(Map.Entry<String, Map<String,Object>> entry:family.entrySet())
	 s+=entry.getKey()+":"+entry.getValue()+"<br>";
     return s;	
}


@GET
@Path("connect_db")
@Produces(MediaType.TEXT_HTML)
public String connectToDatabase() {
    	try {
            Connection c=mysql.connect();
            return "connected";
    } catch (Exception e) {
        // TODO Auto-generated catch block
        return e.getMessage();
    }
    }
}


