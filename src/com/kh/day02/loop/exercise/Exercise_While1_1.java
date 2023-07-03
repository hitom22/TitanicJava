package com.kh.day02.loop.exercise;

public class Exercise_While1_1 {
	public static void main(String [] args)
	{
		// while문을 이용하여 1 ~ 100 사이의 홀수의 합을 출력하시오.
		
		int num = 0;
		int sum = 0;
		
		while (num <= 100) {
			if(num % 2 != 0) {
				sum += num;
			}
			num++;
		}
		System.out.println("1 ~ 100 사이의 홀수의 합은 : " + sum + " 입니다.");
	}
}
