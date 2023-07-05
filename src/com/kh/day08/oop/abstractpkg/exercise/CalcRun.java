package com.kh.day08.oop.abstractpkg.exercise;

public class CalcRun {
	public static void main(String[] args) {
		
//		Calculator calc = new Calculator();
		// 추상클래스는 객체 생성 안된다!
		// error : Cannot instantiate the type Calculator
		
		Calculator calc = new GoodCalc(); // 업캐스팅
		int [] a = {11,25,30,43,54};
		System.out.printf("합 : %d\n", calc.add(1, 2));
		System.out.printf("차 : %d\n", calc.substract(20, 10));
		System.out.printf("평균 : %.2f", calc.average(a));
	}
}
