package game.interaction;

public class Main03 {

	public static void main(String[] args) {
		// 마법사 궁수 하나씩 만들어 교전상태 확인
		Magician m1 = new Magician();
		Archer a1 = new Archer();
		
		Troll t1 = new Troll();
		Dragon d1 = new Dragon();
		Orc o1 = new Orc();
		
		m1.fireBall(o1);
		m1.fireBall(o1);
		m1.fireBall(t1);
		m1.fireBall(t1);
		
		System.out.println("-------------------");
		a1.huntDragon(d1);
		a1.huntDragon(d1);
		a1.huntDragon(d1);
		a1.huntDragon(d1);

	}

}
