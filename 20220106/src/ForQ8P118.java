
public class ForQ8P118 {

	public static void main(String[] args) {
		// 피라미드형 별을 직어보겠습니다.
		// 아래와 같은 별을 찍을 수 있도록 코드를 작성해주세요.
		//    *
		//   **
		//  ***
		// ****
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 3-i; j++) {// 별 왼쪽에 들어갈 띄어쓰기를 3/2/1/0개 순으로 찍히도록 세팅
				System.out.print(" ");
			}
			
			for(int k = 0; k < i+1; k++) {// 별 개수가 늘어나는 for문을 작성해주세요.
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
