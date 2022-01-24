package polymorphism;

public class PetCakeCooker extends Person {
	
	private String ingre;//재료
							// 개잌		20			연어
	public PetCakeCooker(String name, int age, String ingre) {
		super(name, age);
		this.ingre = ingre;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("케잌 재료 : " + ingre);
	}
	
	public void cook() {
		System.out.println("강아지 케잌 제작 완료!");
	}
}
