package example.this_.human;

public class Human {
	public String name;
	public int age;
	
	// 생성자 선언(여러분이 this를 써서 이름대로 매칭되게 해 주세요)
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Human(String name) {
		this(name, -1); // 아래 주석처리된 코드로 대체 가능함
		// this.name = name;
		// this.age = -1;
	}
	
	public Human() {
		this("이름없음", -2); // 아래 주석처리된 코드로 대체 가능함
		// this.name = "이름없음"
		// this.age = -2;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + " , 나이 : " + age);
	}
	
}
