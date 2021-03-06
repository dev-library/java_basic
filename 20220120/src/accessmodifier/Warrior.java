package accessmodifier;

public class Warrior extends Commoner {
					// 전사전사
	public Warrior(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void hunt() {
		setHp(getHp() - 1);
		setExp(getExp() + 10);
		System.out.println("전사가 사냥을 했습니다.");
	}
	
	public void doubleAttack() {
		setHp(getHp() - 4);
		setExp(getExp() + 25);
		System.out.println("전사가 두 번 공격합니다.");
	}
	
	public void getInfo() {
		// 심지어 private는 수정만 안되는게 아니라 조회도 불가능합니다.
		// 따라서 getter를 이용해 상태를 조회할 수 있게 해주세요.
		System.out.println("현재 체력 : " + getHp());
		System.out.println("현재 마나 : " + getMp());
		System.out.println("현재 레벨 : " + getLv());
		System.out.println("현재 경험치 : " + getExp());
		System.out.println("현재 유저명 : " + getName());
	}
	
}
