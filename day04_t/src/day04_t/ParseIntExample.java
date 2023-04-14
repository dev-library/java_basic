package day04_t;

public class ParseIntExample {

	public static void main(String[] args) {
		// 문자이지만, 숫자로만 이루어진 문자는 int형으로 교환할 수 있습니다.
		String str = "2002";
		
		// Integer.parseInt(교환할문자);
		int year = Integer.parseInt(str);
		
		System.out.println(year + 1);
		System.out.println(str + 1);
		
		String str2 = "abcd";// 숫자로 바꿀 수 없는 문자
		Integer.parseInt(str2); // 숫자로 교환이 불가능하므로 에러 발생

	}

}
