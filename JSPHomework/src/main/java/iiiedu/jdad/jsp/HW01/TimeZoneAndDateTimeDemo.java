package iiiedu.jdad.jsp.HW01;

import java.util.Arrays;
import java.util.Date;
import java.util.TimeZone;

public class TimeZoneAndDateTimeDemo {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("當地的現在時間: " + d);
		d = new Date(0);
		System.out.println("當地的原點時間: " + d);
		d = new Date(Long.MAX_VALUE);
		System.out.println("當地的最後時間: " + d);
		System.out.println("----------------------");
		System.out.println("將時區轉換為GMT");
		TimeZone tzGMT = TimeZone.getTimeZone("GMT");  
		TimeZone.setDefault(tzGMT);
		d = new Date();
		System.out.println("GMT 的現在時間: " + d);
		d = new Date(0);
		System.out.println("GMT 的原點時間: " + d);
		d = new Date(Long.MAX_VALUE);
		System.out.println("GMT 的最後時間: " + d);

		String[] Timeplace = TimeZone.getAvailableIDs();
		Arrays.sort(Timeplace);
		for(String s : Timeplace){
			System.out.println(s);
			
		}
		
	}

}
