
public class AndOr01P72 {

	public static void main(String[] args) {
		// 논리 연산자는 둘 이상의 논리식을 나열해서 제시할 때 사용합니다.
		// 논리식1 & 논리식2 의 경우는 양쪽 모두 true인 경우
		// 논리식1 | 논리식2 의 경우는 한 쪽 이상의 논리식이 다 true인 경우
		// 최종 조건식을 true로 판단해줍니다.
		System.out.println((100 > 50) & (30 > 50)); // (참) & (거짓), 최종 결과 : false
		System.out.println(100 > 50 | 30 > 50); // 참 | 거짓, 최종 결과 : true

	}

}
