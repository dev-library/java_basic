package structure;

public class ClassMain02P196 {

	public static void main(String[] args) {
		// 차 2대 생성
		Car c1 = new Car();
		c1.model = "롤스로이스 팬텀";
		c1.price = 630000000;
		c1.owner = "채종훈";
		
		Car c2 = new Car();
		c2.model = "K5";
		c2.price = 30000000;
		c2.owner = "푸";
		
		// 콘솔에 정보 조회하기
		c1.getInfo();
		c2.getInfo();
	}
}
