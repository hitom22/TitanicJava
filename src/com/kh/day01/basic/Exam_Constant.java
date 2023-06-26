package com.kh.day01.basic;

public class Exam_Constant {
	public static void main(String [] args)
	{
		final double PI = 3.14;
//		final 없으면 상수가 됨(double PI = 3.14)
		
		double radius = 10.0;
		double circleArea = radius * radius * PI; // 원 넓이
		
		System.out.println("원의 면적 : " + circleArea);
		// 원의 면적 출력
	}
}
