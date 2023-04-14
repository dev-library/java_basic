package day03;

public class AssignmentExample {

	public static void main(String[] args) {
		// 선언과 초기화는 한 줄에 하셔도 됩니다.
		int a = 5, b = 5;
		
		// 확장 대입연산자는 해당 연산의 결과를 변수에 즉시 저장합니다.
		// 우측에 일반 대입연산자를 이용해 대입하는 구문도 같이두겠습니다.
		a += 3; // a = a + 3; // a에 3만큼 더한 값을 저장하는 구문
		System.out.println(a);
		
		// 여러분들이 b변수를 이용해 /=, %=만 한 번 테스트해보세요.
		b /= 4;// b = b / 4;
		System.out.println(b);
		
		b %= 21; // b = b % 21;
		System.out.println(b);
		
	}
}
