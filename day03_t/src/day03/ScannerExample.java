package day03;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// 스캐너란 프로그램 실행 후 사용자에게 입력을 받는 기능을 가졌습니다.
		
		// 1. 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 2. 스캐너 클래스가 가진 입력 기능을 이용해 값을 입력받음
		System.out.println("이름을 입력해주세요!");
		String userName = scan.next();// int를 입력받을때는 scan.nextInt()가 우변에 옵니다.
		
		System.out.println("안녕하세요!" + userName + " 님!");
		
		// 3. 사용한 스캐너는 종료시킵니다.
		scan.close();
	}

}
