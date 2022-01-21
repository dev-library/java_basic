package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		// 말을 하나 생성해주시고
		// 오버라이드된 메서드들을 하나씩 호출해보세요.
		Horse h1 = new Horse();
		h1.name = "경주마";
		h1.age = 3;
		h1.gender = "수";
		h1.rank = 2;
		h1.howl();
		h1.getInfo();
		
		// 강아지 추가생성
		Dog d1 = new Dog();
		d1.name = "땡칠이";
		d1.age = 10;
		d1.gender = "수";
		d1.use = "경비";
		d1.howl();
		d1.getInfo();
	}
}
