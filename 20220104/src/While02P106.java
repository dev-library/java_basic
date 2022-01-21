
public class While02P106 {

	public static void main(String[] args) {
		// while문의 조건식이 어떻게 해석해도 무조건 true로 판단되는 조건식을 넣으면
		// 절대 끝나지 않는 무한루프문이 됩니다.
		// 이 경우 강제탈출구문인 break를 써야만 종료할 수 있습니다.
		int count = 0;
		while(true) {
			count += 1;
			System.out.println("반복문 실행중입니다." + count);
		}
	}
}
