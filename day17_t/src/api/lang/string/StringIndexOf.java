package api.lang.string;

public class StringIndexOf {

	public static void main(String[] args) {
		// 특정 문자열의 시작 인덱스값을 반환합니다.
		String to = "tomatoes";
		
		// 단일 파라미터로 조회만 할 경우 0번에서 제일 가까운 단어 하나만 조회됩니다.
		System.out.println(to.indexOf("to"));
		
		// 두 번째 파라미터로 조회 시작 파라미터를 지정할 수 있습니다.
		System.out.println(to.indexOf("to", 1));
		
		// 없는단어 조회시 -1이 나옵니다.
		System.out.println(to.indexOf("na"));
	}
}
