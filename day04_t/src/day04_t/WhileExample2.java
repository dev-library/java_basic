package day04_t;

public class WhileExample2 {

	public static void main(String[] args) {
		// 무한루프는 어떻게 판단해도 "참" 이 나올수밖에없는
		// 조건식을 while문 조건식에 집어넣으면 만들어집니다.
		// 자연적으로는 절대 종료되지 않으므로 강제로 종료버튼을 눌러야 해결됩니다.
		
		while(true) {
			System.out.println("자연적으로 끝나지 않는 무한루프!!!");
		}

	}

}
