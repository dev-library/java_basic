package day09_t;

public class GarbageCollectorTest {
	
	public int objectNum;//객체 번호
	
	// 생성자(객체가 힙에서 생성되기 직전에 메서드)
	public GarbageCollectorTest(int number) {
		objectNum = number;
		System.out.println(objectNum + "번 객체 생성");
	}
	
	// 소멸자(객체가 힙에서 삭제되기 직전에 실행되는 메서드)
	@Override
	protected void finalize() throws Throwable {
		System.out.println(objectNum + "번 객체가 힙에서 삭제됩니다.");
	}

}
