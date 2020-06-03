package com.kh.practice2.func;
import java.util.Scanner;
public class CastingPractice1 {
	public void casting1(){
		Scanner sc=new Scanner(System.in);
		System.out.print("¹®ÀÚ : ");
		char str=sc.next().charAt(0);
		int temp=(int)str;
		System.out.println(str+" unicode :"+temp);
		
		
		
	}
}
