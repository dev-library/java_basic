
public class AndOr02P72 {

	public static void main(String[] args) {
		// &&, ||은 short circuit(단축 검정) 연산자라고 부릅니다.
		// &, |와 똑같이 작동하되, 왼쪽의 조건식만으로 모든 결과가 확정되면
		// 오른쪽 항은 계산하지 않고 넘어갑니다.
		// 에러가 발생하는 오른쪽 연산(0으로 나누기)를 생략하는지 테스트하기.
		System.out.println((1 + 3 < 4) && (0 < 3 / 0));
		System.out.println((5 > 4) || (0 < 2/0));
	}
}
