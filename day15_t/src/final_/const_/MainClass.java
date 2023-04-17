package final_.const_;

public class MainClass {

	public static void main(String[] args) {
		// 상수만 모아둔 클래스 특성상 클래스명이 곧 집합을 대표하는 이름이 됩니다.
		System.out.println(CountrySizes.KOREA_SIZE);
		System.out.println(CountrySizes.STATES_SIZE);
		System.out.println(CountrySizes.THAILAND_SIZE);
		
		// 이를 잘 사용하는 예시는 자바의 Math 클래스가 있습니다.
		System.out.println(Math.PI);

	}

}
