
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com = 10, 28, 39, 74, 65, 90, 98
		// 수학(math) 평균점수를 내주시되, 합격자 평균만 내주세요.
		// 합격점수는 60점 이상입니다.
		int math[] = {96, 23, 52, 82, 72, 31, 58};
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int com[] = {10, 28, 39, 74, 65, 90, 98};
		
		// 1. 총점 변수와 합격자수 변수 생성
		int mathTotal = 0;
		int mathCount = 0;
		
		// 2. 반복문 실행
		for(int score:math) {
			// 3. 검사해서 60점 미만이면 스킵
			if(score < 60) {
				continue;
			} else {
				// 4. 60점 이상이면 합격자수 1 더해주고, 총점에 합격점수 더해주기
				mathCount += 1;
				mathTotal += score;
			}	
		}
		// 5. 다 돌고 나오면 총점 / 합격자수로 합격자 평균 내기.
		System.out.println("합격자 평균은  : " + (mathTotal / mathCount));
		
		// 1. 총점 변수와 합격자수 변수 생성
		int engTotal = 0;
		int engCount = 0;
		
		// 2. 반복문 실행
		for(int score:eng) {
			// 3. 검사해서 60점 미만이면 스킵
			if(score < 60) {
				continue;
			} else {
				// 4. 60점 이상이면 합격자수 1 더해주고, 총점에 합격점수 더해주기
				engCount += 1;
				engTotal += score;
			}	
		}
		// 5. 다 돌고 나오면 총점 / 합격자수로 합격자 평균 내기.
		System.out.println("합격자 평균은  : " + (engTotal / engCount));
		
		// 1. 총점 변수와 합격자수 변수 생성
		int comTotal = 0;
		int comCount = 0;
		
		// 2. 반복문 실행
		for(int score:com) {
			// 3. 검사해서 60점 미만이면 스킵
			if(score < 60) {
				continue;
			} else {
				// 4. 60점 이상이면 합격자수 1 더해주고, 총점에 합격점수 더해주기
				comCount += 1;
				comTotal += score;
			}	
		}
		// 5. 다 돌고 나오면 총점 / 합격자수로 합격자 평균 내기.
		System.out.println("합격자 평균은  : " + (comTotal / comCount));
	}

}
