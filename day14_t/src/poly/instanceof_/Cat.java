package poly.instanceof_;

public class Cat {

	private String name;
	private int age;
	
	// String, int 파라미터로 생성자를 완성시켜주세요.
	// name, age에 자료를 대입해주시면 됩니다.
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void meow() {
		System.out.println("야옹 야옹");
	}
}
