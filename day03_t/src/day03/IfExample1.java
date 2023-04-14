package day03;

public class IfExample1 {

	public static void main(String[] args) {
		// 0 ~ 100까지의 int 난수를 score 변수에 저장해보세요.
		// 아래 문장에 Math.random() * 101을 괄호로 감싸는것과 안감싸는것의 차이가 있습니다.
		// 원인이 무엇인지 직접 도출해보세요.
		int score = (int)(Math.random() * 101);
		
		// if문을 작성해보겠습니다.
		// if(조건식){
		//     실행구문들....;
		// }
		
		if(score >= 60) {
			System.out.println(score);
			System.out.println("당신은 합격했습니다! 축하합니다.");
		} else {
			System.out.println(score);
			System.out.println("당신은 불합격했습니다. 더 열심히 준비해주세요.");
		}
		
	}

}
