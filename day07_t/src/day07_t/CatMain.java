package day07_t;

public class CatMain {

	// 고양이를 조회하는 용도로 사용할 전용 메서드를 작성해보겠습니다.
	public static void showCatInfo(Cat cat) {
		System.out.println("고양이 이름 : " + cat.name);
		System.out.println("고양이 나이 : " + cat.age);
		System.out.println("고양이 품종 : " + cat.kind);
		System.out.println("고양이 색깔 : " + cat.color);
	}
	
	public static void main(String[] args) {
		// 고양이를 한 마리 생성해보겠습니다.
		Cat c1 = new Cat();
		
		c1.name = "어완자";
		c1.age = 5;
		c1.kind = "엑조틱숏헤어";
		c1.color = "치즈";
		
		showCatInfo(c1);
		
		// c2, c3를 새롭게 생성해주시고
		// 이 고양이들도 showCatInfo로 조회할때
		// 메모리 구조가 어떻게 전개될지 직접
		// 그려보기까지 해 주세요.
		// c1, c2, c3를 조회하는 각각의 순간
		// 3장의 메모리 구조 그림을 보내주세요.
		Cat c2 = new Cat();
		
		c2.name = "룰루";
		c2.age = 4;
		c2.kind = "스코티시폴드";
		c2.color = "대리석색";

		showCatInfo(c2);
		
		Cat c3 = new Cat();
		
		c3.name = "미미";
		c3.age = 7;
		c3.kind = "코리안숏헤어";
		c3.color = "턱시도";
		
		showCatInfo(c3);

	}

}
