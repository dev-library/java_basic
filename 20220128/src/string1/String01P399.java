package string1;

public class String01P399 {

	public static void main(String[] args) {
		// String 클래스의 주요 메서드 확인 
		// 1. charAt();
		String greeting = "Hello Java";
		char get = greeting.charAt(6);
		System.out.println(get);
		
		// 자바는 문자열 인덱싱을 허용하지 않습니다.
		//System.out.println(greeting[6]);

	}

}
