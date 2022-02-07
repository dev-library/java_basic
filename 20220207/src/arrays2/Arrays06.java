package arrays2;

import java.util.Arrays;

public class Arrays06 {

	public static void main(String[] args) {
		// 유니코드 이후 출현하는 이모지도 역시 
		// 이모지가 아닌 문자와 이모지가 함께 있다면 이모지가 가장 마지막으로 소팅됨
		String[] arr = {"채종훈", "開發者", "🤣😊🤣😊", "태국", "蔡"};
		// 정렬 결과를 직접 확인해보세요.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
