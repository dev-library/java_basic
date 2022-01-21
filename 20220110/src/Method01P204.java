
public class Method01P204 {
	// method는 자주 사용할 코드를 특정한 이름으로 붙여둔 것입니다.
	// method 내부에는 불완전한 코드가 들어올 수 있습니다.
	// method는 이 불완전한 코드를 완성시킬 자료를 요청할 수 있습니다.
	// mehtod는 실행 결과물을 약속해야 사용할 수 있고,
	// 실행 결과물이 있다면, return문을 이용해 약속된 실행결과물을
	// 호출 위치로 보내줍니다.
	//method는 main외부에 작성합니다.
	public static void add(int a) {
		// void는 결과물 없음을 의미함
		// add라는 이름은 main내부에서 호출해야만 사용이 가능함
		// int a 자료를 호출시에 제공해야 내부 문장을 실행할 수 있음
		System.out.println(a + 1);
	}
	
	public static void main(String[] args) {
		// 메서드 호출은 무조건 메서드명 오른쪽에 소괄호를 붙입니다.
		add(10);//홀딩
	}
}




