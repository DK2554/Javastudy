package com.kh.practice1.func;
import java.util.Scanner;
public class VariablePractice1 {
	public void practice1(){
		Scanner sc=new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ���:");
		String name=sc.next();
		System.out.print("������ �Է��ϼ���(��/��):");
		char gender=sc.next().charAt(0);
		System.out.print("���̸� �Է��ϼ���:");
		int age=sc.nextInt();
		System.out.print("Ű�� �Է��ϼ���(cm):");
		double height=sc.nextDouble();
		System.out.println("Ű"+height+"cm��"+gender+"�� "+name+"�� �ݰ����ϴ�^^");
	}
	
	

}
