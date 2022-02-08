package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로또복권 당첨 시뮬레이터를 만들어주세요.
		// 몇 장을 사야 당첨되는지 확인해보겠습니다.

		
		// 1. 당첨번호 6개를 뽑습니다.
		// Integer를 저장받는 빈 ArrayList 만들기
		List<Integer> lotto = new ArrayList<>();
		
		// 로또번호를 받을 수 있는 변수 생성 후 0으로 초기화
		int getNum = 0;
		
		// while문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록
		while(lotto.size() != 6) {
			// 번호 뽑기
			getNum = (int)(Math.random() * 45) + 1;
			// 번호가 만약 기존에 뽑은 번호 목록에 포함되어있지 않다면
			if(!lotto.contains(getNum)) {
				// 추가하기
				lotto.add(getNum);
			}
		}
		// 다 돌면 정렬하기
		Collections.sort(lotto);
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복회수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사.
		
		// Integer를 저장받는 빈 ArrayList 만들기
		List<Integer> luckyNum = new ArrayList<>();
		// 로또번호를 받을 수 있는 변수 생성 후 0으로 초기화
		int getNum2 = 0;
		
		// 저의경우는 반복문 진입 전에 int count = 0; 을 만들어놓고
		int count = 0;	
		
		
		
		
		
		

		
		// 아래 6개 뽑고 비교하는 부분을 반복문으로 처리해야 합니다.
		// 조건식은 당첨인 경우 탈출로 해주시면 됩니다.
		while(!lotto.equals(luckyNum)) {
			// 6개가 이미 뽑혀있는 상황이라면 당첨번호를 어떻게 해 줘야 할지?
			luckyNum.clear();
			
			// while문 조건은 번호를 담은 ArrayList의 내부 요소 개수가 6이 되면 종료되도록
			while(luckyNum.size() != 6) {
				// 번호 뽑기
				getNum2 = (int)(Math.random() * 45) + 1;
				// 번호가 만약 기존에 뽑은 번호 목록에 포함되어있지 않다면
				if(!luckyNum.contains(getNum2)) {
					// 추가하기
					luckyNum.add(getNum2);
				}
			}
			// 다 돌면 정렬하기
			Collections.sort(luckyNum);
			System.out.println("" + lotto + luckyNum);
			// 모든 로직이 끝난 시점이 번호를 1세트 뽑은 시점임
			// 그러므로 모든 로직이 다 끝나고 마지막에 1 더해줌
			count++;
		}
		// 반복문이 몇 바퀴 돌았는지 카운팅하는 로직을 위에 추가해주세요. 
		// 탈출 후에 콘솔에 최종 횟수만 찍히도록 합니다.
		System.out.println("구매한 로또복권의 개수 : " + count );
	}
}
