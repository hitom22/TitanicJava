package com.kh.day08.oop.interfacepkg;

//public class SamsungPhone extends PhoneInterface {
	// 1. error : The type PhoneInterface cannot be the superclass of SamsungPhone; 
	//a superclass must be a class => extends 안됨!
//}

public class SamsungPhone implements PhoneInterface {
	
	@Override
	public void receiveCall() {
		System.out.println("여보세요 나야~");
		
	}
	
	@Override
		public void sendCall() {
		System.out.println("뚜뚜뚜뚜뚜뚜뚜뚜뚜뚜");
			
	}
	
	@Override
	public void printLogo() {
		// TODO Auto-generated method stub
		System.out.println("==========SAMSUNG==========");		
	}

}
