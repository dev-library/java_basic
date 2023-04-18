package exception.throws_;

public class ThrowsExample {

	public static String[] greetings = {"안녕", "니하오", "헬로"};
	
	/*
	 * 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
	 * 예외처리를 메서드 호출지역으로 떠넘기는 방식을 throws라고 합니다.
	 * 메서드 혹은 생성자 호출시 예외처리를 강요하고싶다면 사용합니다.
	 */
	public static void greet(int idx) throws Exception{
		System.out.println(greetings[idx]);
	}
	
	public static void main(String[] args) {
		/*
		 * - throws가 붙어있는 메서드나 생성자 호출시에는
		 *   try블록 내부에서 호출해야 예외처리를 진행해줍니다.
		 */
		
		try {
			greet(3);
		}catch(Exception e) {
			/*
			 * - printStackTrace()는 예외발생 경로를 추적하는
			 *  메세지를 출력해줍니다.
			 * - 주로 개발과정에서 예외의 원인을 찾을때 유용합니다.
			 */
			e.printStackTrace();
		}
		System.out.println("프로그램 정상종료!");

	}

}
