package com.op.test;

public class SingleOperator {

	public static void main(String[] args) {
		//논리부정연산자 사용하기
		//!를 활용하여 논리를 부정할 수 있음
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		//!"서울시 강남구".contains("서울시")
		//!age>10
		System.out.println(!!flag);
		
		//증감연산
		//산술연산으로 변수에 들어가 있는 값에 1을 더하거나(++) 뺀(--)다음
		//변수에 다시 저장하는 것
		int su=10;
		//su=10+1;
		//su++;
		//++su;
		int plus=su+++10;//20
		System.out.println("su++연산 후  : "+su);
		su=10;
		int plus2=++su+10;//21
		//su+1;
		System.out.println(su);
		System.out.println(plus);
		System.out.println(plus2);
		
		//
		int a=10;
		int b=20;
		int c=30;
		a++;//== a=a+1;
		b=--a+b;//--a a=a-1
		c=a+++--b;
		//a,b,c값은?
		System.out.println("a: "+a+" b : "+b+" c : "+c);
		
		//증가, 감소연산은 반복문이나 특정값을 증가시키는 로직에서 많이 사용
//		for(int i=0;i<300;i++) {
//			
//		}
		
	}
	
}



