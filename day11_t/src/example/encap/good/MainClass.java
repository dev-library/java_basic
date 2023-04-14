package example.encap.good;

public class MainClass {

	public static void main(String[] args) {
		MyBirthday mb = new MyBirthday(2025, 16, 99);

		//접근제한자 private이므로 직접수정 불가
		//mb.day = 1026;
		//mb.month = 96;
		//mb.year = 9999;
		
		mb.showDateInfo();
	}
}
