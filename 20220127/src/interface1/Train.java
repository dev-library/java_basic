package interface1;

// Vehicle을 구현하기 위해 implements를 활용합니다.
public class Train implements Vehicle {
	
	// 속도, 연료량, 기관사명을 선언합니다.
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = MIN_SPD;
		this.gas = TRAIN_MAX_GAS;
		this.name = name;
	}

	@Override
	public void accel() {
		// 가속 처리
		if(speed + TRAIN_INCREASE_SPD > TRAIN_MAX_SPD) {
			speed = TRAIN_MAX_SPD;
		} else {
			speed += TRAIN_INCREASE_SPD;
		}
		// 가속 후 연료 차감
		gas -= TRAIN_DECREASE_GAS;
	}

	@Override
	public void breakSpeed() {
		if(speed - TRAIN_DECREASE_SPD < MIN_SPD) {
			speed = MIN_SPD;
		} else {
			speed -= TRAIN_DECREASE_SPD;
		}
	}

	@Override
	public void reFuel() {
		if(gas + TRAIN_REFUEL_GAS > TRAIN_MAX_GAS) {
			gas = TRAIN_MAX_GAS;
		} else {
			gas += TRAIN_REFUEL_GAS;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료량 : " + gas);
		System.out.println("현재 기관사 : " + name);
		System.out.println("------------------");
	}
}
