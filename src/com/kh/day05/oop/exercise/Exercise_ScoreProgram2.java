package com.kh.day05.oop.exercise;

import java.util.Scanner;

public class Exercise_ScoreProgram2 {
	Student student = new Student();
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
					Student.inputScore();
					break;
				case 2:
					Student.printScore();
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
	
//	public static void inputScore() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("====== 성적 입력 =======");
//		System.out.print("국어 : ");
//		Student.kor = scanner.nextInt();
//		System.out.print("영어 : ");
//		Student.eng = scanner.nextInt();
//		System.out.print("수학 : ");
//		Student.math = scanner.nextInt();
//	}
//	
//	public static void printScore() {
//		int sum = Student.kor+Student.eng+Student.math;
//		System.out.println("====== 성적 출력 =======");
//		Student.printStudentScore();
//		System.out.printf("총점 : %d\n", sum);
//		System.out.printf("평균 : %.2f\n", (double)(sum)/3);
//	}
	
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