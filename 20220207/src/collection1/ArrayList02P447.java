package collection1;

import java.util.*;


public class ArrayList02P447 {

	public static void main(String[] args) {
		// 여러분이 직접 String 자료를 가변저긍로 받을 수 있는
		// ArrayList를 만들어주시고 안쪽에 자료로
		// "사과", "딸기", "망고", "블루베리", "파인애플"을 넣어주세요.
		// 자료가 적재된 ArrayList를 콘솔에 찍어주세요.
		List<String> list1 = new ArrayList<>();
		list1.add("사과");
		list1.add("딸기");
		list1.add("망고");
		list1.add("블루베리");
		list1.add("파인애플");
		System.out.println(list1);
		
		// .contains("자료") 는 리스트 내에 찾는 자료가 있으면 true
		// 없다면 false를 출력해준다.
		System.out.println(list1.contains("사과"));
		System.out.println(list1.contains("복숭아"));
	}

}
