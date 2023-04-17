package abstract_.abs;

public class MainClass {

	public static void main(String[] args) {
		
		// 상속을 전제로 만든 PopupStore는 객체 생성 불가능
		//PopupStore ps = new PopupStore();
		
		PopupStore s = new Store();
		s.orderApple();
		s.orderGrape();
		s.orderOrange();
		
		s.refund();
		
		
	}
	
}
