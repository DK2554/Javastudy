package com.op.test;
import java.util.Scanner;
public class LogicOperator {
	public static void main(String[] args) {
		//�������� Ȱ���غ���
		//�ΰ��� �������� �����Ͽ� ����� Ȯ��
		//�� �����ڸ� �����Ҷ� �����\
		//���̰� 19���� ũ��,�̸��� �������̸�
		Scanner sc=new Scanner(System.in);
		System.out.print("����� ���̴� : ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("����� �̸��� : ");
		String name=sc.nextLine();
	
		System.out.println(age>19&&name.equals("������"));
	}

}
