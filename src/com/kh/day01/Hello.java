package com.kh.day01;

public class Hello {
	
	public static int sum(int num1, int num2) {
		// 오류메세지 : This method must return a result of type int 
		// (int 메서드는 return과 세트를 이뤄서 사용되어야 함)
		return num1+num2;
	}
	
	public static void main(String [] args)
	{
		int i = 20;
		int s;
		char a;
		
		a = '?';
		s = sum(i, 10);
		System.out.println(s);
		System.out.println(a);
		System.out.println("Hello");
	}
}
