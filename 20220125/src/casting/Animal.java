package casting;

public class Animal {
	// 이름, 나이를 가집니다.
	private String name;
	private int age;
	
	// 생성자에서는 모두 입력받아 초기화합니다.
					// 동물			3
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// sit()을 실행하면 콘솔창에 "앉습니다." 라고 찍힙니다.
	public void sit() {
		System.out.println("앉습니다.");
	}
	
}
