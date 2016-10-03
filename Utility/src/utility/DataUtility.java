package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtility {
	
	public static Date stringToDate(String data) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(data);
		return date;
	}
	
	public static java.sql.Date dateUtilToDateSql(Date data){
		java.sql.Date d = new java.sql.Date(data.getTime());	
		return d;
	}
	
	public static long getDifferenzaGiorni(Date data1, Date data2, String s){
		long diffMillisecond = data2.getTime()-data1.getTime();
		long diff = 0;
		switch (s){		
			case "giorni":
				long millsecDay = 86400000;
				diff=diffMillisecond/millsecDay;
				break;
			case "mesi":
				long millsecMonth = 86400000*30;
				diff=diffMillisecond/millsecMonth;
				break;
			case "anni":	
				long millsecYear = 86400000*365;
				diff=diffMillisecond/millsecYear;
				break;
		}
		return diff;
	}
}
