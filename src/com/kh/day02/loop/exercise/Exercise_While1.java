package com.kh.day02.loop.exercise;

public class Exercise_While1 {
	public static void main(String [] args)
	{
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		
		int num = 1;
		int sum = 0;
		
		while (num <= 100) {
			sum += num;
			num += 2;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합은 : " + sum + " 입니다.");
	}
}
