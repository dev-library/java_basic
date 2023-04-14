package day03;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		// 1. 스캐너 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 2. 스캐너 클래스가 가진 입력 기능을 이용해 값을 입력받음
		System.out.println("메뉴를 번호로 입력해주세요!");
		System.out.println("1. 카페라떼, 2. 아메리카노, 3. 녹차프라푸치노");
		int order = scan.nextInt();// int를 입력받을때는 scan.nextInt()가 우변에 옵니다.

		switch(order) {
			case 1:
				System.out.println("주문하신 카페라떼가 나왔습니다.");
				break;// break라는 구문을 case의 마지막에 작성해야 코드가 흘러내리지 않습니다.
			case 2:
				System.out.println("주문하신 아메리카노가 나왔습니다.");
				break;
			case 3:
				System.out.println("주문하신 녹차프라푸치노가 나왔습니다.");
				break;// 마지막 case에는 원래 break를 잘 안 달지만, 가독성 문제로 달기도 함.
			default:
				System.out.println("주문하신 상품은 없는 상품입니다.");
		}
		
	}

}
