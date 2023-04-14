package example.override;

public class OverrideExample {

	public static void main(String[] args) {
		// 학생 클래스의 인스턴스를 생성해주세요.
		Student s1 = new Student();
		
		s1.name = "김자바";
		s1.age = 21;
		s1.major = "컴퓨터과학";
		
		s1.자기소개하기();
		s1.코딩하기();
		
		// 프로그래머 클래스의 인스턴스를 생성합니다.
		Programer p1 = new Programer();
		
		p1.name = "박학생";
		p1.age = 39;
		p1.devLang = "자바";
		p1.jobYear = 5;
		
		p1.자기소개하기();
		p1.코딩하기();
		
		
	}
	
}
