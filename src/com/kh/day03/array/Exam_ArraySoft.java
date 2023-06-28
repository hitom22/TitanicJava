package com.kh.day03.array;

public class Exam_ArraySoft {
	public static void main(String [] args)
	{
		// {1, 3, 6, 10, 5, 7, 5, 2, 9, 8 }
		// 정렬 알고리즘의 종류
		// 1. 삽입 정렬
		// 2. 선택 정렬
		// 3. 버블 정렬
		// 4. 퀵 정렬
		// 5. ....
		
		
		int num1 = 5;
		int num2 = 15;
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		int temp = num1; // 여기서는 temp : 5
		num1 = num2; 
		// 여기서 num1 값은 15가 됨
		num2 = temp;
		// 여기서 num1은 이미 15가 되었기때문에 num2가 그대로 동일한 15가 됨
		// 초기값 num1 과 num2를 그대로 교환하고싶다면 임의변수 선언 이용
		// 즉, 2개 의 자리를 바꿀 때에는 임시변수가 꼭 필요함!!!
		System.out.printf("num1 : %d, num2 : %d\n", num1, num2);
		

		
		
		
		int [] nums = {2, 1, 3};
		// 3 2 1이 되도록 바꿔보세요!
		temp = nums[0];
		nums[0] = nums[2]; // 여기서 3, 1, 3 이 됨
		nums[2] = temp; // 여기서 3, 1, 2 가 됨
		
		temp = nums[1];
		nums[1] = nums[2]; // 여기서 3, 2, 2 가 됨
		nums[2] = temp; // 여기서 3, 2, 1 이 됨
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}
