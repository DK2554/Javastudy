package com.oop2.method;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// MethodTest ��ü�� calculator�޼ҵ带 ȣ������;
		// 1.MethodTest��ü�� ����
		MethodTest mt = new MethodTest();
		mt.calculator(1, 3, '+');// �޼ҵ�ȣ�� (����)
		Scanner sc = new Scanner(System.in);
		// System.out.print("���� 1: ");
		// int su1 = sc.nextInt();
		// System.out.print("���� 2: ");
		// int su2 = sc.nextInt();
		// System.out.print("������ : ");
		// char op = sc.next().charAt(0);
		// mt.calculator(su1, su2, op);
		// ��ȯ���� �ְ� �Ű������� �ִ� �޼ҵ� ȣ���ϱ�

		// return���� ����Ǿ ȣ��ȴ�
		// System.out.println(mt.calculator2(su1,su2,op));
		// ��ȯ���� ������ ���ϰ��� �ٸ� ������ �޾Ƽ� ó���Ҽ� ����
		// double result=mt.calculator2(su1, su2, op);
		// System.out.println(result);

		// double result=mt.calculator3();
		// System.out.println(result);
		Method2 mt2 = new Method2();
		String str = mt2.plus();
		System.out.println(str);
		int num = mt2.plus2(2, 3);
		System.out.println(num);
		boolean flag = mt2.tandf('A');
		System.out.println(flag);
	}

}
