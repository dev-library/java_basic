package accessmodifier;

public class Dog {// 정의부
	// 강아지의 정보를 자율적으로 3개 더 부여해주세요.
	// String name은 고정입니다.
	private String name; // 이름
	private int weight; // 체중
	private int height; // 신장
	private String color; // 털색깔
	
	
	// 생성자로 강아지 정보를 처리하시되
	// 이름은 무조건 입력받게 해 주세요.
	public Dog(String n) {// String을 n변수에 입력받아
		name = n;// 입력받은 이름을 name에 대입
		weight = 1;
		height = 15;
		color = "흰색";
	}
	
	// 수치 정보값이 변경되는 형태의 메서드 하나를 만들어주세요.
	public void feed() {
		System.out.println(name + "(이/가) 사료를 먹습니다.");
		weight += 1;
		System.out.println("사료를 먹고 체중이 " + weight + "kg이 되었습니다.");
	}
}
