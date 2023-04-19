package api.lang.wrapper;

import java.util.Arrays;

public class Wrapping {

	public static void main(String[] args) {
		int a = 100;
		double b = 2.41;
		char c = 'H';
		boolean d = false;
		
		// Wrapping : 기본타입을 참조형 타입으로 만들기
					// 취소선 : deprecated(사용 중지)
		Integer val1 = a;// new Integer(a); // 100;
		Double val2 = b; // 2.41;
		Character val3 = c;// 'H';
		Boolean val4 = d; // false
		Byte val5 = (byte)75;
		
		Object[] arr = {val1, val2, val3, val4, val5};
		System.out.println(Arrays.toString(arr));
		
		// Unwrapping : 래퍼 클래스를 다시 기본형자료로 돌리기
		// .자료형Value() 메서드를 활용
		int i = val1.intValue();
		double j = val2.doubleValue();
		char k = val3.charValue();
		boolean x = val4.booleanValue();
		byte y = val5.byteValue();
		
		

	}

}
