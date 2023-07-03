package com.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_Calculator_1 {
	public static void main(String [] args)
	{
		// 반복문을 이용하여 정수를 2개와 연산자를 입력받고 
		// 입력한 정수들과 연산자가 결합된 수식의 결과값을 출력하세요.
		// <작동 예시>
		// 정수 하나 입력 : 1
		// 정수 하나 더 입력 : 2
		// 연산자 입력(+,-,*,/,%) : +
		// 1 + 2 = 3
		// 정수 하나 입력 : 3
		// 정수 하나 더 입력 : 7
		// 연산자 입력(+,-,*,/,%) : *
		// 3 * 7 = 21
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		while(true) {
			System.out.print("정수 하나 입력 : ");
			int input1 = scanner.nextInt();
			
			System.out.print("정수 하나 더 입력 : ");
			int input2 = scanner.nextInt();
			
			System.out.print("연산자 입력(+,-,*,/,%) : ");
			char operator = scanner.next().charAt(0);
			
			int result = 0;
			
			switch (operator) {
				case '+':
					result = input1 + input2;
					break;
				case '-':
					result = input1 - input2;
					break;
				case '*':
					result = input1 * input2;
					break;
				case '/':
					result = input1 / input2;
					break;
				case '%':
					result = input1 % input2;
					break;
					
				}
				System.out.println(input1 + " " + operator + " " + input2 + " = " + result);
				count++;
				if(count == 3)
					break;
			}
		}
	}

