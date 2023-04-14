package poly.instanceof_;

public class Human {
	
	private String name;
	private int age;
	
	// 생성자를 만들어주세요.
	// name, age를 파라미터로 전달받아 초기화해주세요.
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 만약 void 파라미터로 생성자 호출시
	// "noname", 0을 이름과 나이로 초기화하는 생성자도 만들어주세요.
	public Human() {
		this("noname", 0);
	}
	
	// showInfo()를 만들어주세요. 이름과 나이를 콘솔에 찍어줍니다.
	public void showInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("-------------------");
	}
	

}
