package come.kh.day02.opeartor;

public class Practice {
	public static void main(String [] args)
	{
		int a = 70;
		int b = 55;
		
		boolean result1 = a == b || a++ < 100;
		//				   false     true
		// a = 71, b = 55, result1 : true
		boolean result2 = a < b && --b < 55;
		//				   false     true
		// a = 71, b = 54, result2 : false
		boolean result3 = a != b && b-- < a++;
		//				   true     54<71 true
		// a = 72, b = 53, result1 : true
		boolean result4 = a++ != b || b++ >= 85;
		//				   true a(73)   false b(54)
		// a = 73, b = 54, result1 : true
		
		System.out.println("Result 1: " + result1);
		System.out.println("Result 2: " + result2);
		System.out.println("Result 3: " + result3);
		System.out.println("Result 4: " + result4);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		
		
	}
}
