package com.op.test;

import java.util.Scanner;

public class LogicOperator {

	public static void main(String[] args) {
		//�������� Ȱ���غ���
		//�ΰ��� �������� �����Ͽ� ����� Ȯ�ΰ���
		//�񱳿����ڸ� �����Ҷ� �����
		//���̰� 19���� ũ��, �̸��� �������̳�?
		Scanner sc=new Scanner(System.in);
		System.out.print("����� ���� : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("����� �̸� : ");
		String name=sc.nextLine();
		
		System.out.println(age>19 && name.equals("������"));
		//19���̻��̰ų� �̸��� �������̸� true;
		System.out.println(age>19 || name.equals("������"));
		
		//����
		System.out.print("���̵� : ");
		String id=sc.nextLine();
		System.out.print("�н����� : ");
		String password=sc.nextLine();
		
		//if(id.equals("admin") && password.equals("1234")) {
		//	System.out.println("�α��� �Ǿ����ϴ�.");
		//	System.out.println("�������Դϴ�.");
		//}
		System.out.println(age>19 || name.equals("������")&&id.equals("admin"));
		
	}
	
	
}
