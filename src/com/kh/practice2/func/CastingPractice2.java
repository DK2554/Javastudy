package com.kh.practice2.func;
import java.util.Scanner;
public class CastingPractice2 {
	public void casting2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� : ");
		double num1 = sc.nextDouble();
		System.out.print("���� : ");
		double num2 = sc.nextDouble();
		System.out.print("���� : ");
		double num3 = sc.nextDouble();
		double total=num1+num2+num3;
		double hvg=total/3;
		int ctotal=(int)total;
		int chvg=(int)hvg;
		System.out.println("���� : "+ctotal);
		System.out.println("��� : "+chvg);
		
		
	}
}
