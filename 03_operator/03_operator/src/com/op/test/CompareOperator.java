package com.op.test;

public class CompareOperator {

	public static void main(String[] args) {
		//�񱳿����� ����ϱ�
		//��Һ� -> ������ ũ�⸦ ��
		int su=100;
		int su2=20;
		int su3=20;
		System.out.println(su>su2);//su�� su2���� ũ��?
		System.out.println(su2>su);
		System.out.println(su2>=su3);//su2�� su3���� ũ�ų� ����?
		
		boolean result=su>su2;
		
		//��� �� ���ǹ����� ���� Ȱ��!
		//if(su>su2) {
//		if(age>19) {
//			System.out.println("�����̱���!");
//		}
		
		//�����
		//==, !=
		System.out.println("==���� : "+(su2==su3));
		System.out.println("==���� : "+(su==su2));
		System.out.println("!= ���� : "+(su!=su2));
		System.out.println("!= ����: "+(su2!=su3));
		
		//��������!!
		//����񱳿��� ���ڿ�(String) ==�������� ���ϸ� �ȵ�!
		System.out.println("������"=="������");
		System.out.println("������"==new String("������"));
		// String(��ü)�� ���Ҷ� ���������!
		//String�ڷ����� ���� ����񱳸� �Ҷ���
		//equals()�żҵ带 ���!
		System.out.println(new String("������").equals("������"));
		System.out.println("������".equals(new String("������")));
		String password="1234";
		String checkPassword="1234";
		System.out.println(password.equals(checkPassword));
		//�������� !
		System.out.println(!password.equals(checkPassword));
		
		
		//char ���Ϲ���
		//'A', 'C'
		//1. char���� ��Һ񱳰� �����Ѱ�???
		//2. char ==���� ����񱳰� �����Ѱ�??
		int ch=65;
		char ch1=(char)ch;
		System.out.println((char)ch);
		System.out.println(ch1);
		//char �ڵ�ǥ�� �ִ� ������ ���ڰ� ������ ������
		//ch1==���� => ��Һ񱳰� ����!
		System.out.println(ch1>100);
		ch1='z';
		System.out.println(ch1>100);
		char ch2='z';
		System.out.println(ch1==ch2);
		ch1='A';
		System.out.println(++ch1);
		System.out.println(++ch1);
		System.out.println(++ch1);
		System.out.println(++ch1);
		System.out.println(++ch1);
		System.out.println(++ch1);
		
		System.out.println('z'>ch1);
		
		//boolean test='z'>ch1;
		
		
		
		
		
		
	}
	
}
