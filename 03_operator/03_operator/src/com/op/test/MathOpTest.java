package com.op.test;

import java.util.Scanner;

public class MathOpTest {

	public static void main(String[] args) {
		//두개의 숫자를 입력받아 그 두수의 +,-,*,/,%를 구하세요(출력하세요!)
		//Scanner import -> Scanner생성 -> nextInt()이용
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		//double dsu=sc.nextDouble();
		System.out.print("정수입력 : ");
		int su2=sc.nextInt();
		System.out.println("더하기연산 + : "+(su+su2));
		System.out.println("빼기 - : "+(su-su2));
		System.out.println("곱하기 * : "+(su*su2));
		System.out.println("나누기 / : "+((double)su/su2));
		System.out.println("나머지 % : "+su%su2);
		
		
		
	}
	
}





