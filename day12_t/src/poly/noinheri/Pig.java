package poly.noinheri;

public class Pig {
	// 필드 : hp, atk, def
	private int hp;
	private int atk;
	private int def;
	
	// 체력 10, 공격력 2, 방어력 0으로 설정
	public Pig() {
		this.hp = 10;
		this.atk = 2;
		this.def = 0;
	}

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

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public boolean isPigActive() {
		return hp > 0 ? true : false;
	}
	
	// 공격받은뒤에 살아있는지 죽었는지 체크
	public boolean isAttackedPigActive(int userAtk) {
		return (hp - userAtk) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	}
}
