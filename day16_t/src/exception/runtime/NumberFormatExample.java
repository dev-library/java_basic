package exception.runtime;

public class NumberFormatExample {

	public static void main(String[] args) {
		String a = "35";
		String b = "21";
		System.out.println(a + b);
		
		// 장기적으로 더 나은 코드
		//StringBuffer c = new StringBuffer("35").append("21");
		//System.out.println(c);
		
		// Str -> int변환
		// Integer.parseInt("문자열")이 요구문법
		int i = Integer.parseInt(a);
		int j = Integer.parseInt(b);
		System.out.println(i + j);
		
		// parseInt는 문자열내부에 순수한 정수가 들어있어야
		// 변환을 실행하며 정수값이 아니라면 NumberFormatException이
		// 발생합니다.
		
		String str = "hello";
		System.out.println(Integer.parseInt(str));
		
		
	}

}
