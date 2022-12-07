package irfan.rest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Path;


public class eval5 {

	 public String get() throws Exception {
		    List<Date> dates = new ArrayList<Date>();
		String d=" ";
		
		
		    String str_date ="01_01"; String end_date ="31_12";



		   DateFormat formatter ;



		   formatter = new SimpleDateFormat("dd_MM");
		   
		    Date  startDate = (Date)formatter.parse(str_date);
		    Date  endDate = (Date)formatter.parse(end_date);
		    
		    long interval = 24*1000 * 60 * 60;
		    long endTime =endDate.getTime() ; 
		    long curTime = startDate.getTime();
		    while (curTime <= endTime) {
		        dates.add(new Date(curTime));
		        curTime += interval;
		    }
		    for(int i=0;i<dates.size();i++){
		        Date lDate =(Date)dates.get(i);
		        String ds = formatter.format(lDate);
		        d+=ds+"<br>";
		        
		    }
		    return "dd_mm of the year"+d;
		}
		}	
