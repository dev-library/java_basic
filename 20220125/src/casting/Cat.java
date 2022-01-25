package casting;

// Animal을 상속해주세요.
public class Cat extends Animal {

	// 생성자를 이용해 부모쪽에 이름, 나이를 입력받아 전달합니다.
				// 어묵이			1
	public Cat(String name, int age) {
		super(name, age);
	}
	
	// cat 특유의 행동을 하나 메서드로 만들어 콘솔에 XX를 합니다 라고 찍어주세요.
	public void haak() {
		System.out.println("고양이가 하악질을 합니다.");
	}
	
	// sit()은 오버라이딩해서 "고양이가 앉습니다" 라고 콘솔에 찍히게 수정해주세요.
	// Cat 생성 완료시 Dog도 같은 맥락으로 작성해주세요.
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}
	
}
