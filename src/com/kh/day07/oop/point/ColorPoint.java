package com.kh.day07.oop.point;

import com.kh.day07.oop.point.Point;

	public class ColorPoint extends Point {
		private String color;
		
		public ColorPoint() {
			super();
		}
		
		public ColorPoint(int x, int y, String color) {
//			super.x = x;
//			super.y = y;
			super(x, y); // 부모의 생성자라는 의미(super)
			this.color = color;
		}
		
		public void setColor(String color) {
			this.color = color;
//			System.out.print(color);
//			showPoint();
		}
		public void showColorPoint() {
			System.out.print(color);
			super.showPoint(); // 부모에게서 옴
		}
}
