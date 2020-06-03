package com.op.test;

import java.util.Scanner;

public class LogicOperator {

	public static void main(String[] args) {
		//논리연산자 활용해보기
		//두개의 논리연산을 결합하여 결과를 확인가능
		//비교연산자를 연결할때 사용함
		//나이가 19보다 크고, 이름이 유병승이냐?
		Scanner sc=new Scanner(System.in);
		System.out.print("당신의 나이 : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("당신의 이름 : ");
		String name=sc.nextLine();
		
		System.out.println(age>19 && name.equals("유병승"));
		//19살이상이거나 이름이 유병승이면 true;
		System.out.println(age>19 || name.equals("유병승"));
		
		//응용
		System.out.print("아이디 : ");
		String id=sc.nextLine();
		System.out.print("패스워드 : ");
		String password=sc.nextLine();
		
		//if(id.equals("admin") && password.equals("1234")) {
		//	System.out.println("로그인 되었습니다.");
		//	System.out.println("관리자입니다.");
		//}
		System.out.println(age>19 || name.equals("유병승")&&id.equals("admin"));
		
	}
	
	
}
