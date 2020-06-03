package com.kh.op;
import java.util.Scanner;
public class ResultTest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하시오");
		System.out.print("첫 번째 수 : ");
		int num1=sc.nextInt();
		System.out.print("두 번재 수 : ");
		int num2=sc.nextInt();
		System.out.println("두 수의 더하기"+(num1+num2));
		System.out.println("두 수의 빼기"+(num1-num2));
		System.out.println("두 수의 곱하기"+(num1*num2));
		System.out.println("두 수의 나누기"+((double)num1/num2));
		System.out.println("두 수의 나머지값"+(num1%num2));
	}

}
