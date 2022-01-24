package game.interaction;

public class Main01 {

	public static void main(String[] args) {
		// 전사 하나와 오크하나를 만들어주세요.
		Warrior w1 = new Warrior();
		Orc o1 = new Orc();
		
		//교전을 두 번 시켜주세요.
		w1.huntOrc(o1);
		System.out.println("-------------------");
		w1.huntOrc(o1);
		System.out.println("-------------------");
		w1.huntOrc(o1);

	}
}
