
public class IfElse01P95 {

	public static void main(String[] args) {
		// if~else 구문은 참일때 실행할 구문과 거짓일때 실행할 구문을 작성합니다.
		// if~else 구문은 한 구문으로 간주되기 때문에 연산횟수를 절약합니다.
		// else문은 if문 없이 단독으로 쓰일 수 없습니다.
		// if문에만 조건식을 작성해야 하고 else문은 조건식을 작성할 필요가 없습니다.
		int a = 15;
		
		if(a == 15) {
			System.out.println("a는 15입니다.");
		} else { 
			System.out.println("a는 15가 아닙니다.");
		}
	}
}
