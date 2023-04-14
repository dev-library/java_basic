package day05_t;

import java.util.Scanner;

public class ForStarQuiz2 {
	// *****
	// ****
	// ***
	// **
	// *
	public static void main(String[] args) {
		// boj 2440
		// 역으로 5개부터 1개로 줄어드는 별찍기를 하려면
		// 바깥쪽 for문이 5부터 시작해서 1까지 도달하도록 해야 합니다.
		
		// 백준 문제에 적합하게 층수를 입력받도록 개조해주세요.
		Scanner scan = new Scanner(System.in);
		int starTowerFloor = scan.nextInt();
		scan.close();
					// 층수 제어
		for(int i = starTowerFloor; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
