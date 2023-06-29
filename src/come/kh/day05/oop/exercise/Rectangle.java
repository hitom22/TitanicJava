package come.kh.day05.oop.exercise;


public class Rectangle {

//	너비와 높이를 입력 받아 사각형의 합을 출력하는 프로그램을 작성하라. 
//	너비(width)와 높이(height) 필드, 
//	그리고 면적 값을 제공하는 getArea() 메소드를 가진 
//	Rectangle 클래스를 만들어라.
	
	// =====================================> 필드
	public int width;
	public int height;
	
	// =====================================> 생성자
	public Rectangle() {
		// 초기화(->원칙은 생성자에서 초기화하는것)
		// 생성자의 역할 : 객체 초기화(생성자사용이유)
		// 생성자의 특징 : (1) void(반환형)이 없다.
		// 				   (2) 클래스 이름과 동일한 이름을 가진다.
		// 				   (3) 기본생성자는 생략이 가능하다.
		width = 0;
		height = 0;
		
	}
	// =====================================> 메소드
	public int getArea() {
		return width*height;
	}
	
}
