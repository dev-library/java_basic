package random1;

import java.util.Random;

public class Random03P484 {

	public static void main(String[] args) {
		// Random 클래스의 nextInt()는 나올 숫자 범위를 지정할 수 있습니다.
		// 바로 정수로 나오기 때문에 코드가 좀 더 간결합니다.
		Random random = new Random();
		
		// 범위 입력을 안하면 int범위 -21억 ~ +21억 사이의 숫자가 랜덤하게 나옵니다.
		int result = random.nextInt();
		System.out.println(result);
		
		// 따라서 정수 숫자 하나(n)를 파라미터로 넣어줘야 0 <= 결과값 < n이 나옵니다.
		int result2 = random.nextInt(5); // 0, 1, 2, 3, 4 중 하나가 나옴
		System.out.println(result2);
	}
}
