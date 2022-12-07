package irfan.rest;

import java.util.Calendar;

public class calEx {
	public String getDate() {
		Calendar cal=Calendar.getInstance();
		int doy=cal.get(Calendar.DAY_OF_WEEK);
		String dayName="";
		for(day day:day.values())
			if(day.ordinal()==doy-1)
				dayName=day.toString();
		
		/*cal.set(1997, 2, 16);
		doy=cal.get(Calendar.DAY_OF_WEEK);
		for(Day day:Day.values())
			if(day.ordinal()==doy-1)
				dayName=day.toString();*/
		
		cal.add(Calendar.YEAR, -100);
		doy=cal.get(Calendar.DAY_OF_WEEK);
		for(day day:day.values())
			if(day.ordinal()==doy-1)
				dayName=day.toString();
		
			
		return cal.getTime().toString()+"<br>"+doy+"<br>"+dayName;
	}

}
