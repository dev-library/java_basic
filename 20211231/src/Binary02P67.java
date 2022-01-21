
public class Binary02P67 {

	public static void main(String[] args) {
		// 비교 연산자는 크게 대소비교와 단순비교로 나뉩니다.
		// 단순비교는 ==, !=이며 숫자가 아닌 자료형간 비교도 가능합니다.
		// 대소비교는 >, <, >=, <= 이며 숫자끼리만 비교가 가능합니다.
		// 컴퓨터는 비교연산자를 명제로 인식하며
		// 명제의 참(true), 거짓(false)을 판단해 결과로 보여줍니다.
		System.out.println(3 > 5); // 3이 5보다 큽니까? : false 반환
		System.out.println(12 <= 12); // 12가 12보다 작거나 같습니까? : true 반환
		
		System.out.println("a" != "b"); // "a"와 "b"가 다른가? : true 반환
		System.out.println("a" == "a"); // "a"와 "a"가 같은가? : true 반환
		System.out.println(5 != 5.0); // 5.0과 5.0이 다른가? : false 반환 
	}
}
