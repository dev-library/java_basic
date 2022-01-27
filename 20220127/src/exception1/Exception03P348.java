package exception1;

import java.util.Scanner;

public class Exception03P348 {

	public static void main(String[] args) {
		// 예외 발생 케이스 3.
		// 클래스 자료형을 생성할 때 new로 힙공간에 저장된 데이터를 제공하지 않은 경우
		Scanner scan= null; // null은 데이터 없음
		scan.nextInt();

	}

}
