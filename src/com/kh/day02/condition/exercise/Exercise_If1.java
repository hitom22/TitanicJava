package com.kh.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If1 {
	public static void main(String [] args)
	{
		//점수와 학년을 입력 받아 60점 이상이면 합격, 
		//미만이면 불합격을 출력한다. 
		// 단, 4학년의 경우 70점 이상이어야 합격이다.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력(0~100) : ");
		int score = scanner.nextInt(); //점수 읽기
		
		System.out.print("학년 입력(1~4) : ");
		int grade = scanner.nextInt();
		
		if (grade == 4) {
			if(score >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else {
			if (score >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
		
		
	}
}

