package com.kh.day05.oop;

public class Book {
	// 제목과 저자를 나타내는 필드를 가진 Book클래스를 작성하고
	// 생성자를 작성하여 필드를 초기화 하세요.
	// 클래스 바로 밑에 선언하는 변수 = 필드 = 멤버변수
	
	// =====================================> 필드
	public String title;
	public String author;
	// =====================================> 생성자
	public Book() {
		// 객체초기화
		title = "";
		author = "";
	}
	public Book(String title) {
		this.title = title;
		//매개변수로 title을 받아 setting
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	// =====================================> 메소드

}
