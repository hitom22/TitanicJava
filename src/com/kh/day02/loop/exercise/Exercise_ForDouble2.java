package com.kh.day02.loop.exercise;

public class Exercise_ForDouble2 {
	public static void main(String [] args)
	{
		// 아래처럼 만드는 수식을 구해보세요
		//*																			//*
		//**
		//***
		//****
		//*****
		//******
		//*******
		//********
		//*********
		//**********
		
		int rows = 10;
		
		for(int i=1; i<= rows; i++) {		
			for(int j=1; j <= i; j++) {
				System.out.print("*");			
		}
			System.out.println();
		}
	}
}