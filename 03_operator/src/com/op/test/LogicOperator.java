package com.op.test;
import java.util.Scanner;
public class LogicOperator {
	public static void main(String[] args) {
		//논리연산자 활용해보기
		//두개의 논리연산을 결합하여 결과를 확인
		//비교 연산자를 연결할때 사용함\
		//나이가 19보다 크고,이름이 유병승이면
		Scanner sc=new Scanner(System.in);
		System.out.print("당신의 나이는 : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("당신의 이름은 : ");
		String name=sc.nextLine();
	
		System.out.println(age>19&&name.equals("유병승"));
	}

}
