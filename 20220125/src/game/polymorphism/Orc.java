package game.polymorphism;

// Monster를 상속하게 해 주세요.
public class Orc extends Monster {

	// Orc는 생성자를 통해 체력 5, 공격력 2를 갖습니다.
	// 입력받지 않고 고정된 수치로 생성됩니다.
	public Orc() {
		super(5, 2, "오크", 30);
	}
}
