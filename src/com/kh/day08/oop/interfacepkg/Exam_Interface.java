package com.kh.day08.oop.interfacepkg;

public class Exam_Interface {
	public static void main(String[] args) {
//		PhoneInterface phone = new PhoneInterface();
		// error 1. Cannot instantiate the type PhoneInterfacee
		// => 인터페이스로 객체 생성 안된다.
		
		PhoneInterface phone = new SamsungPhone();
		// 업캐스팅!
		
		phone.sendCall();
		phone.receiveCall();
		phone.printLogo();
	}
}
