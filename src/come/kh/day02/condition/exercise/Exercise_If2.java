package come.kh.day02.condition.exercise;

import java.util.Scanner;

public class Exercise_If2 {
	public static void main(String [] args)
	{
		//switch 문을 이용하여 
		//커피 메뉴의 가격을 알려주는 프로그램을 작성하라. 
		//에스프레소, 카푸치노, 카페라떼는 3500원이고, 
		//아메리카노는 2000원이다.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("커피 메뉴 :");
		System.out.println("에스프레소");
		System.out.println("카푸치노");
		System.out.println("카페라떼");
		System.out.println("아메리카노");
		System.out.println("원하시는 커피 메뉴를 입력해주세요 : ");
		
		String menu = scanner.next();
		int price = 0;
		
		switch(menu) {
		case "에스프레소" :
		case "카푸치노" :
		case "카페라떼" : 
			price = 3500;
			break;
		case "아메리카노" : 
			price = 2000;
			break;
		default : System.out.println("없는 메뉴입니다.");
		}
		System.out.println(price + "원입니다.");
	}
}
		
		
//		int choice = scanner.nextInt();
//		
//		int price;
//		
//		switch (choice) {
//			case 1:
//			case 2:
//			case 3:
//				price = 3500;
//				break;
//			case 4:
//				price = 2000;
//				break;
//			default:
//				System.out.println("1번부터 4번사이의 메뉴를 골라주세요");
//				return;
//		}
//		
//		System.out.println("선택하신 커피 메뉴의 가격은 " + price + " 원 입니다.");
//	}
//}
