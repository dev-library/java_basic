package static1;

public class StaticTest {
	// static이 안 붙은 변수는 객체가 개별저긍로 가지는 변수입니다.
	public int num1;
	
	// static(정적)변수는 모든 객체가 공유하는 하나의 변수입니다.
	// static변수는 객체를(new키워드로 자료를)생성하기 전부터 존재합니다.
	public static int num2 = 0;
	
	public StaticTest() {
		this.num1 += 5;
		num2 += 1;
		System.out.println("num1 변수는 변하지 않습니다 : " + num1);
		System.out.println("현재 가입자수 : " + num2 + "명.");
	}
	
	// 메서드 역시 static 키워드가 들어가면 new로 생성하는것 없이 사용 가능합니다.
	public static void check() {
		System.out.println("공용 메서드 체크 완료");
	}	
}
