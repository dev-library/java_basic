package abstract1;

// Parent 상속을 시켜보세요.
public class Child extends Parent {

	// getAge를 오버라이딩해주세요.
	// "부모쪽 나이는 private이라 조회가 안됩니다" 라고 출력해주세요.
	@Override
	public void getAge() {
		System.out.println("부모쪽 나이는 private이라 조회가 안됩니다.");
	}
}
