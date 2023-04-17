package interface_.example;

public class MainClass {

	public static void main(String[] args) {
		// 인터페이스 자료형 역시 구현체를 다형성 형식으로 받을 수 있습니다.
		RemoteController rc = 
				new RobotCleanerRemoteController("imou", "20만원");
		
		rc.turnOn();
		rc.turnOff();
		rc.showStatus();
		
		rc = new TVRemoteController(50);
		rc.turnOn();
		rc.turnOff();
		rc.showStatus();
	}
}
