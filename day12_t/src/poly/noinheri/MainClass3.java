package poly.noinheri;

public class MainClass3 {

	public static void main(String[] args) {
		// Rat도 2마리 만들어서 한 마리를 사냥하는 상황도 만들어주세요.
		Rat r1 = new Rat();
		Rat r2 = new Rat();
		
		Warrior w1 = new Warrior("자바전사");
		
		w1.showStatus();
		
		w1.huntRat(r1);
		w1.huntRat(r1);
		w1.huntRat(r1);
		
		w1.showStatus();
	}

}
