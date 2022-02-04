package arrays1;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		// Arrays.sort(배열); 은 배열 내부 순서를
		// 작은 숫자일수록 0에 가깝게, 큰 숫자일수록 마지막에 가깝게 배치합니다.
		int[] arr = {21, 60, 32, 44, 1, 69, 99, 89, 36};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
