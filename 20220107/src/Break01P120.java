
public class Break01P120 {

	public static void main(String[] args) {
		// break문은 반복문 내부에서 실행될 경우 즉시 반복문을 종료시킵니다.
		// break문은 중첩반복문에서 사용시 전체 반복문을 종료시키지 않고
		// break문이 속한 해당 반복문만 종료를 시킵니다.
		int a = 1;
		int[] arr = {9, 8, 7, 6, 1, 2, 3, 4, 5};
		
		for(int num : arr) {
			if(a == num) {
				System.out.println("1이 나와서 종료합니다.");
				break;
			}
			System.out.println("이번 숫자는 " + num + "입니다.");
		}
	}
}
