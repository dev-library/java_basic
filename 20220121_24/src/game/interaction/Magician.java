package game.interaction;

public class Magician {
	// Magician의 특성으로
	// 체력(hp), 마나(mp), 공격력(atk), 경험치(exp), 레벨(lv)를 넣어주세요
	private int hp;
	private int mp;
	private int atk;
	private int exp;
	private int lv;
	
	// 생성자를 생성해서 아무것도 입력받지 않고
	// 체력은 15, 마나는 15, 공격력은 3, 레벨은 1, 경험치는 0이 자동입력되게 해주세요.
	public Magician() {
		this.hp = 15;
		this.mp = 15;
		this.atk = 3;
		this.lv = 1;
		this.exp = 0;
	}
	
	// 오크와 교전할 수 있도록 huntOrc()를 만들어보겠습니다.
	public void huntOrc(Orc orc) {
		// orc의 체력을 검사해서 0 이하라면 공격 없이
		// 오크가 이미 죽은 상태입니다. 라는 멘트만 뜨고 
		// 메서드가 종료되게 해주세요.
		if(orc.getHp() <= 0) {// 교전 전에 이미 죽은 상태
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
		
		// orc의 doBattle을 호출해 먼저 오크 체력을 깎고
		orc.doBattle(this.atk);
		
		// 오크가 마법사의 공격으로 죽은 경우 경험치를 10 더해주시고
		// 오크가 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		if(orc.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("오크를 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("마법사의 경험치 : " + this.exp);
		}else {
			// 오크 공격력만큼 자신의 체력을 차감해줍니다.
			this.hp -= orc.getAtk();			
		}

		System.out.println("마법사의 남은 체력 : " + this.hp);
	}
	
	public void fireBall(Orc orc) {
		// orc의 체력을 검사해서 0 이하라면 공격 없이
		// 오크가 이미 죽은 상태입니다. 라는 멘트만 뜨고 
		// 메서드가 종료되게 해주세요.
		if(orc.getHp() <= 0) {// 교전 전에 이미 죽은 상태
			System.out.println("오크가 이미 죽은 상태입니다.");
			return;
		}
		
		// orc의 doBattle을 호출해 먼저 오크 체력을 깎고
		orc.doBattle(this.atk * 2);
		System.out.println("마법사가 파이어볼을 날렸습니다.");
		// 파이어볼은 특수스킬이므로 자신의 마나를 3 깎씁니다.
		this.mp -= 3;
		// 오크가 마법사의 공격으로 죽은 경우 경험치를 10 더해주시고
		// 오크가 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		if(orc.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 10;
			System.out.println("오크를 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("마법사의 경험치 : " + this.exp);
		}else {
			// 오크 공격력만큼 자신의 체력을 차감해줍니다.
			this.hp -= orc.getAtk();			
		}

		System.out.println("마법사의 남은 체력 : " + this.hp);
	}
	
	public void fireBall(Troll troll) {
		// orc의 체력을 검사해서 0 이하라면 공격 없이
		// 오크가 이미 죽은 상태입니다. 라는 멘트만 뜨고 
		// 메서드가 종료되게 해주세요.
		if(troll.getHp() <= 0) {// 교전 전에 이미 죽은 상태
			System.out.println("트롤이 이미 죽은 상태입니다.");
			return;
		}
		
		// troll의 doBattle을 호출해 먼저 트롤 체력을 깎고
		troll.doBattle(this.atk * 2);
		System.out.println("마법사가 파이어볼을 날렸습니다.");
		// 파이어볼은 특수스킬이므로 자신의 마나를 3 깎씁니다.
		this.mp -= 3;
		// 트롤이 마법사의 공격으로 죽은 경우 경험치를 10 더해주시고
		// 트롤이 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		if(troll.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 25;
			System.out.println("트롤이 죽였습니다. 경험치가 10 올랐습니다.");
			System.out.println("마법사의 경험치 : " + this.exp);
		}else {
			// 트롤의 공격력만큼 자신의 체력을 차감해줍니다.
			this.hp -= troll.getAtk();			
		}

		System.out.println("마법사의 남은 체력 : " + this.hp);
	}
	
	// 드래곤와 교전할 수 있도록 huntDragon()를 만들어보겠습니다.
	public void huntDragon(Dragon dragon) {
		if(dragon.getHp() <= 0) {// 교전 전에 이미 죽은 상태
			System.out.println("드래곤이 이미 죽은 상태입니다.");
			return;
		}
		
		// dragon의 doBattle을 호출해 먼저 드래곤의 체력을 깎고
		dragon.doBattle(this.atk);
		
		// 드래곤이 마법사의 공격으로 죽은 경우 경험치를 50 더해주시고
		// 드래곤이 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		if(dragon.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 50;
			System.out.println("드래곤을 죽였습니다. 경험치가 50 올랐습니다.");
			System.out.println("마법사의 경험치 : " + this.exp);
		}else {
			// 드래곤 공격력만큼 자신의 체력을 차감해줍니다.
			this.hp -= dragon.getAtk();			
		}

		System.out.println("마법사의 남은 체력 : " + this.hp);
	}
	
	// 드래곤와 교전할 수 있도록 huntTroll()를 만들어보겠습니다.
	public void huntTroll(Troll troll) {
		if(troll.getHp() <= 0) {// 교전 전에 이미 죽은 상태
			System.out.println("트롤이 이미 죽은 상태입니다.");
			return;
		}
		
		// troll의 doBattle을 호출해 먼저 드래곤의 체력을 깎고
		troll.doBattle(this.atk);
		
		// 트롤이 마법사의 공격으로 죽은 경우 경험치를 25 더해주시고
		// 트롤이 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		if(troll.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 25;
			System.out.println("트롤을 죽였습니다. 경험치가 25 올랐습니다.");
			System.out.println("마법사의 경험치 : " + this.exp);
		}else {
			// 트롤의 공격력만큼 자신의 체력을 차감해줍니다.
			this.hp -= troll.getAtk();			
		}

		System.out.println("마법사의 남은 체력 : " + this.hp);
	}
	
	// 드래곤와 교전할 수 있도록 huntTroll()를 만들어보겠습니다.
	public void huntRabbit(Rabbit rabbit) {
		if(rabbit.getHp() <= 0) {// 교전 전에 이미 죽은 상태
			System.out.println("토끼가 이미 죽은 상태입니다.");
			return;
		}
		
		// troll의 doBattle을 호출해 먼저 토끼의 체력을 깎고
		rabbit.doBattle(this.atk);
		
		// 토끼가 마법사의 공격으로 죽은 경우 경험치를 25 더해주시고
		// 토끼가 죽었습니다. 라는 멘트가 뜨고 메서드가 종료되게 해주세요.
		if(rabbit.getHp() <= 0) {// 교전 후에 죽었는지 여부 검사
			this.exp += 25;
			System.out.println("토끼를 죽였습니다. 경험치가 5 올랐습니다.");
			System.out.println("마법사의 경험치 : " + this.exp);
		}else {
			// 토끼의 공격력만큼 자신의 체력을 차감해줍니다.
			this.hp -= rabbit.getAtk();			
		}

		System.out.println("마법사의 남은 체력 : " + this.hp);
	}
	
	
	// 타 몬스터쪽에서 마법사 스탯을 조회할 수 있도록 Getter/Setter를 만들어주세요.
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

}
