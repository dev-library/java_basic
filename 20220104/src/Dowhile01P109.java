
public class Dowhile01P109 {

	public static void main(String[] args) {
		// do ~ while 구문은 while문과 기본적인 동작 원리는 같습니다.
		// 단, 첫 번째 바퀴는 조건비교 없이 바로 실행하고
		// 두 번재 바퀴부터 조건비교를 통해 추가 실행 여부를 결정합니다.
		int a = 1;
		
		do {// do 구문을 먼저 쓰고 하단에 while문을 적습니다.
			a += 2;
			System.out.println("a는 1보다 작나요?");
		}while(a < 1); // 일반 while문과 달리 끝나는 지점에 ;를 붙입니다.
	}
}
