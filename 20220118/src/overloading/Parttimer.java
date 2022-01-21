package overloading;

public class Parttimer {
	// 파트타이머의 정보
	// 오전여부(afternoon), 시급(pay), 가게명(shopName), 본인이름(name)
	private boolean afternoon; // true면 오후, 아니면 오전
	private int pay; // 시급
	private String shopName; // 가게명
	private String name; // 본인이름
	
	// 생성자 오버로딩은, 생성자도 메서드이니 생성자를 여러 개 오버로딩 형식으로 만드는 것입니다.
	// afternoon, pay, shopName, name을 모두 입력받아 저장해주는 생성자를 만들어주세요.
	// 접근 제한자는 public 입니다.
					// true    5000     배민배달        채3
	public Parttimer(boolean a, int p, String s, String n) {
		// 시급이 9160원 미만이라면 강제로 9160을 집어넣고
		// 아니면 입력받은 금액을 그대로 입력하도록 수정해보세요.
		if(p < 9160) {
			pay = 9160;
		} else {
			pay = p;
		}
		afternoon = a;
		shopName = s;
		name = n;
		// 전달 데이터 확인
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("알바생이름 : " + name);
	}
	
	// 오버로딩은 이름은 같은데 파라미터값의 종류나 개수가 다르면 중복 작성을 허용합니다.
	// afternoon, shopName, name만 입력받는 생성자를 하나 더 중복작성 해주세요
	// pay는 입력받지 않고 바로 최저시급으로 넣습니다.
					// true       빠바        채
	public Parttimer(boolean a, String s, String n) {
		pay = 9160;
		afternoon = a;
		shopName = s;
		name = n;
		System.out.println("알바가 생성되었습니다.");
		System.out.println("오후알바 : " + afternoon);
		System.out.println("시급 : " + pay);
		System.out.println("가게명 : " + shopName);
		System.out.println("알바생이름 : " + name);
	}
	
	
	

}
