package com.oop2.method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// MethodTest 객체의 calculator메소드를 호춣려면;
		// 1.MethodTest객체를 생성
		MethodTest mt = new MethodTest();
		mt.calculator(1, 3, '+');// 메소드호출 (실행)
		Scanner sc = new Scanner(System.in);
		// System.out.print("정수 1: ");
		// int su1 = sc.nextInt();
		// System.out.print("정수 2: ");
		// int su2 = sc.nextInt();
		// System.out.print("연산자 : ");
		// char op = sc.next().charAt(0);
		// mt.calculator(su1, su2, op);
		// 반환형이 있고 매개변수가 있는 메소드 호출하기

		// return값이 저장되어서 호출된다
		// System.out.println(mt.calculator2(su1,su2,op));
		// 반환형이 있을때 리턴값을 다른 변수에 받아서 처리할수 있음
		// double result=mt.calculator2(su1, su2, op);
		// System.out.println(result);

		// double result=mt.calculator3();
		// System.out.println(result);
		Method2 mt2 = new Method2();
		String str = mt2.plus();
		System.out.println(str);
		int num = mt2.plus2(2, 3);
		System.out.println(num);
		boolean flag = mt2.tandf('A');
		System.out.println(flag);
	}

}
