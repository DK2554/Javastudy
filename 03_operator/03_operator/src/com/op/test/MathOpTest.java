package com.op.test;

import java.util.Scanner;

public class MathOpTest {

	public static void main(String[] args) {
		//�ΰ��� ���ڸ� �Է¹޾� �� �μ��� +,-,*,/,%�� ���ϼ���(����ϼ���!)
		//Scanner import -> Scanner���� -> nextInt()�̿�
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է� : ");
		int su=sc.nextInt();
		//double dsu=sc.nextDouble();
		System.out.print("�����Է� : ");
		int su2=sc.nextInt();
		System.out.println("���ϱ⿬�� + : "+(su+su2));
		System.out.println("���� - : "+(su-su2));
		System.out.println("���ϱ� * : "+(su*su2));
		System.out.println("������ / : "+((double)su/su2));
		System.out.println("������ % : "+su%su2);
		
		
		
	}
	
}





