import java.util.Scanner;

public class ForQ5_5WhileVer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 변의 너비를 입력해주세요.");
		int count = scan.nextInt();

		int outer = 0;
		while(outer < count) {
			
			int inner = 0;
			while(inner < count) {
				System.out.print("*");
				inner++;
			}
			System.out.println();
			outer++;
		}
		
	}

}
