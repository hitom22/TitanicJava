package come.kh.day05.oop;

class Sample {
	public int a;  // 모든 곳에서 접근 가능 - public은 쓸때 잘 써야됨
	private int b; // 자신에서만 접근 가능
	int c; // default 라고 한다.(아무것도 안쓰는 것) 
}

public class Exam_Access {

	public static void main(String[] args) 
	{
		Sample sample = new Sample();
		sample.a = 5;
		//sample.b = 15;
		// The field Sample.b is not visible
		// "멤버변수 b는 private이기 때문에 보이지 않아 접근할 수 없습니다."
		sample.c = 10; // default는 접근가능, 왜냐하면 같은 패키지이기 때문에
	}

}
