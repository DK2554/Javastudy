package com.op.test;

public class CompareOperator {

	public static void main(String[] args) {
		//비교연산자 사용하기
		//대소비교 -> 숫자의 크기를 비교
		int su=100;
		int su2=20;
		int su3=20;
		System.out.println(su>su2);//su가 su2보다 크니?
		System.out.println(su2>su);
		System.out.println(su2>=su3);//su2는 su3보다 크거나 같니?
		
		boolean result=su>su2;
		
		//대소 비교 조건문에서 많이 활용!
		//if(su>su2) {
//		if(age>19) {
//			System.out.println("성인이구나!");
//		}
		
		//동등비교
		//==, !=
		System.out.println("==연산 : "+(su2==su3));
		System.out.println("==연산 : "+(su==su2));
		System.out.println("!= 연산 : "+(su!=su2));
		System.out.println("!= 연산: "+(su2!=su3));
		
		//주의할점!!
		//동등비교에서 문자열(String) ==연산으로 비교하면 안됨!
		System.out.println("유병승"=="유병승");
		System.out.println("유병승"==new String("유병승"));
		// String(객체)를 비교할땐 사용하지마!
		//String자료형에 대해 동등비교를 할때는
		//equals()매소드를 사용!
		System.out.println(new String("유병승").equals("유병승"));
		System.out.println("유병승".equals(new String("유병승")));
		String password="1234";
		String checkPassword="1234";
		System.out.println(password.equals(checkPassword));
		//부정연산 !
		System.out.println(!password.equals(checkPassword));
		
		
		//char 단일문자
		//'A', 'C'
		//1. char형은 대소비교가 가능한가???
		//2. char ==으로 동등비교가 가능한가??
		int ch=65;
		char ch1=(char)ch;
		System.out.println((char)ch);
		System.out.println(ch1);
		//char 코드표에 있는 정수형 숫자가 값으로 들어가있음
		//ch1==숫자 => 대소비교가 가능!
		System.out.println(ch1>100);
		ch1='z';
		System.out.println(ch1>100);
		char ch2='z';
		System.out.println(ch1==ch2);
		ch1='A';
		System.out.println(++ch1);
		System.out.println(++ch1);
		System.out.println(++ch1);
		System.out.println(++ch1);
		System.out.println(++ch1);
		System.out.println(++ch1);
		
		System.out.println('z'>ch1);
		
		//boolean test='z'>ch1;
		
		
		
		
		
		
	}
	
}
