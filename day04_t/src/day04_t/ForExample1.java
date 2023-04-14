package day04_t;

public class ForExample1 {

	public static void main(String[] args) {
		int sum = 0;
			// 초기값   조건식   증감값
		for(int i = 0; i < 5; i++) {
			sum += i;// sum에 0, 1, 2, 3, 4를 순차적으로 누적해 더함
		}
		
		System.out.println("0 ~ 4까지의 누적합 : " + sum);
	}

}
