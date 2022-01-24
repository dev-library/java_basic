package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		// 개발자 생성 및 정보조회, Person으로 개발자를 받음
		Developer d1 = 
				new Developer("나개발", 10, "자바");
		PetCakeCooker p1 = 
				new PetCakeCooker("개잌", 20, "연어");
		
		d1.showPerson();
		p1.showPerson();
		System.out.println("----------------");
		d1.dev();
		p1.cook();
		
		
	}
}
