package string1;

import java.util.Scanner;

public class String03P399 {

	public static void main(String[] args) {
		// Scanner를 통해서 전체 문장을 입력받으세요.
		// 다음으로 문장내에서 찾고싶은 단어를 추가로 입력받으세요.
		// 문장 내에 있는 단어들의 인덱스 번호와, 몇 개가 검출되었는지
		// 출력해주는 코드를 작성해 보세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 문장을 입력해주세요.");
		String sentence = scan.nextLine();
		
		System.out.println("문장 내에서 카운팅할 단어를 입력해주세요.");
		String searchVoca =  scan.nextLine();
		
		// 갯수 카운팅
		int count = 0;
		// 반복문 추가 실행 여부
		boolean bool = true;
		// 마지막으로 발견된 지점
		int fidx = -1;
		while(bool) {
			// fidx가 마지막으로 조회된 지점이므로
			// fidx + 1부터 단어를 찾기 시작해야함
			
			// indexOf를 실행했는데 -1이 나온다면
			// 더 찾을 필요가 없다는 의미임.
			int get = sentence.indexOf(searchVoca, fidx + 1);
			if(get == -1) {
				// get에 -1이 저장된다면 조회할 필요가
				// 없으므로 bool을 false로 바꿔
				// while문을 탈출하게 합니다.
				bool = false;
			}else {
				// 마지막 발견지점 갱신
				fidx = get;
				count++;//글씨 카운트 증가
				System.out.println(get + "번 인덱스에서 " + 
						count + "번째 " + searchVoca + "이(가) 검출되었습니다.");
			}
		}
		System.out.println(searchVoca + "의 총 출현 횟수는" + count + "회입니다.");
	}
}

