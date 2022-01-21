
public class DataDoubleP43 {

	public static void main(String[] args) {
		// 실수 표현을 할 때는 float, double 자료형을 씁니다.
		// 기본적으로 대입할 목적으로 숫자를 적으면 double자료형이 부여됩니다.
		// 만약에 float형으로 실수 숫자를 적고 싶다면
		// 숫자 가장 오른쪽에 f라는 알파벳을 추가로 붙여줍니다.
		float a = 1.1f; //좌변의 a변수에 1.1을 그냥 넣으면 에러 발생(f붙여야 자료일치)
		double b = 1.1;
		System.out.println(a);
		System.out.println(b);
		
		// 제대로 표현되지 않는 실수
		// 이진수로 표현되지 않는 실수값이 결과값인 경우는 정확한 값이 나오지 않는 경우도 있습니다.
		double c = 1-(0.1*7);
		System.out.println(c);
		
	}
}
