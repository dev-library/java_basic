package day06_t;

/*
 * 1. 메서드 정의(선언)이 이루어져야 추후 호출할 수 있습니다.
 * 2. 메서드의 선언은 메서드 내부에서 할 수 없습니다.
 * 	  클래스 내부이면서 다른 메서드 외부에 작성해야 합니다.
 * 3. 메서드 내부에서는 다른 메서드의 호출만 가능합니다.
 * 4. 호출하는 과정중 다른 메서드 내부 지역으로 이동해서 해당 코드를 실행하고
 *    타 메서드 호출이 끝나면 원래 호출했던 그 위치로 복귀합니다.
 */

public class MethodExample1 {

	// 메인 메서드와 함께 존재하는 메서드는 static을 붙여서 생성해야 합니다.
	public static void sayHello() {
		System.out.println("안녕하세요! sayHello 메서드를 호출하셨네요!");
		System.out.println("다음에 또 호출해주세요.");
	}
	
	public static int calcSum(int x) {
		int sum = 0;
		for(int i = 1; i <= x; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static int totalSum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		// 단독 메서드 호출 구문은 아래와 같이 이탤릭체로 표시됩니다. 
		sayHello();
		// 리턴구문은 콘솔창에 출력되는것을 보장하지 않습니다.
		//calcSum(10);//55
		System.out.println(calcSum(10));//55

		totalSum(1, 2);//3

	}

}
