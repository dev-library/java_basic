package math1;

public class Math04P480 {

	public static void main(String[] args) {
		// Math.random()은 0이상 1미만인 난수를 구해줍니다.
		double a = Math.random();
		System.out.println(a);

		// 15% 확률로 "강화에 성공했습니다", 85% 확률로 "강화에 실패했습니다" 라고 출력하는
		// 코드를 20번 반복하는 코드를 아래에 작성해주세요.
		// 20번 반복하는 for문 내부에 if~else문을 작성해서 구현합니다.
		for(int i = 0; i < 20; i++) {
			if(Math.random() <= 0.15) {
				System.out.println("강화에 성공했습니다.");
			} else {
				System.out.println("강화에 실패했습니다.");
			}
		}
		
		// 범위를 제한하는 경우(정수 0이상 6미만)
		int b = (int)(Math.random() * 6);
		System.out.println(b);
		
	}

}
