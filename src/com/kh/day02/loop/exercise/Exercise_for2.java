package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_for2 {
	public static void main(String [] args)
	{
		// 정수를 하나 입력받아서 그 수가 1 ~ 9 사이의 수일 때만
		// 그 수의 구구단을 출력하세요.
		// 단, 조건이 맞지 않으면,
		// "1 ~ 9사이의 양수를 입력하여야 합니다"를 출력하세요.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = scanner.nextInt();
		
		if (num >= 1 && num <= 9) {
			for (int i=1; i<10; i++) {
				int result = num * i;
				System.out.println(num + " x " + i + " = " + result);	
		}
		} else {
			System.out.println("1 ~ 9 사이의 양수를 입력하여야 합니다.");
		}
		
	}
}


