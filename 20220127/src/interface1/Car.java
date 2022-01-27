package interface1;

// 인터페이스 구현(상속이 아님!) 하기 위해ㅐ서는
// extends 대신에 implements를 사용합니다.
// 인터페이스 내부의 추상메서드는 무조건 전부 구현해야 합니다.
public class Car implements Vehicle {
	// 자동차라면 가져야 하는 변수 설정
	// 현재속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String name;

	// 생성자를 만들어주세요. 차주만 입력받고
	// 나머지 요소는 현재속도 0, 연료량 70을 자동으로 대입해주세요.
	public Car(String name) {
		this.name = name;
		this.speed = MIN_SPD;
		this.gas = CAR_MAX_GAS;
	}

	@Override
	public void accel() {
		// 한 번 가속시 속도가 10씩 늘어나도록 해 주세요.
		// 연료는 한 번 가속에 1씩 소비합니다.
		// 단, 속도는 200을 초과할 수 없습니다.
		
		if(speed + CAR_INCREASE_SPD > CAR_MAX_SPD) {
			speed = CAR_MAX_SPD;
		}else {
			speed += CAR_INCREASE_SPD;
		}
		gas -= CAR_DECREASE_GAS;
	}

	@Override
	public void breakSpeed() {
		// 한 번 감속시 속도가 10씩 줄어들도록 해주세요
		// 단 속도가 0 미만이 될 수 없습니다.
		if(speed - CAR_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= CAR_DECREASE_SPD;
		}
		
	}

	@Override
	public void reFuel() {
		// 연료는 다시 채울때마다 30씩 채워줍니다.
		// 연료 최대량은 70L로 간주하고 70으로 설정합니다.
		if(gas + CAR_REFUEL_GAS > CAR_MAX_GAS) {
			gas = CAR_MAX_GAS;
		} else {
			gas += CAR_REFUEL_GAS;
		}
	}

	@Override
	public void showStatus() {
		// 자동차의 속도, 연료량, 차주가 누군지 나오도록 해줍니다.
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료량 : " + gas);
		System.out.println("현재 차주 : " + name);
		System.out.println("-----------------");
	}
	
}
