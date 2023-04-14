package day05_t;

public class ForStarQuiz3_2 {

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i < 5-j) {
					System.out.print(" ");
				}
			}
		}

	}

}
