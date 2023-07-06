package com.kh.day09.exercise;

import java.util.StringTokenizer;

public class Exercise_StringTokenizer {
	public static void main(String[] args) {
		// 홍길동/장화/홍련/콩쥐/팥쥐 의 문자열 데이터를
		// '/' 기준으로 잘라서 홍련만 출력하시오.
		// (1) 전체출력
		// (2) 홍련만 출력
		String data = "홍길동/장화/홍련/콩쥐/팥쥐";
		StringTokenizer tokenizer = new StringTokenizer(data, "/");
		
		while (tokenizer.hasMoreTokens()) {
//			System.out.println(tokenizer.nextToken());
			String token = tokenizer.nextToken();
			
			if (token.equals("홍련")) {
				System.out.println(token);
				break;
			}
		}
	}
}
