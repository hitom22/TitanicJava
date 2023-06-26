package com.kh.day01.practice;

public class Exam_practice {
	public static void main(String [] args)
	{
		//1번
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		a++;
//		// 현재 a : 11, b : 20, c : 30;
//		b =(--a)+b;
//		// 현재 a : 10, b : 30, c : 30;
//		c =(a++)+(--b);
//		// 현재 a : 11, b : 29, c : 39;
//		
//
//		System.out.println("a : " + a + ", b : " + b + ", c : " + c);
		
		
		
		//2번
//		boolean flag = true;
//		System.out.println(!!!!flag);
		
		
		
		
		//3번
		int x=100;
		int y=33;
		int z=0;
		
		x--;
		// x : 99, y : 33, z : 0;
		z = x-- + --y;
		// x : 98, y : 32, z : 131;		
		x = 99 + x++ + x;
		// x : 296, y : 32, z : 131;				
		y = y-- + y + ++y;
		// x : 296, y : 95, z : 131;				

		System.out.println("x : " + x + ", y : " + y + ", z : " + z);
	}
}
