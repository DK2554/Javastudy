package com.op.test;

public class SingleOperator {

	public static void main(String[] args) {
		//������������ ����ϱ�
		//!�� Ȱ���Ͽ� ���� ������ �� ����
		boolean flag=true;
		System.out.println(flag);
		System.out.println(!flag);
		//!"����� ������".contains("�����")
		//!age>10
		System.out.println(!!flag);
		
		//��������
		//����������� ������ �� �ִ� ���� 1�� ���ϰų�(++) ��(--)����
		//������ �ٽ� �����ϴ� ��
		int su=10;
		//su=10+1;
		//su++;
		//++su;
		int plus=su+++10;//20
		System.out.println("su++���� ��  : "+su);
		su=10;
		int plus2=++su+10;//21
		//su+1;
		System.out.println(su);
		System.out.println(plus);
		System.out.println(plus2);
		
		//
		int a=10;
		int b=20;
		int c=30;
		a++;//== a=a+1;
		b=--a+b;//--a a=a-1
		c=a+++--b;
		//a,b,c����?
		System.out.println("a: "+a+" b : "+b+" c : "+c);
		
		//����, ���ҿ����� �ݺ����̳� Ư������ ������Ű�� �������� ���� ���
//		for(int i=0;i<300;i++) {
//			
//		}
		
	}
	
}



