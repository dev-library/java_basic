package garbagecollection;

public class Item {
	
	public int num;
	
	// 생성자를 만들어주세요.
	// int n을 받아 num에 대입해줍니다.
	public Item(int n) {
		num = n;
		System.out.println(num + "번 객체 생성.");
	}
	
	// 소멸자 finalize()
	// 생성자는 생성시 반드시 1회 호출되고
	// 소멸자는 소멸시 반드시 1회 호출됩니다.
	protected void finalize() {
		System.out.println(num + "객체 삭제.");
	}
	
}
