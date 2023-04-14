package day06_t;

public class BreakExample2 {

	public static void main(String[] args) {
		/*
		 * 내부 반복문에서 break를 사용하여 바깥쪽 반복문까지
		 * 한 번에 종료시키고 싶다면 외부 반복문에 label을 붙입니다.
		 */
		
		// outer 라는 이름의 label을 외부반복문에 붙이기
		outer : for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5; j++) {
				System.out.println(i + ", " + j);
				if(i == 2 && j == 3) {
					break outer;
				}// if
			}// for j
		}// outer for i

	}

}
