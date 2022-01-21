
public class Variable02P30 {
	
	// main 메서드를 생성해보세요
	public static void main(String[] args) {
		// 변수의 선언 2
		int b, c; // 동시에 2개 이상도 선언 가능하다. 지금은 b, c 박스가 동시에 생성되었다.
		b = 10; // b박스에 10을 넣는다.
		c = 15; // c박스에 15를 넣는다.
		
		// 선언과 동시에 값을 넣어줄 수도 있다.
		int a = 5; // a라는 박스를 생성하면서 거기에 정수 5를 넣겠다.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		// a에 있던 값을 20으로 갱신
		a = 20;
		System.out.println(a);
	}
}
