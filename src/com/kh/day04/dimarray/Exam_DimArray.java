package com.kh.day04.dimarray;

public class Exam_DimArray {

	public static void main(String[] args) 
	{
		int num = 0;
		int[] nums = new int[10];
		int [][] dimNums = new int[2][5];  
		//2행 5열 //2차원 배열 // 배열 안에 배열 넣음	
		System.out.println("앞의 크기 : " + dimNums.length);
		System.out.println("뒤의 크기 : " + dimNums[0].length);
		System.out.println("뒤의 크기 : " + dimNums[1].length);
		
		int[][] arrs = new int[4][4];
		int k = 1;
		//입력
		for(int i=0; i<arrs.length; i++) {
			for(int j=0; j<arrs[i].length; j++) {
				arrs[i][j] = k;
				k++;
			}	
		}
		
		// 출력
		for(int j=0; j<arrs.length; j++) {
			for(int i=0; i<arrs[j].length; i++) {
					System.out.print(arrs[j][i] + " ");
				}	
			System.out.println();
		}
		
		
		}
		
		

		
		
//		int[][] arrs = new int[4][4];
//		arrs[0][0] = 1;
//		arrs[0][1] = 2;
//		arrs[0][2] = 3;
//		arrs[0][3] = 4;
//		
//		arrs[1][0] = 5;
//		arrs[1][1] = 6;
//		arrs[1][2] = 7;
//		arrs[1][3] = 8;
//		
//		arrs[2][0] = 9;
//		arrs[2][1] = 10;
//		arrs[2][2] = 11;
//		arrs[2][3] = 12;
//		
//		arrs[3][0] = 13;
//		arrs[3][1] = 14;
//		arrs[3][2] = 15;
//		arrs[3][3] = 16;
		
//		System.out.println(arrs[0][0] + " ");
//		System.out.println(arrs[0][1] + " ");
//		System.out.println(arrs[0][2] + " ");
//		System.out.println(arrs[0][3] + " ");
	}
