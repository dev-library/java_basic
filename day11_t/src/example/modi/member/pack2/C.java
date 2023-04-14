package example.modi.member.pack2;

import example.modi.member.pack1.A;

public class C {

	public C() {
		
		A a = new A();
		
		a.a = 1;// public //어디서나 접근 가능
		//a.b = 2;// default// 패키지가 다르면 접근 불가
		//a.c = 3;// private// 파일 다르면 접근 불가
		
		a.method1(); //public
		//a.method2(); //default
		//a.method3(); //private
	}
}
