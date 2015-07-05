package iiiedu.jdad.jsp.HW01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class ChangeZone {

	public String change(String x){
		TimeZone tz = TimeZone.getTimeZone(x);  
		TimeZone.setDefault(tz);
		Date z = new Date();
		String[] p = x.split("/");
		SimpleDateFormat d = new SimpleDateFormat("yyyy年MM月dd日 a HH時mm分ss秒");
		
		return p[1]+"現在的時間為："+d.format(z);
	}
}
