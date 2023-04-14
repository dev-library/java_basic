package day04_t;

public class ForExample2 {

	public static void main(String[] args) {
		// 반복문을 이용해 100 이하 수 중 7의 배수만 출력하기
		// 1. 0~100까지 돌리고 if문으로 7의 배수인 케이스만 콘솔창에 찍기
		for(int i = 0; i < 101; i++) {
			if(i % 7 == 0 && i != 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("----------------------");
		// 2. 7부터 시작해서 7씩 더하기
		for(int i = 7; i < 101; i += 7) 
			System.out.println(i);
		

	}

}
