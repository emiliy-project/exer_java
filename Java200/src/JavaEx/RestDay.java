package JavaEx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
public class RestDay {
 // 토, 일요일 인가?
 public static boolean isRest(Calendar tod){
	boolean isRest=false;
	if(tod.get(Calendar.DAY_OF_WEEK)==Calendar.SATURDAY || // 토요일
	    tod.get(Calendar.DAY_OF_WEEK)==Calendar.SUNDAY ){  //또는 일요일
		isRest=true;
	}
	return isRest;
 }
 // Calendar를 문자열로
 public static String toYMD(Calendar dd){
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
	return sdf.format(dd.getTime());
 }	
 public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();	//오늘의 정보가 저장된 Calendar 생성
	int lastDay=cal.getActualMaximum(Calendar.DAY_OF_MONTH);	//이달의 마지막 날을 구함
	for (int i= 1; i <=lastDay; i++) {
		cal.set(Calendar.DAY_OF_MONTH, i);  // 1일부터 마지막날까지 
		if(isRest(cal)){                    // 휴일(토,일)확인
			System.out.println(toYMD(cal)+" 은 휴일입니다.");
		}             
	}
 }
}
