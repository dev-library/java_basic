package day08_t;

public class Car {

	public String modelName;//차종
	public int maxPassengers;//최대승객수
	public int currentSpeed;//속도
	public String owner;//차주
	public int gas;//연료량

	// 상수 선언은 final static으로 선언하면 됩니다.
	public final static int BOOST_SPEED = 10; 
	public final static int BREAK_SPEED = 10; 
	
	// 생성자 들어갈 자리
	public Car(String mN, int mP, String own) {
		modelName = mN;
		maxPassengers = mP;
		currentSpeed = 0;
		owner = own;
		gas = 100;
	}
	
	// 가속기능
	public void accelerate() {
		currentSpeed += BOOST_SPEED;
	}
	
	// 감속기능
	public void break_() {
		currentSpeed -= BREAK_SPEED;
	}
	
	// 계기판 조회
	public void showStatus() {
		System.out.println("차종 : " + modelName);
		System.out.println("최대승객수 : " + maxPassengers);
		System.out.println("현재속도 : " + currentSpeed);
		System.out.println("차주 : " + owner);
		System.out.println("연료량 : " + gas);
	}
	
}
