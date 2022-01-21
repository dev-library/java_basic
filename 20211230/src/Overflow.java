
public class Overflow {

	public static void main(String[] args) {
		// 오버플로우는 표현할 수 있는 최대 숫자를 넘겨서 표현하면
		// 그 자료형으로 표현할 수 있는 최소값으로 초기화되는 현상을 의미합니다.
		// 아래와 같이 -128 ~ 127 사이의 범위를 표현할 수 있는 byte의 최대 값인
		// 127을 넘겨버리면 최소 표현값인 -128부터 다시 수가 잡히는것을 볼 수 있습니다.
		byte a = 127;
		byte b = 1;
		System.out.println((byte)(a + b));
		
		// 언더플로우는 반대로 표현할 수 있는 최소 숫자보다 작은 숫자로 만들면
		// 최대값으로 초기화되는 현상을 의미합니다.
		byte c = -128;
		byte d = -1;
		System.out.println((byte)(c + d));
	}
}
