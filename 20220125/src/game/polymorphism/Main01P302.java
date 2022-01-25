package game.polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// Warrior하나, Orc하나를 생성해주세요.
		// 생성 후 교전까지 해주세요.
		Warrior w1 = new Warrior("나전사");
		Orc o1 = new Orc();
		
		w1.hunt(o1);
		System.out.println("------------");
		w1.hunt(o1);
		System.out.println("------------");
		w1.hunt(o1);
		
		System.out.println("-------------");
		Ghost g1 = new Ghost();
		w1.hunt(g1);
		System.out.println("-------------");
		w1.hunt(g1);
		System.out.println("-------------");
		w1.hunt(g1);	
	}
}
