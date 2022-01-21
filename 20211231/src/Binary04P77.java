
public class Binary04P77 {

	public static void main(String[] args) {
		// 비트 이동 연산자는 숫자 >> (<<) 자리수 문법을 사용합니다.
		// 꺽쇠의 방향이 <<인 경우는 왼쪽 자리수만큼 밀어줍니다.
		// 이 때 정수 숫자는 2의 자리수 제곱만큼 증가합니다.
		// 반대방향인 경우는 2의 자리수 제곱만큼 줄어든 값이 됩니다.
		int a = 80;
		System.out.println(a >> 3);
		// 이동 결과에 a가 저장되지는 않음.(a가 10으로 줄어들어 저장되지는 않음)
		System.out.println(a << 3);

	}

}
