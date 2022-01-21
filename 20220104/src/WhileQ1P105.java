import java.util.Scanner;

public class WhileQ1P105 {

	public static void main(String[] args) {
		// 스캐너를 이용해서 String num 변수에
		// "문자열 형태인 숫자" 를 입력받게 해 주세요.(scan.nextLine()으로 문자열 입력받기)
		// 이 문자자료 num을 int loop 변수에 Integer.parseInt()로 정수변환해 저장하세요.
		// loop 변수에 입력된 정수 횟수만큼
		// "반복문을 실행합니다." 라는 문장이 콘솔에 출력되도록
		// while문을 작성해주세요.
		
		// 1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		// 2. String num에 숫자를 받는 구문
		System.out.println("숫자를 입력해주세요.");
		String num = scan.nextLine();
		
		// 3. num변수에 저장된 문자열을 정수로 변경해 loop변수에 저장
		int loop = Integer.parseInt(num);
		// 4. 몇 바퀴 돌고 있는지 체크해주는 변수(0으로 시작후 한 바퀴마다 1씩 증가)
		int count = 0;
		// 5. 반복문은 count값(바퀴)가 loop(몇 바퀴 돌 지)와 같아지면 종료
		while(count < loop) {
			count++;// 매 바퀴마다 count에 1을 더해서 한 바퀴씩 카운팅
			System.out.println("반복문을 실행합니다. " + count);// 콘솔에 몇 바퀴 돌고있는지 체크
		}
		// 6. 다 돌고나서 스캐너 종료
		scan.close();
	}
}
