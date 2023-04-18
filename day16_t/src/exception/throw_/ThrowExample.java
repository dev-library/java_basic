package exception.throw_;

public class ThrowExample {

	public static int calcSum(int n) throws Exception {
		/*
		 * 프로그램이 throw 구문을 만나는 순간 예외를 즉시 발생시키고
		 * 해당 예외를 처리해줄 catch 블록이 있는지 검색합니다.
		 */
		if(n <= 0) {
			throw new Exception();// 예외도 클래스로 정의되기 때문에 인스턴스 생성
		}
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		try {
			int result1 = calcSum(100);
			System.out.println(new StringBuffer("1~100까지의 누적합:")
										.append(result1));
			int result2 = calcSum(-100);
			System.out.println(new StringBuffer("1~-100까지의 누적합:")
										.append(result2));
		}catch(Exception e) {
			e.printStackTrace();
			System.err.println(new StringBuffer("매개값을 양수로 전달해주세요"));
		}

	}

}
