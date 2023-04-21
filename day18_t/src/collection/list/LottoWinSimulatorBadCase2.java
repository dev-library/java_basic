package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// 기능 분리 없이 구현에만 초점을 맞춘 케이스입니다.
public class LottoWinSimulatorBadCase2 {

	public static void main(String[] args) {
		// 비교를 하기 위해서
		// 1. 당첨 번호 5개를 먼저 뽑고
		// 파워볼 번호를 적재할 컬렉션 생성
		// 제네릭에는 int대신 Integer로 넣어야 함
		List<Integer> powerWinNumbers = new ArrayList<>();
		
		// Random 클래스를 생성해서 난수발생
		Random rn = new Random();
		
		// 번호 5개가 중복 없이 당첨되려면 몇 바퀴를 돌아야 하는지 모르므로 while 문
		while(powerWinNumbers.size() < 5) {
			// 1~70 범위로 난수 발생해 변수에 저장
			Integer thisTimeGetNumber = rn.nextInt(1, 71);
			// 기존에 이미 뽑았던 숫자인지 확인한 후
			if(!powerWinNumbers.contains(thisTimeGetNumber)) {
				// 없는 번호면 적재
				powerWinNumbers.add(thisTimeGetNumber);
			}
		}
		// 번호 정렬
		Collections.sort(powerWinNumbers);
		// 단일추첨 1 ~ 26 범위 하나 더 추가
		Integer powerWinNumber = rn.nextInt(1, 27);
		// 2. 추첨번호 5개 추가로 뽑아서 같은게 나올때까지 비교 -> 추첨 을 반복
		List<Integer> powerTryNumbers = new ArrayList<>();		
		Integer powerTryNumber = 0; 
		// 반복횟수 측정용 변수
		int count = 0;
		
		// 추첨번호와 당첨번호를 비교해서 다르면 반복문 실행, 같으면 종료
		while(!(powerTryNumbers.equals(powerWinNumbers) && 
				powerWinNumber.equals(powerTryNumber))) {
			count++;
			// 번호가 찬 채로 반복문이 진행되므로, 다시 비워야함.
			powerTryNumbers.clear();
			while(powerTryNumbers.size() < 5) {
				// 1~70 범위로 난수 발생해 변수에 저장
				Integer thisTimeGetNumber = rn.nextInt(1, 71);
				// 기존에 이미 뽑았던 숫자인지 확인한 후
				if(!powerTryNumbers.contains(thisTimeGetNumber)) {
					// 없는 번호면 적재
					powerTryNumbers.add(thisTimeGetNumber);
				}
			}
			// 1~26도 다시 뽑아야함.
			powerTryNumber = rn.nextInt(1, 27);
			// 번호 정렬
			Collections.sort(powerTryNumbers);
		}
		System.err.println("당신은 " + count + "장의 로또를 사고서야 당첨되었습니다.");
	}
}
