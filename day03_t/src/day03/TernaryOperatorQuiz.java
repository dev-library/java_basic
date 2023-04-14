package day03;

public class TernaryOperatorQuiz {

	public static void main(String[] args) {
		// 난수 발생 명령어 Math.random()은 호출 위치에 
		// 0보다는 크고 1보다 작은 난수를 가져다둡니다.
		
		int randomNumber = (int)(Math.random() * 10);
		
		// 삼항연산자를 이용해서 난수로 얻은 값이 
		// 7보다 크면 "당첨", 7이하이면 "낙첨" 이라는 문자를 result에 저장하게 해 주세요.
		// 저장된 result는 콘솔창에 결과를 볼 수 있도록 출력해주세요.
		
		String result = (randomNumber > 7 ? "당첨" : "낙첨");
		System.out.println(result);
	
	}

}
