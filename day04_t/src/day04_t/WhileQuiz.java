package day04_t;

import java.util.Scanner;

public class WhileQuiz {

	public static void main(String[] args) {
		// 컴퓨터랑 스무고개 수 맞추기를 해보겠습니다.
		int count = 1;
		
		// 스캐너를 생성해주세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("최대 범위가 될 숫자를 입력해주세요.");
		int maxValue = scan.nextInt() + 1;
		
		
		// 이 프로그램은 먼저 Math.random()을 이용해서 수를 하나 얻습니다.
		int comValue = (int)(Math.random() * maxValue);// 0 ~ maxValue-1 숫자 하나 선택됨 
		
		
		System.out.println("0 ~ " + (maxValue - 1) + " 사이의 숫자를 입력해주세요.");
		// 사용자에게 숫자를 입력받게 해 주세요.

		// 자바에서는 연속해서 변수를 선언하는것이 불가능하므로
		// 반복문 바깥에서 선언해주고, 반복문 내부에서는 선언된 변수 값을 바꿔넣기만 한다.
		int userValue = -1;
		
		do {
			userValue = scan.nextInt();
		}while(userValue > (maxValue - 1) || userValue < 0);
		
		// 컴퓨터의 값과 유저의 값이 일치해야만 종료하므로, 불일치시엔 계속 진행하도록 처리
		while(comValue != userValue) {
			count += 1;
			// 불일치라면 먼저 업인지, 다운인지 알려주기
			// comValue와 userValue의 비교를 통해 업/다운을 판단할 수 있다.
			if(comValue > userValue) {
				System.out.println("업입니다.");
			}else {
				System.out.println("다운입니다.");
			}
			// 사용자한테 userValue를 다시 입력받기
			System.out.println("다시 입력해주세요.");
			do {
				userValue = scan.nextInt();
			}while(userValue > (maxValue - 1) || userValue < 0);
			
		}// while
		System.out.println("정답입니다!");
		System.out.println("시도 횟수 : " + count);
		
	}

}
