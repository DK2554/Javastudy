package com.vari.casting;

public class CastingTest {
	//실행용 메소드
	public static void main(String[] args) {
		int age=19;
		double height=180.5;
		height=age;
		System.out.println(height);
		//산술연산시에 자료형이 다르면 큰 자료형으로 자동형변환하여 처리함
		System.out.println(age+height);
		//강제적 형변환하기
		//age=(int)age+height;//double
		age=(int)age+(int)height;
		age=age+(int)height;
		age=(int)(age+height);
		age=(int)height;
		
		//char형은 내부에 정수값이 들어가고 그값과 매핑되는 code값으로 문자를 불러오게됨
		int cNum=97;
		char ch=(char)cNum;
		System.out.println(ch);	
		System.out.println((char)(ch+1));
		//11 -> int ->double로 변경
		//11.0
		ch='O';
		cNum=ch;
		System.out.println(cNum);
		System.out.println((char)cNum);
		
		
		
	}
}





