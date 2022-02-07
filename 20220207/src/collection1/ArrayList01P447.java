package collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01P447 {

	public static void main(String[] args) {
		// List는 인터페이스이고 구현클래스로 ArrayList와 LinkedList를 받을 수 있고
		// 기본적으로는 ArrayList를 쓰게 됩니다.
		// java.util의 List나 ArrayList를 import해 쓰면 됩니다.
		
		// List는 생성시 List<자료형>을 적어넣어 해당 자료형을
		// 가변 길이 배열형태로 받아줄 수 있습니다.
		// <> 사이에는 기본형자료(int, double, boolean등)은 올 수 없습니다.
		
		// 정수 자료를 받을 수 있는 리스트 생성(길이는 가변적)
		List<Integer> list1 = new ArrayList<>();
		
		// 가변자료형이므로 추가하고 싶은 만큼 자료 추가 가능
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		list1.add(1, 100);// 1번인덱스부터 뒤로 한칸씩 밀어서 빈공간을 만들고 100넣기
		System.out.println(list1);
		list1.set(1, 99);// 1번인덱스에 있는 자료를 99로 교체하겠다.
		System.out.println(list1);
		
	}

}
