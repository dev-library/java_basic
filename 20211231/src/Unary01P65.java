
public class Unary01P65 {

	public static void main(String[] args) {
		// 단항 연산자 ++, --
		// ++, --는 숫자의 왼쪽 혹은 오른쪽에 붙을 수 있습니다.
		// 왼쪽에 붙는 경우를 전(前)위 수식, 오른쪽에 붙는 경우를 후(後)위수식이라고 표현하며
		// 어느 방향에 붙냐에 따라 실행 순서가 달라집니다.
		// ++는 대상 변수의 숫자를 1 증가, --는 1 감소시킵니다.
		int a = 1;
		System.out.println(++a);// 전위 수식, 실행 전에 먼저 a값(1)에서 1 증가
		// 1. a값을 먼저 1 증가시킴 : a(1) + 1
		// 2. 증가된 a값(2)를 콘솔에 찍음 : sysout(a(2))
		System.out.println(a);// a값은 1 증가(2)한 채로 유지됨
		
		System.out.println(a++);// 후위 수식, a값(2) 출력 후 1 증가
		// 1. a값(2)를 콘솔에 찍음 : sysout(a(2))
		// 2. a값을 1 증가시킴 : a(2) + 1
		System.out.println(a);
	}

}
