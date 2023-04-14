package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {
		// 워리어 1 생성 후, 쥐랑도, 토끼랑도 교전
		Warrior w1 = new Warrior("다형성전사");
		/*
		Rabbit r1 = new Rabbit();
		Rat rat1 = new Rat();
		
		w1.showStatus();
		
		w1.hunt(r1);
		w1.hunt(r1);
		
		w1.showStatus();
		
		w1.hunt(rat1);
		w1.hunt(rat1);
		w1.hunt(rat1);
		w1.showStatus();
		*/
		DoKaeBi d1 = new DoKaeBi();
		
		w1.hunt(d1);
		w1.hunt(d1);
		w1.hunt(d1);
		w1.hunt(d1);
		w1.hunt(d1);

		w1.showStatus();
		
	}

}
