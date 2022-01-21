
public class Assignment01P80 {

	public static void main(String[] args) {
		// 대입연산자란 특정 변수 값을 연산자 우측에 해당하는 값을 이용해
		// 연산한 결과값으로 계산해 저장하는 기능을 수행합니다.
		// 단순 연산자인 =이 있으며, 추가로 확장된
		// 복합대입연산자로 +=, -=, /=, *=, %= 등이 있습니다.
		// 대입 연산자를 사용하는 경우 코드 실행방향이 오른쪽에서 왼쪽입니다.
		int a = 10;
		System.out.println(a);
		a += 10;//a = a + 10;// a를 10만큼 증가시켜 저장하는 코드
		System.out.println(a);
		a -= 5;//a = a - 5;// a를 5만큼 감소시켜 저장하는 코드
		System.out.println(a);
		a *= 3;//a = a * 3;// a를 3배 증가시켜 저장하는 코드
		System.out.println(a);
		a /= 4;//a = a / 4;// a를 4(정수)로 나눠서 저장하는 코드 
		System.out.println(a);
		a %= 12;//a = a % 12; // a 를 12 나머지 연산해 저장하는 코드
		System.out.println(a);
	}
}