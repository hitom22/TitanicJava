package com.kh.day06.oop.student;

		public class Student_for_instructor {
		// 이름
		// 첫번째 성적
		// 두번째 성적
		// 평균 출력
		private String name;
		private int firstScore;
		private int secondScore;
		
		public Student_for_instructor() {}
		
		public Student_for_instructor(String name, int firstScore, int secondScore) {
			this.name = name;
			this.firstScore = firstScore;
			this.secondScore = secondScore;
		}
		public double getAvg() {
			double avg = (double)(this.firstScore
					+this.secondScore)/2;
			return avg;
		}

		// getter 메소드 이용하기
		// -> get으로 시작한다. + CamelCase 표기!!!!
		// CamelCase? :(띄어쓰기가 있는 각 단어의 첫 문자는 대문자 표기)
		public String getName() {
			return this.name;
		}
		
		public int getFirstScore() {
			return this.firstScore;
		}
		
		public int getSecondScore() {
			return this.secondScore;
		}
		
		// setter 메소드 이용하기
		// -> set으로 시작한다. + CamelCase 표기!!!!
		// CamelCase? :(띄어쓰기가 있는 각 단어의 첫 문자는 대문자 표기)
		public void setName(String name) {
			this.name = name;
		}

		public void setFirstScore(int firstScore) {
			this.firstScore = firstScore;
		}
		
		public void setSecondScore(int secondScore) {
			this.secondScore = secondScore;
		}
}