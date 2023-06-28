package come.kh.day02.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {
	public static void main(String [] args)
	{
		// while문을 이용하여 -1이 입력될 때까지 정수를 입력받고 
		// -1이 입력되면 입력한 수의 합을 출력하세요.
		// <작동 예시>
		// 정수 하나 입력 : 3
		// 정수 하나 입력 : 4
		// 정수 하나 입력 : 7
		// 정수 하나 입력 : -1
		// 입력하신 수의 합은 14 입니다.
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int input;
		
		System.out.println("정수 하나 입력 : ");
		
		while ((input = scanner.nextInt()) != -1) {
			sum += input;
			System.out.println("정수 하나 입력 : ");
		}
		System.out.println("입력하신 수의 합은 : " + sum + "입니다.");
	}
}
