package exception1;

public class Exception04P348 {

	public static void main(String[] args) {
		// 예외 발생 케이스 4.
		// 특정 배열을 만들었을때 배열 인덱스를 초과해서 입력하는 경우
		int[] arr = new int[5];
		System.out.println(arr[5]);//존재하지 않는(0~4까지만 배정)번호로 조회

	}

}
