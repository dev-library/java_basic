package example.override;

public class Student extends Human {

	public String major;
	
	//@Override // 오버라이드 메서드 위에 붙여줘야 했던 어노테이션
	public void 자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + major);
	}
	
	
}
