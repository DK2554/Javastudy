package com.kh.practice1.func;
import java.util.Scanner;
public class VariablePractice2 {
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1=sc.nextInt();
		System.out.print("두 분째 정수 : ");
		int num2=sc.nextInt();
		System.out.println("더하기 결과:" +(num1+num2));
		System.out.println("빼기 결과:" +(num1-num2));
		System.out.println("곱하기 결과:" +(num1*num2));
		System.out.println("나눗셈 결과:" +((double)num1/num2));
	}
	
}
