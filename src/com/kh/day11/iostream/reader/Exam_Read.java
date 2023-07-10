package com.kh.day11.iostream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_Read {

	public static void main(String[] args) {
		//	Reader reader = new Reader();
		// error : Reader cannot be resolved to a type
		
		Reader reader = null;
		
		try {
			// 요런 것들을 Checked Exception이라고 함!
			reader = new FileReader("src/com/kh/day11/iostream/reading.txt");
			// error : Unhandled exception type FileNotFoundException
			
			while(true) {
//				reader.read();
				// error : Unhandled exception type IOException
				int readData = reader.read();
				if(readData == -1) break;
				System.out.print((char)readData);
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
