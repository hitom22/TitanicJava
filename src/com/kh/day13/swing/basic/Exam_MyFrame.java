package com.kh.day13.swing.basic;

import javax.swing.JFrame;

public class Exam_MyFrame extends JFrame{
	
	public Exam_MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
//		Exam_MyFrame exFrame = new Exam_MyFrame();
		new Exam_MyFrame(); // 객체만 만들면 실행 된다.
	}
}
