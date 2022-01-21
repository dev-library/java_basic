import java.util.Scanner;

public class Scanner02P93 {

	public static void main(String[] args) {
		// Scanner 생성을 직접 해 보세요.
		Scanner scan = new Scanner(System.in);
		
		// 문자열은 scan.nextLine(); 으로 입력받습니다.
		System.out.println("이름을 입력해주세요 : ");
		String name = scan.nextLine();

		// 실수는 scan.nextDouble(); 로 입력받습니다.
		System.out.println("키를 입력해주세요 : ");
		double height = scan.nextDouble();
		
		// 하단에 키와 이름을 출력해주세요.
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("가나다" + (59179057 + 1));
	}
}
