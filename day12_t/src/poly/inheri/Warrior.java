package poly.inheri;

public class Warrior {
	// 정보은닉 적용
	private String id;
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior(String id) {
		this.id = id;
		this.hp = 20;
		this.atk = 3;
		this.def = 1;
		this.exp = 0;
	}
	
	public void showStatus() {
		System.out.println("아이디 : " + this.id);
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
		System.out.println("획득경험치 : " + this.exp);
		System.out.println("-----------------------");
	}
	
	// 파라미터로 모든 몬스터의 부모인 Monster를 선언하면
	// 다형성 원리에 의해서 상속받은 모든 몬스터가 대입 가능합니다.
	public void hunt(Monster monster) {
		
		// 죽은 몬스터는 교전 불가 및 종료
		if(monster.getHp() <= 0) {
			System.out.println("이 몬스터는 이미 죽어서 교전할 수 없습니다.");
			return;
		}
		if(monster.getHp() - this.atk <= 0) {
		// 몬스터가 다음공격에 죽으면 플레이어에게 경험치 부여
			monster.setHp(monster.getHp() - (this.atk - monster.getDef()));
			System.out.println("몬스터가 죽었습니다.");
			this.exp += monster.getExp();
		} else {
		// 몬스터가 다음 공격에 죽지는 않으면 반격해 플레이어 체력 차감
			monster.setHp(monster.getHp() - (this.atk - monster.getDef()));
			this.hp -= monster.getAtk();
			// day13_t의 패치내역을 12에도 적용
			/*
			if(monster.getAtk() > 0 && (monster.getAtk() - this.def) < 1) {
				this.hp -= 1;
			}else if(monster.getAtk() == 0) {
				return;
			}else {
				this.hp = this.hp - (monster.getAtk()- this.def);
			}*/
			System.out.println("몬스터가 반격했습니다.");
		}
	}
	
	
}



