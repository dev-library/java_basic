package polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// 부모 타입인 Person으로 자식인 Student까지 받을 수 있음
		Person p1 = new Person("나사람", 10);
		Person s1 = new Student("나학생", 20, 99);

		// p1과 s1의 showPerson은 다르게 돌아갑니다.
		p1.showPerson();//Person측 showPerson()
		System.out.println("--------------");
		s1.showPerson();//Stdunet측 showPerson();
		
		// s1을 이용해 신분밝히기용 메서드를 호출해보세요.
		// s1은 Person타입이므로 Person에 소속된
		// 자원들만 호출할 수 있습니다.
		//s1.showStudent();
		
	}
}
