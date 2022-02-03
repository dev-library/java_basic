package string2;

public class String04P399 {
	public static void main(String[] args) {
		// .length()는 문자열의 길이를 알 수 있습니다.
		// 정수로 몇 글자인지 알려줍니다.
		String name = "김수한무 거북이와 두루미 삼천갑자 동방삭 치치카포 사리사리센타";
		System.out.println(name.length());
		
		// .replace()는 찾아바꾸기 입니다.
		// .replace("찾을단어", "바꿔줄단어"); 순으로 입력합니다.
		String report = "안녕하세요. 리포트 보고자는 김영수, 김영수 입니다.";
		// .replace()는 return이 String이고, 그냥은 콘솔창에 결과가 안 찍힙니다.
		System.out.println(report.replace("김영수", "채종훈"));
		// .replace()는 시뮬레이션만 하기 때문에 실행해도 실제 문자열이 영구적으로 변하지 않습니다.
		System.out.println(report);
		
		// 바뀐 내역을 저장까지 하고싶다면...
		report = report.replace("김영수", "채종훈");
		System.out.println(report);
	}
}
