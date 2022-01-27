package static2;

public class Main01P276 {

	public static void main(String[] args) {
		// Asean 조원 생성 없이 발표점수를 콘솔에 찍어보세요.
		//System.out.println(Asean.presentationScore);
		System.out.println(Asean.getPresentationScore());
		
		// Asean 조원 4명을 자율적으로 만든 다음, 각 인원의 성적을 조회해주세요.
		Asean a1 = new Asean(19, 30, 17);
		Asean a2 = new Asean(20, 29, 28);
		Asean a3 = new Asean(15, 30, 20);
		Asean a4 = new Asean(20, 30, 30);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
		

	}

}
