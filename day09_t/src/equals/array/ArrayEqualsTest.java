package equals.array;

import java.util.Arrays;

public class ArrayEqualsTest {

	public static void main(String[] args) {
		// 배열은 참조형 변수이기 때문에, 단순 대입시 문제가 발생합니다.
		int[] intArray1 = {1, 2, 3, 4, 5};
		System.out.println("배열1 주소 : " + intArray1);
		System.out.println(Arrays.toString(intArray1));
		System.out.println("-----------------------------");
		// 새로 생성하지 않고, intArray1을 대입받는 intArray2
		// 단순 대입으로 주소를 복사하는 경우를
		// 얕은복사 라고 합니다.
		//int[] intArray2 = intArray1;
		
		// 단순 대입으로 스택에서 주소값만 복사하는게 아닌
		// 힙의 자료를 새로 똑같이 할당하는 복사를
		// 깊은복사 라고 합니다.
		// 변수 뒤에 .clone()을 써서 수행합니다.
		int[] intArray2 = intArray1.clone();
		
		intArray1[0] = 100;
		System.out.println(Arrays.toString(intArray1));
		System.out.println(Arrays.toString(intArray2));
		System.out.println("배열2 주소 : " + intArray2);
		
	}

}
