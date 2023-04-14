package day03;

public class TernaryOperatorExample {

	public static void main(String[] args) {
		// 삼항연산자는 (조건식 ? 결과1 : 결과2) 형식으로 작성하며
		// 해당 위치에 조건이 참이면 결과1이, 거짓이면 결과2가 남습니다.
		int height = 115;
		
		String result = (height < 130 ? "무료입장." : "유료입장.");
	
		System.out.println(result);

	}

}
