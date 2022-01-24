package polymorphism;

// Person 상속
public class Developer extends Person {
	
	// 개발언어
	private String devLang;
						//나개발       10         자바
	public Developer(String name, int age, String devLang) {
		super(name, age);
		this.devLang = devLang;
	}
	
	public void showPerson() {
		super.showPerson();// 부모쪽 조회메서드 호출해서 name, age 출력
		System.out.println("개발언어 : " + devLang);// 부모쪽에 없는요소 추가 출력
	}
	
	public void dev() {
		System.out.println("개발자가 개발을 합니다.");
	}
	
}
