import java.util.Scanner;

public class Scanner01P93 {

	public static void main(String[] args) {
		// 코드 실행 중 특정한 값을 사용자에게 직접 입력받고 싶은경우 스캐너기능을 사용합니다.
		// 아래에 Scanner라고 적은 부분에 마우스를 갖다대고 import를 해주세요.
		// 만약 안 나오면 r 오른쪽에 커서를 두고 ctrl + space를 눌러서 자동완성 시켜줘도 됩니다.
		// java.util 을 골라주시면 됩니다.
		Scanner scan = new Scanner(System.in);
		
		// 정수 하나를 a변수에 입력받기.
		// scan.next~~~() 시리즈는 콘솔에 아무 안내도 나오지 않기 때문에
		// 아래와 같이 안내문장을 추가로 넣어줍니다.
		System.out.println("정수를 입력해주세요.");
		int a = scan.nextInt();

		// 입력받은 정수 콘솔에 찍기
		System.out.println(a);
		
		// scan기능은 다 쓰면 닫아주시면 더 좋습니다.
		scan.close();
	}
}
