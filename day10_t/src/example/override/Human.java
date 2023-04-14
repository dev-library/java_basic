package example.override;

public class Human {

	public String name;
	public int age;
	
	public void 자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
	public void 코딩하기() {
		System.out.println("일반인이라 코딩을 못합니다.");
	}

}
