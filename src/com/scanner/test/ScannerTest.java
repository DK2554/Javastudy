package com.scanner.test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		//Ű����� �Է¹��� �� �޾ƿ���
		//Scanner��ü�� �̿��ϸ� �ȴ�.
		//1. java.util.Scanner import��.
		//2. Scanner��ü�� ������. -> ������ ���� ������
		Scanner sc=new Scanner(System.in);
		//3. sc.nextInt(),sc.nextDouble().sc.next(),sc.nextLine()�� 
		//�̿��ؼ� �����͸� �޾ƿ�
		//System.out.println("����� ���̴�?");
		//System.out.print("����� ���̴�?");
		//System.out.println("�Է��� ���̴� "+sc.nextInt());
		
		//�̸�, ����, Ű
		System.out.print("����� ����? ");
		System.out.println("����� ���̴� "+sc.nextInt());
		System.out.print("����� Ű ? " );
		System.out.println("����� Ű�� "+sc.nextDouble());
		//System.out.print("����� �̸� ? ");
		System.out.println("����� �ּ�? ");
		//System.out.println("����� �̸��� "+sc.nextLine());
		//System.out.println("����� �̸��� "+sc.next());

		System.out.println("����� �ּҴ� "+sc.nextLine());
		String address;
		address=sc.nextLine();
		
		//�̸�, ����, Ű, �ּҸ� �Է¹ް� �Է¹��� ����
		//�ѹ��� ����غ�����!
		String name2;
		int age2;
		double height2;
		String address2;
		System.out.print("�̸� : ");
		name2=sc.nextLine();
		System.out.print("���� : ");
		age2=sc.nextInt();
		System.out.print("Ű : ");
		height2=sc.nextDouble();
		sc.nextLine();//���ۺ���(������ó��)
		System.out.print("�ּ� : ");
		address2=sc.nextLine();
		
		System.out.println("===== �Է°�� =====");
		System.out.println("�̸� : "+name2+" ���� : "+age2+" Ű : "
		+height2+" �ּ� : "+address2);
		//committest
		
	}
	
}





