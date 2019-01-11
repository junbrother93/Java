package github.junbrother93.numberstring;

public class CharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println('생');	// 문자 : 작은 따옴표로 묶어줌
		System.out.println("생활코딩");	// 문자열 : 큰 따옴표로 묶어줌
		// System.out.println('생활코딩');	// 문자열을 문자로 묶어줘서 에러.
		System.out.println("생"); // 문자도 큰 따옴표로 묶으면 문자열이 됨
	
		System.out.println("생활코딩" + "입니다."); // 문자열과 문자열의 결합
		System.out.println("1" + "1");	// 얘는 11
		System.out.println('1' + '1');	// 얘는 왜 98?
										// 문자를 그대로 출력하면 아스키 코드의 번호로 출력
										// 1 은 아스키 코드로 49
										// 따라서 '1' + '1' => 49 + 49 = 98
		System.out.println("\"\'");	// 역 슬래시를 이용하면 따옴표를 표시 가능\
		System.out.println("줄 바꿈은 \\n 을 쓰면 됨.\n줄 바꿈.");
	}

}
