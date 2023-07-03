package com.kh.day06.oop.student;

public class Student {
	// 이름
	String name;
	// 첫번째 성적
	int firstScore;
	// 두번째 입력
	int secondScore;
	// 평균 출력
	double avg;
	
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
//		this.avg = (firstScore + secondScore) / 2;
	}
	
	public String getName() {
		return name;
	}
	
	public int getFirstScore() {
		return firstScore;
	}
	
	public int getSecondScore() {
		return secondScore;
	}
	
	public double getAvg() {
		return avg;
	}
}
