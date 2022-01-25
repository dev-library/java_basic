package casting;

public class Main02 {

	public static void main(String[] args) {
		// Animal로 Cat을 받아서 생성
		Animal a = new Cat("룰루", 3);
		// a변수와 연결된 heap쪽 자료가 Cat인지 확인
		System.out.println(a instanceof Cat);// a는 Cat을 저장받았음
		
		// a변수와 연결된 heap쪽 자료가 Dog인지 확인
		System.out.println(a instanceof Dog);// a는 Dog를 저장받지 않았음
		
		// a변수와 연결된 heap쪽 자료가 Anima인지 확인
		System.out.println(a instanceof Animal);// a는 Animal을 저장받지 않았으나, Animal이 포함되어 있음.
		
		
	}

}
