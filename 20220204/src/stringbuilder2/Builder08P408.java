package stringbuilder2;

public class Builder08P408 {

	public static void main(String[] args) {
		// reverse()는 문자열을 인덱스 순으로 따졌을때
		// 역순으로 나열해줍니다.
		StringBuilder str = new StringBuilder("가라나마다");
		str.reverse();
		
		System.out.println(str);

	}

}
