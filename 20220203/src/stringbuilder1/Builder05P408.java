package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 : 반복문을 쓰세요
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		for(int i = 0; i < a.length(); i++) {
			System.out.println("i % 3의 결과 : " + i % 3);
			System.out.println("현재 i의 값 : " + i);
			System.out.println(a);
			System.out.println("-----------------------");
			if(i % 3 == 0) {
				a.deleteCharAt(i);
			}
		}
		System.out.println(a);
	}
}
