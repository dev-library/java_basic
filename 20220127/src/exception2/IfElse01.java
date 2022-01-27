package exception2;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		// int a, b에 스캐너로 각각 정수를 입력받아주세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("1번 정수를 입력해주세요.");
		int a = scan.nextInt();
		System.out.println("2번 정수를 입력해주세요.");
		int b = scan.nextInt();
		// a / b의 결과를 콘솔에 띄워주시되
		// a / b를 실행하기 전에
		// b가 0인지 검사해서 0인 경우는
		// a / b를 하지말고 0으로 숫자를 나눌 수 없습니다.
		// 라는 경고만 띄우도록 만들어주세요.
		if(b == 0) {
			System.out.println("0으로 숫자를 나눌 수 없습니다.");
		} else {
			System.out.println(a / b);
		}
	}
}
