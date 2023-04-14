package day05_t;

public class BreakExample1 {

	public static void main(String[] args) {
		/*
		 * 무한루프는 보통 break와 조합해 사용합니다.
		 */
		
		int i = 0;
		while(true) {
			if(i==15)
				break;//if, for, while등은 타겟 구문이 1줄인 경우 중괄호 필요 없음!
			System.out.println(i);
			i++;
		}

	}

}
