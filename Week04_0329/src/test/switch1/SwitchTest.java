package test.switch1;

import java.util.Calendar;


public class SwitchTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DAY_OF_MONTH);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String dayStr = "";
		
		switch(day) {
		case Calendar.SUNDAY:
			dayStr = "일요일";
			break;
		case Calendar.MONDAY:
			dayStr = "월요일";
			break;
		case Calendar.TUESDAY:
			dayStr = "화요일";
			break;
		case Calendar.WEDNESDAY:
			dayStr = "수요일";
			break;
		case Calendar.THURSDAY:
			dayStr = "목요일";
			break;
		case Calendar.FRIDAY:
			dayStr = "금요일";
			break;
		case Calendar.SATURDAY:
			dayStr = "토요일";
			break;
		}
		
		System.out.printf("%d년 %d월 %d일 %s", year, month+1, date, dayStr);
	}

}
