package com.kh.day01.operator;

public class Exam_Unary {
	public static void main(String [] args)
	{
		// 단항 연산자
		// a++, ++a -> a = a + 1;
		int a = 1;
		System.out.println(a++);  // 후위연산(나중연산) : a를 먼저 출력하고 후에 ++ 더함
		// 지금 이 부분에서는 a가 2인 상태임
		System.out.println(a++);
		// 지금 이 부분에서는 a가 3인 상태
		System.out.println(a);
		System.out.println(++a);  // 전위연산(먼저연산) : 먼저 ++ 더한 후에 a를 출력
		// 최종 4가 됨

	}
}
