
public class Binary03P75 {

	public static void main(String[] args) {
		// 5 => 00000000 00000000 00000000 00000101
		// 3 => 00000000 00000000 00000000 00000011
		// 비트 연산자는 비트 행 위 아래를 따져서
		// &는 위 아래가 모두 1인경우만 1
		// |는 위 아래가 모두 0인경우만 0
		// ^은 위 아래가 다를때만 1을 부여합니다.
		System.out.println(5 & 3);// 1
		System.out.println(5 | 3);// 7
		System.out.println(5 ^ 3);// 6
	}

}
