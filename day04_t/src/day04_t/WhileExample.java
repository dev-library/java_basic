package day04_t;

public class WhileExample {

	public static void main(String[] args) {
		// while 반복문 로직 파악을 위한 예시
		
		int count = 0; // 더 진행할지 말지 결정할 변수(제어변수라고 호칭합니다.)
		while(count < 3) {
			count++;
			System.out.println("While이 실행중입니다. " + count);
		}

	}

}
