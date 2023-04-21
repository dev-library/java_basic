package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoWinSimulatorGoodCase {
	
	private int count;// 시도 횟수를 조사하는 멤버변수
	
	// 메서드는 기능 하나를 담당해야 합니다.
	// 1~45까지의 난수를 하나 뽑는 용도로 메서드를 작성합니다.
	public List<Integer> getLottoNumbers(){
		List<Integer> lottoNumbers = new ArrayList<>();
		// 중간에서 이제 그냥 난수 추첨해서 저장하면 됨
		Random rn = new Random();
		
		while(lottoNumbers.size() < 6) {
			Integer getNumber = rn.nextInt(1, 46);
			if(!lottoNumbers.contains(getNumber)) {
				lottoNumbers.add(getNumber);
			}
		}
		Collections.sort(lottoNumbers);
		
		return lottoNumbers;
	}
	
	// 카운트값 조회
	public int getCount() {
		return this.count;
	}
	
	// 한 바퀴 돌 때마다 1씩 카운트값 증가
	public void addCount() {
		this.count++;
	}

	// 당첨될때까지 비교반복하는 메서드 
	public void tryWinLoop(List<Integer> winNumbers, 
								List<Integer> getNumbers) {
		while(!winNumbers.equals(getNumbers)) {
			getNumbers = getLottoNumbers();
			addCount();
		}
	}
	

}
