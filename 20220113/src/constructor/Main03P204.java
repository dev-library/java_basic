package constructor;

public class Main03P204 {

	public static void main(String[] args) {
		// 웹툰 2개를 만들어서 연재 진행 및 완결까지 시켜보세요.
		// 연재 회차는 3~4회로 해주세요.
		Webtoon w1 = new Webtoon("돌아온 럭키짱", "김성모");
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.uploadWebtoon();
		w1.getInfo();
		w1.completeWebtoon();
		w1.getInfo();

		Webtoon w2 = new Webtoon("프로야구생존기", "최훈");
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.uploadWebtoon();
		w2.getInfo();
		w2.completeWebtoon();
		w2.getInfo();

	}
}
