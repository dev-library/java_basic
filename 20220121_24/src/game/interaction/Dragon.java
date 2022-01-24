package game.interaction;

public class Dragon {
	// 드래곤은 hp, atk 을 가집니다.
	private int hp;
	private int atk;
	
	// 생성자는 드래곤에게 hp는 10, atk는 5를 부여합니다.
	public Dragon() {
		this.hp = 10;
		this.atk = 5;
	}
	
	// doBattle() 메서드를 만들겠습니다.
	// 유저의 공격력(uAtk)을 입력받아 드래곤의 체력을 차감합니다.
	public void doBattle(int uAtk) {
		this.hp -= uAtk;
		System.out.println("드래곤의 남은 체력 : " + this.hp);
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
