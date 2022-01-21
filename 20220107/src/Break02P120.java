
public class Break02P120 {

	public static void main(String[] args) {
		// 중첩반복문 사용시 안쪽 반복문에 사용하는 break는
		// 전체 다 종료를 시키지 않고
		// 내부 반복문만 종료시키고, 외부 반복문은 계속 실행됩니다.
		// 구구단 출력, 단 n * 4 까지만 출력하는 예시
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단 출력.");
			
			for(int j = 1; j <= 9; j++) {
				if(j > 4) {
					System.out.println("5부터는 직접 알아보세요.");
					break;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println("-----------------");
		}
	}
}
