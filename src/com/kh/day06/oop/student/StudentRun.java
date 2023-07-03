package com.kh.day06.oop.student;

import java.util.Scanner;

public class StudentRun {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 학생 성적 확인 프로그램
				// 1번 : 학생 성적 입력
				// 2번 : 학생 성적 출력
				// 3번 : 재평가 여부 확인
				// 4번 : 프로그램 종료
				// 메뉴 입력 : 4
		
		System.out.println("메뉴 : ");
		System.out.println("1. 학생 성적 입력");
		System.out.println("2. 학생 성적 출력");
		System.out.println("3. 재평가 여부 확인");
		System.out.println("4. 프로그램 종료");
		System.out.println("메뉴 입력(1~4) : ");
		int choice = scanner.nextInt();
		Student student = null;
		
		switch (choice) {
			case 1:
				System.out.println("학생 정보를 입력하세요");
				System.out.print("학생 이름 : ");
				String name = scanner.next();
				System.out.print("1차 점수 입력 : ");
				int firstScore = scanner.nextInt();
				System.out.print("2차 점수 입력 : ");
				int secondScore = scanner.nextInt();
				student = new Student(name, firstScore, secondScore);
				break;
				
			case 2:
				if (student != null) {
					System.out.println(student.getName() + " 학생의 점수는 ");
					System.out.println("1차 점수 : " + student.getFirstScore() + ", 2차 점수 : " + student.getSecondScore());
				} else {
					System.out.println("학생 정보를 입력해주세요.");
				}
				break;
				
			case 3:
				if (student != null) {
					System.out.println(student.getName() + " 학생의 확인 결과 : ");
					if(student.getFirstScore() < 40 || student.getSecondScore() < 40) {
						System.out.println("1차 시험 재평가 대상자입니다.");
					}
					if(student.getAvg() < 60) {
						System.out.println("2차 시험 재평가 대상자입니다.");
					}
					if(student.getFirstScore() >= 40 && student.getSecondScore() >= 40 && student.getAvg() >= 60) {
						System.out.println("통과했습니다.");
					}
				} else {
					System.out.println("학생 정보를 입력해주세요.");
				}
				break;
				
			case 4:
				System.out.println("프로그램이 종료되었습니다.");
				scanner.close();
				break;
				
			default:
				System.out.println("1번 ~ 4번 중 한 개의 번호를 선택해주세요.");
				break;
				
				
		}
		
		// 1번 선택시
		// 1번째 학생 정보 입력
		// 학생 이름 입력 : 일용자
		// 1차 점수 입력 : 60
		// 2차 점수 입력 : 55
		// => 1명씩 입력받도록 하거나
		// 2명 한꺼번에 입력받도록 하세요
		
		// 2번 선택시
		// 1번째 학생 정보 출력
		// 일용자 학생의 점수는
		// 1차 점수 : 60, 2차 점수 : 55 입니다.
		
		// 3번 선택시
		// 1번째 일용자 학생의 확인결과
		// 통과했습니다.
		
		// 1번째 일용자 학생의 확인결과
		// 1차 시험 재평가 대상자입니다.
		
		// 1번째 일용자 학생의 확인결과
		// 2차 시험 재평가 대상자입니다.
		
		// 1번째 일용자 학생의 확인결과
		// 1차 시험 재평가 대상자입니다.
		// 2차 시험 재평가 대상자입니다.
		
		// 4. 선택시
		// 프로그램이 종료되었습니다.
		
		// 재평가 기준 설명
		// 0. 재평가의 여부는 1차, 2차가 각각 다르다.
		// 1. 점수가 40점 미만인 경우 과락으로 재평가 대상자가 된다.
		// 2. 1차 점수와 2차 점수의 평균은 60점을 넘어야 통과한다.
		// 3. 1차 점수와 2차 점수의 평균이 60점 미만인 경우 
		//    60점 미만인 과목은 재평가를 본다.
		
	}
}
