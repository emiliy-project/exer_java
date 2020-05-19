package JavaEx;

import java.util.Calendar;
import java.util.Date;
public class CalendarTest {
	public static void main(String[] args) {
		long millis=System.currentTimeMillis();  // 1970.1.1부터 경과시간 msec
		System.out.println(millis/1000/24/60/60);// 몇일 경과		
		Date d=new Date();          // 오늘
		System.out.println(d);
		Date dd=new Date(d.getTime()+24*60*60*1000); //하루후
		System.out.println(dd);
		
		Calendar cal1977=Calendar.getInstance(); 
		//cal1977.set(1977, 4 ,6);  // 0월 ~11월 
		cal1977.set(1977, Calendar.MAY ,9);  // 0월 ~11월 		
		Calendar today=Calendar.getInstance();   // 오늘 
		printCalendar(today);
		long minus=today.getTimeInMillis()-cal1977.getTimeInMillis();
		System.out.println(minus); //1977.5.6~오늘 msec
		System.out.println(minus/1000/24/60/60); // 1977년 부터 몇일 지났는가?
	}
	// 칼렌더 정보
	public static void printCalendar(Calendar c){
		System.out.println("-------------------------------------");
		System.out.println(c.get(Calendar.YEAR));         // 몇 년
		System.out.println(c.get(Calendar.MONTH)+1);      // 몇 월
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // 몇 일
		System.out.println(c.get(Calendar.AM_PM));        // 1 PM, 0 AM
		System.out.println(c.get(Calendar.HOUR_OF_DAY));  // 몇 시 Calendar.HOUR
		System.out.println(c.get(Calendar.MINUTE));       // 몇 분
		System.out.println(c.get(Calendar.SECOND));       // 몇 초
	}
}


