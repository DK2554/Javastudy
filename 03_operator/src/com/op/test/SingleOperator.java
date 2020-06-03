package com.op.test;

public class SingleOperator {
	public static void main(String[] args) {
		//논리부정연산자 사용하기
		//!를 활용하여 논리를 부정 할 수 있다
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println(!!flag);
		//증감 연산
		//산술연산으로 변수에 들어가 있는 값을 1을 더하거나(++)뺀(--)다음
		//변수에 다시 저장하는것
		int su=10;
		System.out.println(su);
		//su++;
		//++su;
		System.out.println(su);
		int plus=su+++10;
		System.out.println("su++연산 후:"+su);
		su=10;
		int plus2=++su+10;
		System.out.println(plus);
		System.out.println(plus2);
		int a=10;
		int b=20;
		int c=30;
		a++;
		b=--a+b;
		c=a+++--b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
	}

}
