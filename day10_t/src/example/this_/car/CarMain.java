package example.this_.car;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car("테슬라");
		Car yourCar = new Car("모닝");
		
		for(int i = 0; i < 20; i++) {
			myCar.accel();
		}
		myCar.showStatus();
		
		yourCar.accel();
		yourCar.showStatus();
	}
}
