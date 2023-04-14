package poly.inheri;

public class MainClass1 {

	public static void main(String[] args) {
		Warrior w1 = new Warrior("자바자바");
		
		Rat rat1 = new Rat();
		Rabbit ra1 = new Rabbit();
		
		w1.showStatus();
		
		w1.hunt(rat1);
		w1.hunt(ra1);
		
		w1.showStatus();
		
		w1.hunt(rat1);
		w1.hunt(rat1);
		
		w1.showStatus();

	}

}
