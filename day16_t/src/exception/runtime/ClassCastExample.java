package exception.runtime;

// 상속관계 : 부모 Animal을 상속한 자식 Dog, Cat
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class ClassCastExample {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Animal da = d;
		d = (Dog) da;
		// 어제 has - a 영상을 보시면 익명 클래스 설명을 짧게 했습니다.
		System.out.println(new StringBuffer("타입 변환 성공 : Animal -> Dog"));
		
		Animal c = new Cat();
		//Dog d2 = (Dog)c; // Cat은 dog타입으로 변환 불가
		System.out.println(new StringBuffer("타입 변환 성공? : Dog -> Cat"));

	}

}
