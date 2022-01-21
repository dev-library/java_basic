package structure;

public class Structure01P190 {

	public static void main(String[] args) {// 실행부
		// 이제부터는 실행코드와 정의(define)코드를 분리합니다.
		// main이 있는 클래스는 실행코드만 관리하고
		// 실제 로직은 다른 .java 파일에 저장합니다.

		// 커스텀 디자인 자료형은
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		Person p1 = new Person();
		// p1내부의 정의된 변수들을
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name = "채종훈";
		p1.age = 20;
		p1.pNum = "01012345678";
		p1.uNum = 32;
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.pNum);
		System.out.println(p1.uNum);
		// 또 다른 사람 p2를 생성해주세요.
		Person p2 = new Person();
		// p2의 name, age, pNum, uNum을
		// 부여해서 콘솔에 찍어주세요.
		p2.name = "채죵휸";
		p2.age = 22;
		p2.pNum = "01099998888";
		p2.uNum = 23;
		System.out.println(p2.name + "의 정보입니다.");
		System.out.println("이름 : " + p2.name + ", 나이 : " + p2.age + ", 연락처 : " + p2.pNum + ", 번호 : " + p2.uNum);
	}
}
