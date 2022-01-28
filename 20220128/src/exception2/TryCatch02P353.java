package exception2;

public class TryCatch02P353 {

	public static void main(String[] args) {
		// 어제 exception1 패키지 내부의 예외 유형들이 여럿 있었는데
		// 그 중 하나를 골라서 예외가 발생할 수 있는 코드로 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch 블록을 활용합니다.
		// / by 0(0으로 나누기)에 대한 처리는 허용하지 않습니다.
		String[] name = {"김자바", "제이에스피", "박스프링"};
		
		try {
			// 0, 1, 2번인덱스까지 가지는데 3까지 조회하도록 반복문 작성
			//for(int i = 0; i < 4; i++) {
			//	System.out.println(name[i]);
			//}
			// 리스트 내부 요소를 조회할때는 향상된 for문을 쓰는게 좋습니다.
			// 절대 인덱스를 오버할 일이 없습니다.
			for(String n : name) {
				System.out.println(n);
			}
		} catch(Exception e) {
			System.out.println("더 이상 학생이 없는데 인덱스를 계속 돌렸습니다.");
		} finally {
			System.out.println("집계가 끝났습니다.");
		}
	}
}
