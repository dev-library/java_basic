package constructor;

public class Car {
	// 자동차의 상태(속성)를 나타내는 변수들
	public int gas; // 연료량
	public int speed; // 속도
	public String owner; // 차주

	// 생성자 정의
	// 생성자는 리턴타입을 가지지 않고, 클래스명을 그대로 메서드명으로 씁니다.
	// new 키워드로 생성할 때 딱 한 번만 실행됩니다.
	public Car(String o) {
		gas = 100;// 출고시 만땅
		speed = 0;// 출고시 0
		owner = o;
	}
	
	// 현재 연료량, 속도, 차주를 조회하여 콘솔창에 찍어줄 수 있는
	// 메서드를 어제 코드를 참조해 작성해주세요.(계기판 보기)
	public void getInfo() {
		System.out.println("차주 : " + owner + 
				", 연료량 : " + gas +
				", 현재속도 : " + speed);		
	}
	
	// 자동차의 운전기능을 추가해보겠습니다.
	// 운전기능은 accelSpeed() 이며
	// 이 기능은 실행되면 연료를 2 차감하고
	// 속도를 10 증가시킵니다.
	public void accelSpped() {
		gas -= 2;
		speed += 10;
	}
	
	// 자동차의 감속기능을 추가해보겠습니다.
	// breakSpeed() 이며
	// 이 기능은 실행되면 속도를 10 차감합니다.
	public void breakSpeed() {
		speed -= 10;
	}
	
	// 주유기능을 추가해보겠습니다.
	// 주유기능은 reFuel() 이며
	// 이 기능은 실행되면 연료를 50 채워줍니다.
	public void reFuel() {
		gas += 50;
	}
	
	
}





