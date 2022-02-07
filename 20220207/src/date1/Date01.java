package date1;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Date01 {

	public static void main(String[] args) {
		// Date는 날짜를 표현하는 클래스로 DB등과 통신할 때
		// Date를 이용해서 날짜자료를 받아오거나 넘겨주는것이 권장됩니다.
		// 사용시 import java.util.Date를 위에 입력해야 쓸 수 있습니다.
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);

		// 표현되는 양식을 바꿀때는 SimpleDateFormat을 활용합니다.
		// import를 추가해야 합니다. 
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-MM");// 소괄호 사이에 양식을 넣어야함
				// 양식은 yyyy는 연도, MM은 월, dd는 일, hh는 시, mm은 분, ss는 초
		String strNow2 = sdf.format(now);// 만들어놓은 Date변수를 sdf양식으로 고쳐서 저장
		System.out.println(strNow2);
		
		// now변수에 들어있는 출력양식을 2022년 02월 07일 aa분 bb분 cc초로 변경해서 콘솔에 찍어주세요.
		// 469페이지에 보면 simpleDateFormat의 문자 템플릿 목록이 있습니다.
		SimpleDateFormat sdf2 =
				new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초, 시간대 : z");
		// 타임존은 z로 표현합니다.
		String strNow3 = sdf2.format(now);
		System.out.println(strNow3);
	}
}
