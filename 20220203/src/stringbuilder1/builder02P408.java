package stringbuilder1;

public class builder02P408 {

	public static void main(String[] args) {
		// append()는 기존 문자열 뒤에 새로운 문자열을 붙여줍니다.
		// 말 그대로 기존에 존재하는 문자열 뒤에 붙여주기 때문에
		// 문자열의 길이가 연장됩니다.
		StringBuilder a = new StringBuilder("asdf");
		System.out.println(a);
		a.append("qwer");
		System.out.println(a);

	}

}
