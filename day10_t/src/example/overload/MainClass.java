package example.overload;

public class MainClass {

	public static void main(String[] args) {
		OverloadExample oe = new OverloadExample();
		
		oe.input(1);
		oe.input(1, 2);
		oe.input(3.5, "가나다");
		oe.input("하이");
		oe.input("바이", 99.99);
	}

}
