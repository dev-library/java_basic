import java.util.Scanner;

public class If02P93 {

	public static void main(String[] args) {
		// 교재 93페이지의 프로그램 4-1 코드입니다.
		Scanner scan = new Scanner(System.in);
		
		// 변수 선언
		int su;
		
		System.out.println("정수 입력 : ");
		su = scan.nextInt();
		
		// 만약에 if문의 실행문이 단 한줄이라면, {}를 생략해도 작동합니다. 
		if(su > 0) //{
			System.out.println("양수입니다.");
		//}
		
		// 스캐너 사용시 종료직전 .close() 해주는게 좋음.
		scan.close();
	}
}
