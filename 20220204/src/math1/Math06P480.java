package math1;

public class Math06P480 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random() 을 이용해 1/3확률로 가위,바위,보를 부여받으며
		// 가위 > 보, 바위 > 가위, 보 > 가위의 상성을 가집니다.
		// 같은 요소가 나오면 무승부입니다.
		// 힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서 
		// 조건식에 ||을 사용합니다.
		
		// 0 = 가위, 1 = 바위, 2 = 보
		// 0 > 2, 1 > 0, 2 > 1
		int myValue = (int)(Math.random() * 3);
		int comValue = (int)(Math.random() * 3);
		
		// 상수를 처리하는 부분
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2;
		
		if((myValue == SCISSORS && comValue == PAPER) || 
				(myValue == ROCK && comValue == SCISSORS) || 
				(myValue == PAPER && comValue == ROCK)) {
					System.out.println("내가 이겼습니다.");
			} else if ((myValue == PAPER && comValue == SCISSORS) || 
						(myValue == SCISSORS && comValue == ROCK) || 
						(myValue == ROCK && comValue == PAPER)) {
					System.out.println("컴퓨터가 이겼습니다.");
			} else if (myValue == comValue) {
					System.out.println("무승부입니다.");
			}
			
			// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
			String[] items = {"가위", "바위", "보"};
			
			// 내가 낸 것과 컴퓨터가 낸 것을 출력해주는 부분
			System.out.println("내가 낸 것 :" + items[myValue]);
			System.out.println("컴퓨터가 낸 것 :" + items[comValue]);	
		}
		/*
		// 가장 기본적으로 생각하기 쉬운 결과 도출
		if(myValue == 0 && comValue == 2) {
			// 내가 가위(0)을 뽑았고, 컴퓨터가 보(2)를 뽑은경우
			System.out.println("내가 승리했습니다.");
			System.out.println("내가 뽑은것 : 가위(0)");
			System.out.println("컴퓨터가 뽑은것 : 보(2)");
		} else if(myValue == 1 && comValue == 0) {
			// 내가 바위(1)를 뽑았고, 컴퓨터가 가위(0)을 뽑은 경우
			System.out.println("내가 승리했습니다.");
			System.out.println("내가 뽑은것 : 바위(1)");
			System.out.println("컴퓨터가 뽑은것 : 가위(0)");
		} else if(myValue == 2 && comValue == 1) {
			// 내가 보(0)을 뽑고, 컴퓨터가 바위(1)을 뽑은 경우
			System.out.println("내가 승리했습니다.");
			System.out.println("내가 뽑은것 : 보(2)");
			System.out.println("컴퓨터가 뽑은것 : 바위(1)");
		} else if(comValue == 0 && myValue == 2){
			// 컴퓨터가 가위(0)을 뽑았고, 내가 보(2)를 뽑은경우
			System.out.println("컴퓨터가 승리했습니다.");
			System.out.println("내가 뽑은것 : 보(2)");
			System.out.println("컴퓨터가 뽑은것 : 가위(0)");
		} else if(comValue == 1 && myValue == 0){
			// 컴퓨터가 바위(1)을 뽑았고, 내가 가위(0)를 뽑은경우
			System.out.println("컴퓨터가 승리했습니다.");
			System.out.println("내가 뽑은것 : 가위(0)");
			System.out.println("컴퓨터가 뽑은것 : 바위(1)");
		} else if(comValue == 2 && myValue == 1){
			// 컴퓨터가 보(2)을 뽑았고, 내가 바위(1)를 뽑은경우
			System.out.println("컴퓨터가 승리했습니다.");
			System.out.println("내가 뽑은것 : 바위(1)");
			System.out.println("컴퓨터가 뽑은것 : 보(2)");
		} else if(myValue == comValue) {
			System.out.println("비겼습니다.");
		}
		*/
}
