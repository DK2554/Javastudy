package com.kh.practice1.func;
import java.util.Scanner;
public class VariablePractice3 {
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("가로 : ");
		double x = sc.nextDouble();
		System.out.print("세로 : ");
		double y = sc.nextDouble();
		System.out.println("면적 : "+(x*y));
		System.out.println("둘레 : "+((x+y)*2));
		
	}
}
