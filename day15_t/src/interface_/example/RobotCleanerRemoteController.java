package interface_.example;

public class RobotCleanerRemoteController
				implements RemoteController{

	public String modelName;
	public String price;
	
	// 로봇청소기 생성자
	public RobotCleanerRemoteController(String modelName, String price) {
		this.modelName = modelName;
		this.price = price;
	}
	
	@Override
	public void turnOn() {
		System.out.println("로봇청소기를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("로봇청소기를 끕니다.");
	}

	// 로봇청소기에서는 로봇청소기에 맞는 정보조회
	@Override
	public void showStatus() {
		System.out.println("모델명 : " + this.modelName);
		System.out.println("가격 : " + this.price);		
	}

}
