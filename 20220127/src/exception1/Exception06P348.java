package exception1;

public class Exception06P348 {

	public static void main(String[] args) {
		// 예외 발생 케이스 6.
		// 상속관계에 있는 자료는 부모가 동일하다면 논리적으로는
		// 부모자료형이 어떤 형태로든 자식 자료형을 가질 수 있기 때문에
		// 부모 자료형에서 어떤 자료형으로도 형 변환이 가능하다.
		// 그러나 그것이 반드시 작동됨을 보장하지는 않는다.
		// Object 자료형은 자바 모든 클래스의 부모 클래스이다.
		String str = "3";
		Object obj = str;
		Integer integer = (Integer)obj;

	}

}
