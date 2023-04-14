
public class IdentifierExample {

	public static void main(String[] args) {
		// 자바의 식별자 이름은 대/소문자를 구분함
		int age = 20;
		int AgE = 30;
		
		System.out.println(age);
		System.out.println(AgE);
		
		// 식별자 이름은 숫자로 시작하지 않게 해 주세요.
		int number9 = 9;
		//int 9number = 9;
		
		// 식별자의 이름에는 공백이 포함될 수 없습니다.
		int birthDay = 1009;
		//int birth Day = 1009;
		
		// 키워드(예약어, 보라색 글씨)는 식별자로 사용 불가
		//int static = 50;

	}

}
