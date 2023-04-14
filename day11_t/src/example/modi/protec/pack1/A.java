package example.modi.protec.pack1;

public class A {

	/*
	 * protected는 다른 패키지일지라도 양 클래스가 부모 자식관계라면
	 * 제한적으로 접근을 허용해줍니다.
	 */
	
	protected String s;
	
	protected A() {}
	
	protected void method() {}
}
