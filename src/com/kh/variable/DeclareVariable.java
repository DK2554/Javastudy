package com.kh.variable;

public class DeclareVariable {
	//변수 선언하기
	public static void main(String[] args) {
		//로컬변수(지역변수)
		//논리형 변수 선언
		boolean isBolean;
		//문자형 변수 선언
		char gender;
		
		//문자열 변수 선언
		String name;
		
		//정수형 변수 선언하기
		//4가지
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		//실수
		float fNum;
		double dNum;
		
		//명명규칙알아보기!
		//1. 같은 영역안에 동일한 변수명은 선언할 수 없다!
		//String dNum;
		//2. 변수는 대소문자를 구별한다
		double DNum;
		double dNUm;
		//3. 예약어를 사용할 수없다
		//int public;
		//4. 변수명의 시작은 숫자로 할 수 없다.
		//int 1num;
		int num1;//숫자는 첫글자가 아닌 곳에 사용이 가능
		//5. 특수기호 _, $만 사용이 가능함
		char _gender;
		char $test;
		//char ^^gedner;
		//char ^gedner;
		char gen_der;
		char te$st;
		
		//선언된 변수에 값 대입하기
		//값을 대입을 할때는 대입연산자 '='을 활용하여 값을 변수에 넣는다
		//변수 = 대입된 값(리터럴, 변수)
		
		//논리형에 값넣기
		boolean flag;
		flag=true;
		//flag=0;
		//flag=True;
		flag=false;
		flag=10<9;//나중에 더 자세히~!
		
		//userAge변수 선언하고 값넣기!
		int userAge;
		userAge=19;
		long account;
		account=1000000000;//자동형변환!
		account=1000000000000L;
		
		//실수넣기
		float fnum1;
		fnum1=180.5f;
		double weight;
		weight=65.5;
		
		//문자, 문자열 값 넣기
		char character;
		character='A';
		//a//변수명 의미
		String str="여러분 대입하는건 껌이죠?";
		//character='유병승';
		str="A";
		
		//변수=변수로 값넣기
		String str2=str;
		int testAge=userAge;
		
		//변수의 값 출력하기
		//변수의 값을 출력을 하려면 
		//변수명을 이용하면된다.
		
		System.out.println(str);
		System.out.println(userAge);
		
		//상수
		//상수는 초기값을 대입 후 변경되지 않는 변수를 말함
		//final 예약어를 사용하여 선언을 함
		int studentAge=27;//변수
		studentAge=30;
		final int teacherAge=19;//상수의 선언과 초기화
		//teacherAge=39;
		
		
		//문자열 활용하기
		String msg="기차";
		System.out.println(msg);
		String msg2=new String("기차");
		System.out.println(msg2);
		
		msg="기차"+"칙칙폭폭"+msg2;
		System.out.println(msg);
		System.out.println(msg+"KTX 쓩~~");
		//문자열자료형 + 문자열자료형 => 문자열 결합연산!
		//문자열자료형 + 숫자형 자료형 => 문자열 결합연산!
		//숫자형자료형 + 숫자형자료형 => 더하기 연산!
		msg="기차"+(123+45)+"슝!~!";
		System.out.println(msg);
		msg=""+123+45+"기차"+"슝~!";
		System.out.println(msg);
		
		name="유병승";
		double height=180.5;
		weight=65.5;
		
		System.out.println(name+teacherAge+height+weight);
		
		name="강승윤";
		height=179.0;
		weight=65.4;
		System.out.println(name+" "+teacherAge+" "+height+" "+weight);
		
		
		
		
		
		
		
		
		
		
	}

}
