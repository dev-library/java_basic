package heapmemory;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		int[] arr3 = {1, 2, 3, 4, 5};
		// arr1, arr2가 동시에 영향받음
		arr2[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		// 다시 {1, 2, 3, 4, 5}로 돌려놓음
		arr1[0] = 1;
		
		// arr1(arr2)와 arr3의 내용물은
		// 둘 다 {1, 2, 3, 4, 5}로 동일함
	    System.out.println(arr1 == arr3);
	    System.out.println(arr1 == arr2);
	    
	}
}