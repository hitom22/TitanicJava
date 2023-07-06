package com.kh.day09.javaapi;

import java.util.Calendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar openDate = Calendar.getInstance();
		Calendar closeDate = Calendar.getInstance();
		Exam_Calendar ex = new Exam_Calendar();
		// 개강일
		openDate.clear();
		openDate.set(2023, 4, 15, 9, 0);
		// 종강일
		closeDate.clear();
		closeDate.set(2023, 9, 26, 17, 50);
		closeDate.set(Calendar.HOUR_OF_DAY, 17);
		
		ex.printCalendar("현재", today);
		ex.printCalendar("개강일", openDate);
		ex.printCalendar("종강일", closeDate);
//		openDate.set(Calendar.HOUR_OF_DAY, 9);
//		openDate.set(Calendar.MINUTE, 0);
	}
	
	
	// 현재 2022/12/7/수요일(11시) 오전 11시 42분 33초 234밀리초
	public void printCalendar(String title, Calendar cal) {
		int year 		= cal.get(Calendar.YEAR);
		int month 		= cal.get(Calendar.MONTH)+1;
		int day 		= cal.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek	= cal.get(Calendar.DAY_OF_WEEK);
		int hourOfDay   = cal.get(Calendar.HOUR_OF_DAY);
		int ampm 		= cal.get(Calendar.AM_PM);
		int hour 		= cal.get(Calendar.HOUR);
		int minute 		= cal.get(Calendar.MINUTE);
		int second 		= cal.get(Calendar.SECOND);
		int millisecond = cal.get(Calendar.MILLISECOND);
		System.out.print(title + " ");
		System.out.print(year + "/" + month + "/" + day);
		
		System.out.print("/");
		switch(dayOfWeek) {
		case Calendar.SUNDAY: System.out.print("일요일"); break;
		case 2: System.out.print("월요일"); break;
		case 3: System.out.print("화요일"); break;
		case 4: System.out.print("수요일"); break;
		case 5: System.out.print("목요일"); break;
		case 6: System.out.print("금요일"); break;
		case 7: System.out.print("토요일"); break;
		}

		System.out.print("(" + hourOfDay + "시) ");
		if(ampm == Calendar.AM) System.out.print("오전 ");
		else System.out.println("오후 ");
		System.out.print(hour + "시 " + minute + "분 " + second + "초 " 
			+ millisecond + "밀리초");
		System.out.println();
		
//		System.out.print("/" + cal.get(Calendar.DAY_OF_WEEK));
//		
//		System.out.print("(" + cal.get(Calendar.HOUR_OF_DAY)+ "시) " );
//		
//		System.out.print(cal.get(Calendar.HOUR) + "시 ");
//		System.out.print(cal.get(Calendar.MINUTE) + "분 ");
//		System.out.print(cal.get(Calendar.SECOND) + "초 ");
//		System.out.print(cal.get(Calendar.MILLISECOND) + "밀리초 ");
//		System.out.println();
	}
}
