package final2;

public class Main01P276 {

	public static void main(String[] args) {
		// 상수(final static)을 쓰기 위한 조건
		// 1. Country라는 소속을 써줘야 함
		// 2. .상수명 을 적어서 Country에 소속된 상수를 호출함
		
		// 각 나라별 면적을 호출해 콘솔창에 찍어주세요.
		System.out.println(Country.KOREA);
		System.out.println(Country.CANADA);
		System.out.println(Country.CHINA);
		System.out.println(Country.STATES);
		
		// 상수는 이미 자바 기본 클래스 내에서도 활용되고 있으며
		// 대표적으로 Math(수학) 클래스 내의 PI(원주율)을 들 수 있습니다.
		System.out.println(Math.PI);
	}
}
