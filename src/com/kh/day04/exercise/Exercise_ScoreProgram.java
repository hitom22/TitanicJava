package com.kh.day04.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] grade = new int[3];
		boolean menu = true;
		
		while (menu) {
			System.out.println("====== 메인 메뉴 ======");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 종료");
			System.out.println("선택 : ");

			int input = scanner.nextInt();
			switch (input) {
			case 1:
				System.out.println("\n====== 성적 입력 =======");
				System.out.print("국어 : ");
				grade[0] = scanner.nextInt();
				System.out.print("영어 : ");
				grade[1] = scanner.nextInt();
				System.out.print("수학 : ");
				grade[2] = scanner.nextInt();
				break;
			case 2:
				System.out.println("\n====== 성적 출력 =======");
				System.out.println("국어 : " + grade[0]);
				System.out.println("영어 : " + grade[1]);
				System.out.println("수학 : " + grade[2]);
				int total = grade[0] + grade[1] + grade[2];
				double average = total / 3.0;
				System.out.println("총점 : " + total);
				System.out.printf("평균 : %2f\n", average);
				break;
			case 3:
				menu = false;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 메뉴를 선택해주세요");
				break;
				
			}
			System.out.println();
		}
		
		System.out.println("종료되었습니다.");
	}
}



//====== 메인 메뉴 ======
//1. 성적입력
//2. 성적출력
//3. 종료
//선택 : 1
//====== 성적 입력 =======
//국어 : 100
//영어 : 90
//수학 : 80
//====== 메인 메뉴 ======
//1. 성적입력
//2. 성적출력
//3. 종료
//선택 : 2
//====== 성적 출력 ======
//국어 : 100
//영어 : 90
//수학 : 80
//총점 : 270
//평균 : 90.00