package game.interaction;

public class Troll {
	// 트롤은 hp, atk 을 가집니다.
	private int hp;
	private int atk;
	
	// 생성자는 트롤에게 hp는 7, atk는 4을 부여합니다.
	public Troll() {
		this.hp = 7;
		this.atk = 4;
	}
	
	// doBattle() 메서드를 만들겠습니다.
	// 유저의 공격력(uAtk)을 입력받아 트롤의 체력을 차감합니다.
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("트롤의 남은 체력 : " + this.hp);
	}
	
	
	
	
	// getter/setter도 만들어주세요.
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
}
