package collection2;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01P447 {

	public static void main(String[] args) {
		// LinkedList는 자료의 변경이 빈번할 때 사용하면 성능 향상이 있습니다.
		// 일반적인 상황에서는 ArrayList를 더 많이 쓰고
		// 결과적으로는 양 자료형간 사용법의 차이는 없으므로 로직만 좀 더 설명드리겠습니다.
		List<String> list1 = new LinkedList<>();
		
		list1.add("자바");
		list1.add("JSP");
		list1.add("스프링");
		list1.add("스프링부트");
		System.out.println(list1);
		
		// .remove() 는 두 유형이 있습니다.
		// .remove(번호)를 넣으면 해당 인덱스의 자료가 삭제되고
		// .remove("자료")를 넣으면 번호와 상관없이 자료를 삭제합니다.
		list1.remove(0); //0번인덱스의 "자바"를 삭제합니다.
		System.out.println(list1);
		list1.remove("스프링"); // 자료를 넣는경우는 해당 자료를 번호 상관없이 삭제합니다.
		System.out.println(list1);
		
		// 리스트를 전체적으로 비울때는 .clear()를 사용합니다.
		// 한 번 직접 써서 조회해보세요.
		list1.clear();
		System.out.println(list1);

		// 4개 자료 아무거나 추가하기
		list1.add("망고");
		list1.add("파파야");
		list1.add("망고스틴");
		list1.add("용과");
		
		System.out.println(list1);
		
		// 자료 정렬은 Collections.sort(정렬대상) 입니다.
		Collections.sort(list1);
		System.out.println(list1);
		
	}
}
