package poly.inheri;

public class Rat extends Monster {

	public Rat() {
		super("쥐", 5, 1, 0, 80);
	}
	
	public void 특수공격() {
		System.out.println("쥐가 내구력을 깎습니다.");
	}

}
