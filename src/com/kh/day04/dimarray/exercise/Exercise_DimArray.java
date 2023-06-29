package com.kh.day04.dimarray.exercise;

public class Exercise_DimArray {
	
	public void exercise1()
	{
		int[][] arrs = new int[5][5];
		int k = 1;
		
		//입력
		for(int i=0; i<arrs.length; i++) {
			for(int j=arrs.length-1; j>=0; j--) {
				arrs[i][j] = k;
				k++;
			}
		}
		
		//출력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
	}
	

	public void exercise2()
	{
		int [][] arrs = new int[5][5];
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = arrs.length-1; j >= 0; j--) {
				arrs[j][i] = k;
				k++;
			}	
		}
			
		for(int j = 0; j < arrs.length; j++){
			for(int i = 0; i < arrs[j].length; i++){
				System.out.printf("%2d ", arrs[j][i]);
			}System.out.println();
		}
		
	}
	
	
	
	
	public void exercise3()
	{
		int [][] arrs = new int[5][5];
		
		int k = 1;
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		
		for(int j = 0; j < arrs.length; j++){
			for(int i = 0; i < arrs[j].length; i++){
				System.out.printf("%2d ", arrs[j][i]);
			}System.out.println();
		}
	}
	
	
	
	
	
	public void exercise4()
	{
		int[][] arrs = new int[5][5];
		int k = 1;
		
		for(int s=0; s<5; s++) {
			if(s % 2 == 0) {
				for(int m=0; m<5; m++) {
					arrs[s][m] = k;
					k++;
				}
			} else {
				for(int m=4; m>=0; m--) {
					arrs[s][m] =k;
					k++;
				}
			}
		}
		
		
		//출력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				System.out.printf("%2d ", arrs[i][j]);
			}
			System.out.println();
		}
		
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		arrs[0][4] = 5;
//
//		arrs[1][4] = 6;
//		arrs[1][3] = 7;
//		arrs[1][2] = 8;
//		arrs[1][1] = 9;
//		arrs[1][0] = 10;
//
//		arrs[2][0] = 11;
//		arrs[2][1] = 12;
//		arrs[2][2] = 13;
//		arrs[2][3] = 14;
//		arrs[2][4] = 15;
//
//		arrs[3][4] = 16;
//		arrs[3][3] = 17;
//		arrs[3][2] = 18;
//		arrs[3][1] = 19;
//		arrs[3][0] = 20;
	}
	
	
	
	public void exercise5()
	{
		// 2차원 배열에 학년별로 1,2학기 성적으로 저장하고
		// 4년간 전체 평점 평균을 출력하라.
		// (3.3 3.4), (3.5, 3.6), (3.7 4.0), (4.1 4.2)
		
		double[][] score = {{3.3, 3.4}, {3.5, 3.6}, {3.7, 4.0}, {4.1, 4.2}};
		
//		score[0][0] = 3.3;
//		score[0][1] = 3.4;
//		score[1][0] = 3.5;
//		score[1][1] = 3.6;
//		score[2][0] = 3.7;
//		score[2][1] = 4.0;
//		score[3][0] = 4.1;
//		score[3][1] = 4.2;
		
		double sum = 0;
		for(int k=0; k<score.length; k++) {
			for(int h=0; h<score[k].length; h++) {
//				System.out.printf("%.1f ", score[k][h]);
				sum += score[k][h];
			}	
		}
		System.out.println();
		
		int frontLength = score.length;
		int backLength = score[0].length;
		double result = sum / (frontLength * backLength);
		System.out.printf("4년 전체 평점 평균은 : %.2f\n", result);
		
		
	
	}
	
}
