package com.op.test;

public class SingleOperator {
	public static void main(String[] args) {
		//������������ ����ϱ�
		//!�� Ȱ���Ͽ� ���� ���� �� �� �ִ�
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		System.out.println(!!flag);
		//���� ����
		//����������� ������ �� �ִ� ���� 1�� ���ϰų�(++)��(--)����
		//������ �ٽ� �����ϴ°�
		int su=10;
		System.out.println(su);
		//su++;
		//++su;
		System.out.println(su);
		int plus=su+++10;
		System.out.println("su++���� ��:"+su);
		su=10;
		int plus2=++su+10;
		System.out.println(plus);
		System.out.println(plus2);
		int a=10;
		int b=20;
		int c=30;
		a++;
		b=--a+b;
		c=a+++--b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
	}

}
