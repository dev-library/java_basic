package day02;

public class IntegerExample2 {

	public static void main(String[] args) {
		byte a = 127;
		short b = 32767;
		int c = 2147483647;
		// 2147483648은 int 최대 범위를 넘어서므로 오류가 뜹니다
		// int 최대 범위를 넘어서는 수는 2147483648L 과 같이 뒤에 L을 붙여서
		// long 자료형 매직넘버로 바꿔주셔야 에러가 사라집니다.
		long d = 2147483648L;
		
		System.out.println(d);
		
		// 2진수 저장시에는 매직넘버 앞에 접두어로 0b를 붙입니다.
		int bin = 0b1010;// binary
		System.out.println(bin);
		
		// 8진수 저장시에 정수 앞에 접두어로 0을 붙입니다.
		int oct = 064;// octal
		System.out.println(oct);
		
		// 16진수 저장시에 정수 앞에 접두어로 0x를 붙입니다.
		int hex = 0x3a4c;//hexadecimal
		System.out.println(hex);

	}

}
