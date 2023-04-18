package exception.runtime;

public class ArrayIndexExample {

	public static void main(String[] args) {
		int[] arr = {3, 6, 9};
		
		// 있지도 않은 인덱스번호, 그러나 문법은 맞음.
		System.out.println(arr[3]);

	}

}
