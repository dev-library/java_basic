package stringbuilder2;

public class Builder06P408 {

	public static void main(String[] args) {
		// setCharAt()은 문자열에서 입력한 인덱스번호의 문자를
		// 다른 문자로 교체해줍니다.
		// insert()는 뒤로 밀어내 공간을 확보했지만, setCharAt()은
		// 그냥 그 위치의 문자를 덮어씌워버립니다.
		// setCharAt()도 역시 한 번에 한 글자에 대해서만 교체가 가능합니다.
		StringBuilder str = new StringBuilder("abcdefg");
		System.out.println(str);

		// setChatAt(몇 번 인덱스, '뭘로'); 단일문자로 교체대상을 입력합니다.
		// 5번 인덱스를 z으로 바꿔보세요.
		str.setCharAt(5, 'z');
		System.out.println(str);
	}

}
