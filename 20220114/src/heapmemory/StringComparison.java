package heapmemory;

public class StringComparison {

	public static void main(String[] args) {
		// 문자열은 같은 문자로 저장시 같은 주소를 공유합니다.
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hallo";
		
		// 문자는 배열이긴 한데
		// 수정도 불가능하고 일반적인 인덱싱으로
		// 원하는 글자만 하나하나 뗄 수 없음
		//str1[0] = "j"; 
		
		// 일반 변수의 배정주소값은 .hashCode()를 씁니다.
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		// 단, new키워드를 써서 생성하면
		// 같은 종류의 문자열도
		// 별개의 주소에 저장됩니다.
		String str4 = new String("Hello");
		System.out.println(str4);
		System.out.println(str4.hashCode());
		System.out.println(str1 == str4);

		// 문자열간 비교는(주소말고 내용물간 비교)
		// .equals()를 사용합니다.
		// 대상1.equals(대상2);
		System.out.println(str1.equals(str4));
		
		
	}
}
