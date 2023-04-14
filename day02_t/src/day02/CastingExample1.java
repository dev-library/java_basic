package day02;

public class CastingExample1 {
	
	public static void main(String[] args) {
		/*
		 * 크기가 작은 데이터타입의 데이터를 큰 데이터타입으로
		 * 변환할때는 데이터타입을 자동으로 올려서(promotion/upcasting) 처리합니다.
		 */
		byte b = 10;
		int i = b; // byte -> int로 자동변환.
		
		char c = '가';
		int j = c; // char -> int로 자동변환
		System.out.println(j);
		
		int k = 500;
		double d = k; // int -> double로 자동변환
		System.out.println(d);
	}
	
}
