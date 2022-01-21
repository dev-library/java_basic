
public class Method04P204 {

	public static void info() {
		// 만약 내부 실행구문이 추가 입력을 받지 않아도
		// 완성된 구문이라면 굳이 값을 받지 않아도 됩니다.
		System.out.println("123");
		System.out.println("456");
		System.out.println("124");
		System.out.println("784");
	}
	
	public static void main(String[] args) {
		info();
		info();
		info();
		info();
	}
}
