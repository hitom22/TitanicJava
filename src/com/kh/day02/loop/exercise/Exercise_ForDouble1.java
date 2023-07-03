package com.kh.day02.loop.exercise;

public class Exercise_ForDouble1 {
	public static void main(String [] args)
	{
		// 2단 옆에 3단, 3단 옆에 4단, 4단 옆에 5단이 되도록 작성하시오.
		int start = 2;
		int end = 9;
		
		for(int i=1; i<=9; i++ ) {
			for(int j=start; j<=end; j++) {
				System.out.print(j + " x " + i + " = " + (j*i) + "\t");
			}	
			System.out.println();
		}		
	}
}

