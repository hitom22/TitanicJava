package com.kh.day06.oop.objectarray;

import java.util.Scanner;

	public class Exam_Objectarray2 {
		public static void main(String[] args) 
		{
			Book [] books= new Book[2];
			Scanner scanner = new Scanner(System.in);
			
			for(int i=0; i<books.length; i++) {
				System.out.print("제목 >> ");
				String title = scanner.nextLine();
				System.out.print("저자 >> ");
				String author = scanner.nextLine();
//				books[i] = new Book(); // 객체셍성
//				books[i].title = title; // 객체배열1
//				books[i].author = author; // 객체배열2
				books[i] = new Book(title, author);
				
				System.out.println("(" + books[i].title + "," + books[i].author + ")");				
			}

			
//			System.out.print("제목 >> ");
//			title = scanner.nextLine();
//			System.out.print("저자 >> ");
//			author = scanner.nextLine();
//			books[1] = new Book(title, author);
//			// The constructor Book() is undefined
//			//		books[0].title = title;
//			//		books[0].author = author;
//			
//			System.out.println("(" + books[1].title + "," + books[1].author + ")");
		
	}
}
