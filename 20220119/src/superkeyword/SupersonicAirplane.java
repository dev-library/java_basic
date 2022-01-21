package superkeyword;

// 초음속비행기는 비행기를 상속합ㄴ다.
public class SupersonicAirplane extends Airplane {
	// 초음속비행기도 일반 비행기처럼 속도값만 가집니다.
	// 따라서 변수는 추가로 정의하지 않습니다.
								// 300
	public SupersonicAirplane(int speed) {
		// 부모의 생성자는 상속되지 않습니다.
		// 따라서 자식쪽에서 부모쪽에 전달할 값까지
		// 모두 처리해줘야 합니다.
		// 부모 생성자는 자식쪽에서 호출할때는
		// 이름이 무조건 super();로 고정입니다.
		// 자식 생성자 내에서 부모 생성자 호출이 1순위로 이뤄져야 합니다.
		super(speed);
		System.out.println("현재 초음속 비행기 속도 : " + speed);
	}

	// 초음속 비행은 속도가 900이상, 1300이하인 경우 호출됩니다.
	// 현재 SupersonicAirpane 내부이기 때문에
	// public void fly() 작성시 오버라이딩이 일어나게 되는데
	// 그럼에도 불구하고 일반 비행을 하게 되는 구간인 경우 super.fly()를 호출하면
	// 부모쪽의 fly가 호출됩니다.
	public void fly() {
		// 기본속도 + 500의 결과속도가 900 이하로 판정된 경우
		if(speed + 500 <= 900) {
			super.fly(); // 부모쪽의 fly를 호출함
		} else {
			//속도가 900초과 1300이하인 경우 최대속도는 1300 가속은 500씩
			if(speed + 500 <= 1300) {
				speed += 500;// 속도 + 500이 최대속도인 1300을 넘기지 않으면 500을 다 더해줌
			} else {
				speed = 1300;// 속도 + 500이 최대속도인 1300을 넘기면 1300으로 강제로 고정
			}
			System.out.println("초음속 비행중입니다 : " + speed + "km/h");
		}
	}
}
