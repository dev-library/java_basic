package day08_t;

public class BasketballPlayerMain {

	public static void main(String[] args) {
		// 농구선수를 둘 만들어주세요.
		// 하나는 덩크슛에 성공하게
		// 하나는 실패하게 만들어주세요.
		BasketballPlayer b1 = new BasketballPlayer("김농구", 10, 199, 200000000);
		BasketballPlayer b2 = new BasketballPlayer("박슈팅", 20, 170, 100000000);
				
		b1.showInfo();
		
		b1.dunkShoot();
		
		b2.showInfo();
		
		b2.dunkShoot();

	}

}
