package com.kh.day06.oop.objectarray;

public class Exam_ObjectArray {

	public static void main(String[] args) 
	{
//		Circle c = new Circle();
//		c.radius = 10;
//		double result = c.getArea();
//		System.out.println(result);

		Circle [] cArray;
		cArray = new Circle[5];
//		Circle c = cArray[0];
		System.out.println(cArray[0]); // 아직 '객체'가 안만들어진상태. 
							   // 공간이 출력되니까 'null'이라고 출력 됨.
//		c.radius = 10; (객체할당전이라 오류남)
		cArray[0] = new Circle(); // 이제서야 '객체'가 된 것
		System.out.println(cArray[0]);
		cArray[0].radius = 10;  //cArray라는 배열의 1번째 값에는 10이 들어가 있음.
		
		for(int i=0; i<cArray.length; i++) {
			cArray[i] = new Circle();  // 이때 화살표가 생기는 것임
		}
		cArray[0].radius = 1;
		cArray[1].radius = 2;
		cArray[2].radius = 3;
		cArray[3].radius = 4;
		cArray[4].radius = 5;
		
		System.out.println(cArray[0].getArea());
		System.out.println(cArray[1].getArea());
		System.out.println(cArray[2].getArea());
		System.out.println(cArray[3].getArea());
		System.out.println(cArray[4].getArea());
		
		
	}

}
