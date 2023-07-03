package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram {
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	public static void main(String [] args)

	{
		Scanner scanner = new Scanner(System.in);
		int[] grade = new int[3];
		boolean menu = true;
//		Exercise_ScoreProgram score = new Exercise_ScoreProgram();
		 
		finish : 
		while (true) {
			printMenu();

			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					inputScore();
					break;
				case 2:
					printScore();
					break;
				case 3:
					showGoodByte();
					break finish; 
				default:
					printException();
					
			}
			System.out.println();
		}
	}

	public static void printMenu() {
		System.out.println("====== 메인 메뉴 ======");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
	}
	
	public static void inputScore() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("====== 성적 입력 =======");
		System.out.print("국어 : ");
		kor = scanner.nextInt();
		System.out.print("영어 : ");
		eng = scanner.nextInt();
		System.out.print("수학 : ");
		math = scanner.nextInt();
	}
	
	public static void printScore() {
		System.out.println("====== 성적 출력 =======");
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("총점 : %d\n", kor+eng+math);
		System.out.printf("평균 : %.2f\n", (double)kor+eng+math/3);
	}
	
	public static void showGoodByte() {
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public static void printException() {
		System.out.println("잘못 입력하셨습니다. 메뉴를 선택해주세요");
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