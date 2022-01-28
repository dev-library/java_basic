package system1;

public class Exit01P384 {

	public static void main(String[] args) {
		// System.exit()은 break문처럼 실행 즉시
		// 프로그램 자체를 강제로 종료합니다.
		System.out.println("실행중 1");
		System.out.println("실행중 2");
		System.out.println("실행중 3");
		System.out.println("실행중 4");
		// 0 : 정상종료(에러발생X), 0이외 : 비정상종료(에러발생O)
		System.exit(-1);
		System.out.println("실행중 5");
		System.out.println("실행중 6");
	}
}
