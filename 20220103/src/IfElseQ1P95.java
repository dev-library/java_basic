import java.util.Scanner;

public class IfElseQ1P95 {

	public static void main(String[] args) {
		// 변수 a에 스캐너로 정수값을 입력받도록 만들어주세요.
		// 입력받은 정수가 0이상이면(if로 처리) "0보다 크거나 같습니다."를 콘솔창에
		// 그렇지 않다면(else로 처리) "0보다 작습니다."를 콘솔창에 출력하는 코드를
		// if~else문을 이용해 구현해주세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int a = scan.nextInt();
		
		if(a >= 0) {
			System.out.println("0보다 크거나 같습니다.");
		} else {
			System.out.println("0보다 작습니다.");
		}
		scan.close();
	}
}
