package com.kh.day04.myexception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {

	public void exercise1() {
		// 정수를 0으로 나누는 경우에 
		// "0으로 나눌 수 없습니다!"를 출력하고
		// 다시 입력받는 프로그램을 작성하여라.
		
		Scanner scanner = new Scanner(System.in);
		// 무한반복문 사용법
		// for(;;) {}
		// while(true) {}
//		while(true) {
//			int num1, num2;
			// error : num1 cannot be resolved to a variable
			// error : The local variable num1 may not have been initialized
//			num1 = 0;
//			num2 = 0;
			try {
				System.out.print("정수 하나 입력 : ");
				int num1 = scanner.nextInt();
				System.out.print("정수 하나 더 입력 : ");
				int num2 = scanner.nextInt();
				int result = num1 / num2;
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.\n", num1,num2,result);			
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다!");
			}
			catch(InputMismatchException e) {
				System.out.println("정수만 입력해 주십시오!");
				scanner.next();
			}
		}	
	
	
	public void exercise2() {
		// 3개의 정수를 입력받아 합을 구하는 프로그램을 작성하여라.
		// 사용자가 정수가 아닌 문자를 입력할 때
		// 발생하는 InputMismatchException 예외를 처리하여
		// 다시 입력받도록 하여라.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요.");
		int sum = 0;
		
		for(int i=0; i<3; i++) {
			System.out.print(i + ">>");
//			int num = scanner.nextInt();
			
			try {
				sum += scanner.nextInt();			
			}
			catch (InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!!");
				scanner.next(); // 입력한 문자를 제거함.
				i--;		// 2에서 다시 1로 i값을 만들어줌, i++만나서 증가하도록 하기 위함.
				continue;	// i++로 가게 해줌
			}
		}
		System.out.printf("합은 %d", sum);
		}
		
	
//		try {
//			System.out.print("정수를 하나 입력하세요 : ");
//			int num1 = scanner.nextInt();
//			System.out.print("정수를 하나 더 입력하세요 : ");
//			int num2 = scanner.nextInt();
//			System.out.print("정수를 하나 더 입력하세요 : ");
//			int num3 = scanner.nextInt();
//			sum = num1 + num2 + num3;
//			System.out.printf("%d,%d,%d의 합은 %d입니다.", num1,num2,num3,sum);			
//		}
//		catch (InputMismatchException e) { 
//			System.out.println("정수만 입력해 주세요!");
//		}
//		
		

		public void exercise3() {
			// 범위를 벗어난 배열의 접근
			int[] intArrs = new int[5];
			try {
				System.out.println(intArrs[5]);				
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
			}
		}
		
		
		
		public void exercise4() {
			// 정수가 아닌 문자열을 정수로 변환할 때 예외 발생
			// (NumberFormatException)
			String[] str = new String[2];
					str[0] = "1026";
					str[1] = "5.15";
			// String -> int
			try {
				int result = Integer.parseInt(str[0]);
				System.out.printf("숫자로 변환된 값은 %d\n", result);
				int check = Integer.parseInt(str[1]);
				System.out.printf("숫자로 변환된 값은 %d\n", check);
			} catch (NumberFormatException e) {
				// to do handle exception
				System.out.println("해당 문자열은 정수로 변환할 수 없습니다.");
			}
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

