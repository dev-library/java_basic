package exception3;

public class Exception03P355 {

	public static void main(String[] args) {
		// 다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을 때
		// 각각 예외유형을 다르게 처리할 때 사용합니다.
		// 이 때 catch구문을 여러번 사용할 수 있습니다.
		int[] number = {1, 2, 3, 4, 5, 0};
		
		// 예외가 발생할지도 모르는 코드부터 try블럭에 넣습니다.
		try {
			for(int i = 0; i < 6; i++) {// ArrayIndexOutOfBoundsException
				System.out.println(number[i]);
			}
			System.out.println("0으로 나누기 시도해보겠습니다.");
			System.out.println(number[4] / number[5]);//ArithmeticException
		} catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다.");
		} catch(ArithmeticException ae) {
			System.out.println("0으로 숫자를 나눌 수 없습니다.");
		} catch(Exception e) {
			//Exception e 는 만능처리구문으로 어떤 예외도 다 일괄처리합니다.
			//만능처리구문은 맨 밑에 깔아줘야 합니다. 그래야 위쪽에서 다른 지정된 예외를
			// 처리해줄 수 있습니다.
			System.out.println("예외가 발생했습니다.");
		} 
	}
}
