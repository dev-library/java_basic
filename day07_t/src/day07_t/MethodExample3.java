package day07_t;

public class MethodExample3 {

	/*
	 * 반환 유형(return type)
	 * 
	 * 1. 반환값은 메서드를 호출한 곳으로 전달해주는 return 구문 우측 값을 의미합니다.
	 * 
	 * 2. 매개 변수는 여러개를 입력받을 수 있지만 반환값은 오로지 하나여야 합니다.
	 * 
	 * 3. return 키워드를 사용해 반환 값을 지정할 수 있습니다.
	 * 
	 * 4. 전달할 반환값의 자료형을 반환 유형이라고 부릅니다.
	 * 
	 * 5. 반환값이 있는 메서드는 호출문 위치에 하나의 값이 전달되기 때문에 
	 *    매직넘버 대신 사용할 수 있습니다.
	 * 
	 * 6. 반환값이 없는 메서드는 void를 기입합니다. 이 때는 return 구문을 쓰지 않아도 됩니다.
	 * 
	 * 7. 모든 메서드는 return을 만나는 순간 즉시 종료됩니다.
	 *    분기가 아닌 return 구문 하단에는 추가 코드를 작성하면 경고가 뜹니다.
	 */
	
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void callMyName(String name) {
		// 문자열도 배열이므로 .length()로 문자개수를 셀 수 있습니다.
		if(name.length() < 2) {
			System.out.println("이름은 최소 2글자 이상 입력해야 합니다.");
			return;
		}
		System.out.println("내 이름은 " + name + " 입니다.");
	}
	
	// 배열 리턴시 자료형에도 배열임을 명시해야 합니다.
	public static int[] totalOperate(int n1, int n2) {
		int[] total = {n1+n2, n1-n2, n1*n2, n1/n2};
		return total;
	}
	
	
	public static void main(String[] args) {
		int result1 = add(3, 5);
		System.out.println(result1);
		// System.out.println(add(3, 5))와 결과 동일
		
		// 리턴자료가 있는 함수는 매직넘버 대신 사용할 수 있다.
		int result2 = add(add(2, 4), add(5, 6));
		System.out.println(result2);
		
		int[] tot = totalOperate(20, 7);
		System.out.println(tot[0]);
		System.out.println(tot[1]);
		System.out.println(tot[2]);
		System.out.println(tot[3]);

		callMyName("김자바");// 반환값이 void이며 return구문 실행 안됨
		callMyName("채");// 반환값이 void이며 return 구문이 실행됨
	}

}
