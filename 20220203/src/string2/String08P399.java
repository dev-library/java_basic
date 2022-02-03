package string2;

public class String08P399 {

	public static void main(String[] args) {
		// trim()은 공백이 아닌 문자가 시작하기 직전 모든 지점과
		// 공백이 아닌 문자로 끝난 이후 지점의 모든 공백을 제거합니다.
		String str = "                       Hello                   Java              ";
		System.out.println(str.trim());
		System.out.println(str);
		
		// replace()를 이용해서 사이에 있는 공백까지 다 없애서 출력해보세요.
		System.out.println(str.replace(" ", ""));
		
		// .trim()과 .replace()를 이용해 나머지 공백은 다 없애주시고
		// Hello Java만 남겨주세요
		System.out.println(str.replace("  ", "").trim());
	}
}
